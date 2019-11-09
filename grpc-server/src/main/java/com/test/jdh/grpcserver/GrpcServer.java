package com.test.jdh.grpcserver;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class GrpcServer {

    private static final String prop = "grpc.server.port";

    @Value("${grpc.server.port}")
    private Integer port;

    @Autowired
    private UserServiceImpl userServiceImpl;

    private SimpleServiceImpl simpleService = new SimpleServiceImpl();

    private SimpleServerCallHookInterceptor simpleServerCallHookInterceptor = new SimpleServerCallHookInterceptor();

    private Server server;

    // ???
    public void start() throws IOException, InterruptedException{
        if(port == null || port == 0){
            log.error("no server port", prop);
            System.exit(-1);
        }
        server  = ServerBuilder.forPort(port)
                .addService(userServiceImpl)
                .addService(ServerInterceptors.intercept(simpleService, simpleServerCallHookInterceptor))
                .build();

        server.start();

        log.info("/////[SERVER] start server, port : {}", server.getPort());

        Runtime.getRuntime().addShutdownHook(new Thread(GrpcServer.this::stop));
        server.awaitTermination();

    }

    private void stop(){
        server.shutdown();
    }
}
