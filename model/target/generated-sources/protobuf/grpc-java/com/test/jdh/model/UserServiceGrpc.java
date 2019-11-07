package com.test.jdh.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.1)",
    comments = "Source: User.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.test.jdh.model.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.test.jdh.model.User.UserRequest,
      com.test.jdh.model.User.UserDetail> getGetUserDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserDetail",
      requestType = com.test.jdh.model.User.UserRequest.class,
      responseType = com.test.jdh.model.User.UserDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.test.jdh.model.User.UserRequest,
      com.test.jdh.model.User.UserDetail> getGetUserDetailMethod() {
    io.grpc.MethodDescriptor<com.test.jdh.model.User.UserRequest, com.test.jdh.model.User.UserDetail> getGetUserDetailMethod;
    if ((getGetUserDetailMethod = UserServiceGrpc.getGetUserDetailMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserDetailMethod = UserServiceGrpc.getGetUserDetailMethod) == null) {
          UserServiceGrpc.getGetUserDetailMethod = getGetUserDetailMethod =
              io.grpc.MethodDescriptor.<com.test.jdh.model.User.UserRequest, com.test.jdh.model.User.UserDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.model.User.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.model.User.UserDetail.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserDetail"))
              .build();
        }
      }
    }
    return getGetUserDetailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * { } ??
     * </pre>
     */
    public void getUserDetail(com.test.jdh.model.User.UserRequest request,
        io.grpc.stub.StreamObserver<com.test.jdh.model.User.UserDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserDetailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserDetailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.test.jdh.model.User.UserRequest,
                com.test.jdh.model.User.UserDetail>(
                  this, METHODID_GET_USER_DETAIL)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * { } ??
     * </pre>
     */
    public void getUserDetail(com.test.jdh.model.User.UserRequest request,
        io.grpc.stub.StreamObserver<com.test.jdh.model.User.UserDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserDetailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * { } ??
     * </pre>
     */
    public com.test.jdh.model.User.UserDetail getUserDetail(com.test.jdh.model.User.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * { } ??
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.jdh.model.User.UserDetail> getUserDetail(
        com.test.jdh.model.User.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_DETAIL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_DETAIL:
          serviceImpl.getUserDetail((com.test.jdh.model.User.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.test.jdh.model.User.UserDetail>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test.jdh.model.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserDetailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
