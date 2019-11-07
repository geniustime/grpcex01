package com.test.jdh.grpcserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

                                            // CommandLineRunner ???
@SpringBootApplication
public class GrpcServerApplication implements CommandLineRunner {

    @Autowired
    private GrpcServer grpcServer;

    public static void main(String[] args) {
        SpringApplication.run(GrpcServerApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        grpcServer.start(); // server start?
    }
}
