package com.test.grpc.grpcclient;

import com.test.jdh.model.Simple;
import com.test.jdh.model.SimpleServiceGrpc;
import com.test.jdh.model.User;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

@Slf4j
@SpringBootApplication
public class GrpcClientApplication implements CommandLineRunner {

    private static final String REQUEST_ID="hello";

    @Value("${grpc.server.ip}")
    private String server;

    @Value("${grpc.server.port}")
    private Integer port;

    public static void main(String[] args) {
        SpringApplication.run(GrpcClientApplication.class, args);
    }

//    ???
    public void callBack(User.UserDetail userDetail){
        log.info("///// [main] received. response info : {}", userDetail);
    }

    @Override
    public void run(String... args) throws Exception {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(server, port)
                .usePlaintext()
                .intercept(new SimpleHookClientInterceptor())
                .build();

        Simple.SimpleRequest simpleRequest = Simple.SimpleRequest.newBuilder()
            .setSeq(1)
            .build();

        // async single ???
        SimpleServiceGrpc.SimpleServiceStub asyncSingle = SimpleServiceGrpc.newStub(channel);
        asyncSingle.simpleServerToClient(simpleRequest, new StreamObserver<Simple.SimpleResponse>() {
            @Override
            public void onNext(Simple.SimpleResponse simpleResponse) {
                log.info("///// [async single] async single : {}", simpleResponse.getMessage());
            }

            @Override
            public void onError(Throwable throwable) {
                log.error(throwable.getMessage(), throwable);
            }

            @Override
            public void onCompleted() {
                log.info("///// [async single] async single done.");
            }
        });


//      async stream???
        SimpleServiceGrpc.SimpleServiceStub async = SimpleServiceGrpc.newStub(channel);
        async.serverSideStream(simpleRequest, new StreamObserver<Simple.SimpleResponse>() {
            @Override
            public void onNext(Simple.SimpleResponse simpleResponse) {
                log.info("///// [async stream] async {} : ", simpleResponse.getMessage());
            }

            @Override
            public void onError(Throwable throwable) {
                log.error(throwable.getMessage(), throwable);
            }

            @Override
            public void onCompleted() {
                log.info("///// [async stream-onCompleted] async received, server call finished.");
                log.info("///// [async stream-onCompleted] async push finished.");
            }
        });

//      blocking single???
        SimpleServiceGrpc.SimpleServiceBlockingStub blockingStub = SimpleServiceGrpc.newBlockingStub(channel);
        Simple.SimpleResponse simpleResponse = blockingStub.simpleServerToClient(simpleRequest);

        log.info("///// [blocking single] sync single message : {}", simpleResponse.getMessage());
        log.info("///// [blocking single] sync single message done.");

//      blocking streams???
        SimpleServiceGrpc.SimpleServiceBlockingStub blockingStream = SimpleServiceGrpc.newBlockingStub(channel);
        Iterator<Simple.SimpleResponse> itr = blockingStream.serverSideStream(simpleRequest);

        while(itr.hasNext()){
            Simple.SimpleResponse response = itr.next();
            log.info("///// [blocking streams] sync message : {}", response.getMessage());
        }
        log.info("///// [blocking streams] sync received, server call finished.");
        log.info("///// [blocking streams] sync push finished.");


//      client side stream???
        SimpleServiceGrpc.SimpleServiceStub simpleServiceStub = SimpleServiceGrpc.newStub(channel);
        StreamObserver<Simple.SimpleRequest> requestStreamObserver = simpleServiceStub.clientSideStream(new StreamObserver<Simple.SimpleResponse>() {
            @Override
            public void onNext(Simple.SimpleResponse simpleResponse) {
                log.info("///// [client side stream-onNext] client side stream!!!!! {} ", simpleResponse.getMessage());
            }

            @Override
            public void onError(Throwable throwable) {
                log.error(throwable.getMessage(), throwable);
            }

            @Override
            public void onCompleted() {
                log.info("///// [client side stream-onCompleted] DDDONE!!!");
            }
        });
        requestStreamObserver.onCompleted();


//      both stream
        SimpleServiceGrpc.SimpleServiceStub serviceStub = SimpleServiceGrpc.newStub(channel);
        StreamObserver<Simple.SimpleRequest> simpleRequestStreamObserver = serviceStub.biDirectionalStream(new StreamObserver<Simple.SimpleResponse>() {
            @Override
            public void onNext(Simple.SimpleResponse simpleResponse) {
                log.info("///// [both stream-onNext] 양방향임 {}", simpleResponse.getMessage());
            }

            @Override
            public void onError(Throwable throwable) {
                log.error(throwable.getMessage(), throwable);
            }

            @Override
            public void onCompleted() {
                log.info("///// [both stream-onCompleted] 양방향 끝");
            }
        });
        simpleRequestStreamObserver.onNext(Simple.SimpleRequest.newBuilder().setSeq(11).build());
        simpleRequestStreamObserver.onNext(Simple.SimpleRequest.newBuilder().setSeq(22).build());
        simpleRequestStreamObserver.onNext(Simple.SimpleRequest.newBuilder().setSeq(33).build());
        simpleRequestStreamObserver.onCompleted();

        // channel closed.
        channel.awaitTermination(20, TimeUnit.SECONDS);
        log.info("///// [channel] CHANNEL TERMINATED!!!!");
    }
}
