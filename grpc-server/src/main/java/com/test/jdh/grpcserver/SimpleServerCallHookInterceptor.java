package com.test.jdh.grpcserver;


import io.grpc.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleServerCallHookInterceptor implements ServerInterceptor {

    // ???
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        Context ctx = Context.current();

        log.info("///// [SimpleServerCallHookInterceptor-interceptCall] ctx : {}, headers : {}, call : {}", ctx.toString(), metadata.toString(), serverCall.toString());

        return Contexts.interceptCall(ctx, serverCall, metadata, serverCallHandler);
    }
}
