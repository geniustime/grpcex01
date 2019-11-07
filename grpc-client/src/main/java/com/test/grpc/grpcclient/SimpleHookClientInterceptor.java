package com.test.grpc.grpcclient;

import io.grpc.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleHookClientInterceptor implements ClientInterceptor {

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {

        log.info("method : {}, callOpt : {}, channel : {}", methodDescriptor.getType(), callOptions.getCredentials(), channel.authority());

        return channel.newCall(methodDescriptor, callOptions);
    }
}
