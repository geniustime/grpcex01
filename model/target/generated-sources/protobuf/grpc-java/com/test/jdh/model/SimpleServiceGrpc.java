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
    comments = "Source: Simple.proto")
public final class SimpleServiceGrpc {

  private SimpleServiceGrpc() {}

  public static final String SERVICE_NAME = "com.test.jdh.model.SimpleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.test.jdh.model.Simple.SimpleRequest,
      com.test.jdh.model.Simple.SimpleResponse> getClientSideStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientSideStream",
      requestType = com.test.jdh.model.Simple.SimpleRequest.class,
      responseType = com.test.jdh.model.Simple.SimpleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.test.jdh.model.Simple.SimpleRequest,
      com.test.jdh.model.Simple.SimpleResponse> getClientSideStreamMethod() {
    io.grpc.MethodDescriptor<com.test.jdh.model.Simple.SimpleRequest, com.test.jdh.model.Simple.SimpleResponse> getClientSideStreamMethod;
    if ((getClientSideStreamMethod = SimpleServiceGrpc.getClientSideStreamMethod) == null) {
      synchronized (SimpleServiceGrpc.class) {
        if ((getClientSideStreamMethod = SimpleServiceGrpc.getClientSideStreamMethod) == null) {
          SimpleServiceGrpc.getClientSideStreamMethod = getClientSideStreamMethod =
              io.grpc.MethodDescriptor.<com.test.jdh.model.Simple.SimpleRequest, com.test.jdh.model.Simple.SimpleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClientSideStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.model.Simple.SimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.model.Simple.SimpleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SimpleServiceMethodDescriptorSupplier("ClientSideStream"))
              .build();
        }
      }
    }
    return getClientSideStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.test.jdh.model.Simple.SimpleRequest,
      com.test.jdh.model.Simple.SimpleResponse> getServerSideStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerSideStream",
      requestType = com.test.jdh.model.Simple.SimpleRequest.class,
      responseType = com.test.jdh.model.Simple.SimpleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.test.jdh.model.Simple.SimpleRequest,
      com.test.jdh.model.Simple.SimpleResponse> getServerSideStreamMethod() {
    io.grpc.MethodDescriptor<com.test.jdh.model.Simple.SimpleRequest, com.test.jdh.model.Simple.SimpleResponse> getServerSideStreamMethod;
    if ((getServerSideStreamMethod = SimpleServiceGrpc.getServerSideStreamMethod) == null) {
      synchronized (SimpleServiceGrpc.class) {
        if ((getServerSideStreamMethod = SimpleServiceGrpc.getServerSideStreamMethod) == null) {
          SimpleServiceGrpc.getServerSideStreamMethod = getServerSideStreamMethod =
              io.grpc.MethodDescriptor.<com.test.jdh.model.Simple.SimpleRequest, com.test.jdh.model.Simple.SimpleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerSideStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.model.Simple.SimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.model.Simple.SimpleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SimpleServiceMethodDescriptorSupplier("ServerSideStream"))
              .build();
        }
      }
    }
    return getServerSideStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.test.jdh.model.Simple.SimpleRequest,
      com.test.jdh.model.Simple.SimpleResponse> getSimpleServerToClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimpleServerToClient",
      requestType = com.test.jdh.model.Simple.SimpleRequest.class,
      responseType = com.test.jdh.model.Simple.SimpleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.test.jdh.model.Simple.SimpleRequest,
      com.test.jdh.model.Simple.SimpleResponse> getSimpleServerToClientMethod() {
    io.grpc.MethodDescriptor<com.test.jdh.model.Simple.SimpleRequest, com.test.jdh.model.Simple.SimpleResponse> getSimpleServerToClientMethod;
    if ((getSimpleServerToClientMethod = SimpleServiceGrpc.getSimpleServerToClientMethod) == null) {
      synchronized (SimpleServiceGrpc.class) {
        if ((getSimpleServerToClientMethod = SimpleServiceGrpc.getSimpleServerToClientMethod) == null) {
          SimpleServiceGrpc.getSimpleServerToClientMethod = getSimpleServerToClientMethod =
              io.grpc.MethodDescriptor.<com.test.jdh.model.Simple.SimpleRequest, com.test.jdh.model.Simple.SimpleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SimpleServerToClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.model.Simple.SimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.model.Simple.SimpleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SimpleServiceMethodDescriptorSupplier("SimpleServerToClient"))
              .build();
        }
      }
    }
    return getSimpleServerToClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.test.jdh.model.Simple.SimpleRequest,
      com.test.jdh.model.Simple.SimpleResponse> getBiDirectionalStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BiDirectionalStream",
      requestType = com.test.jdh.model.Simple.SimpleRequest.class,
      responseType = com.test.jdh.model.Simple.SimpleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.test.jdh.model.Simple.SimpleRequest,
      com.test.jdh.model.Simple.SimpleResponse> getBiDirectionalStreamMethod() {
    io.grpc.MethodDescriptor<com.test.jdh.model.Simple.SimpleRequest, com.test.jdh.model.Simple.SimpleResponse> getBiDirectionalStreamMethod;
    if ((getBiDirectionalStreamMethod = SimpleServiceGrpc.getBiDirectionalStreamMethod) == null) {
      synchronized (SimpleServiceGrpc.class) {
        if ((getBiDirectionalStreamMethod = SimpleServiceGrpc.getBiDirectionalStreamMethod) == null) {
          SimpleServiceGrpc.getBiDirectionalStreamMethod = getBiDirectionalStreamMethod =
              io.grpc.MethodDescriptor.<com.test.jdh.model.Simple.SimpleRequest, com.test.jdh.model.Simple.SimpleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BiDirectionalStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.model.Simple.SimpleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.model.Simple.SimpleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SimpleServiceMethodDescriptorSupplier("BiDirectionalStream"))
              .build();
        }
      }
    }
    return getBiDirectionalStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SimpleServiceStub newStub(io.grpc.Channel channel) {
    return new SimpleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SimpleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SimpleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SimpleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SimpleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SimpleServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * client -&gt; server
     * stream client N: server 1 ?         // returns? numbers!
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleRequest> clientSideStream(
        io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getClientSideStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * server -&gt; client?
     * 1:1?
     * </pre>
     */
    public void serverSideStream(com.test.jdh.model.Simple.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getServerSideStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * to client?
     * </pre>
     */
    public void simpleServerToClient(com.test.jdh.model.Simple.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSimpleServerToClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * both side?
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleRequest> biDirectionalStream(
        io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBiDirectionalStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClientSideStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.test.jdh.model.Simple.SimpleRequest,
                com.test.jdh.model.Simple.SimpleResponse>(
                  this, METHODID_CLIENT_SIDE_STREAM)))
          .addMethod(
            getServerSideStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.test.jdh.model.Simple.SimpleRequest,
                com.test.jdh.model.Simple.SimpleResponse>(
                  this, METHODID_SERVER_SIDE_STREAM)))
          .addMethod(
            getSimpleServerToClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.test.jdh.model.Simple.SimpleRequest,
                com.test.jdh.model.Simple.SimpleResponse>(
                  this, METHODID_SIMPLE_SERVER_TO_CLIENT)))
          .addMethod(
            getBiDirectionalStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.test.jdh.model.Simple.SimpleRequest,
                com.test.jdh.model.Simple.SimpleResponse>(
                  this, METHODID_BI_DIRECTIONAL_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class SimpleServiceStub extends io.grpc.stub.AbstractStub<SimpleServiceStub> {
    private SimpleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SimpleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SimpleServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * client -&gt; server
     * stream client N: server 1 ?         // returns? numbers!
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleRequest> clientSideStream(
        io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClientSideStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * server -&gt; client?
     * 1:1?
     * </pre>
     */
    public void serverSideStream(com.test.jdh.model.Simple.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getServerSideStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * to client?
     * </pre>
     */
    public void simpleServerToClient(com.test.jdh.model.Simple.SimpleRequest request,
        io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSimpleServerToClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * both side?
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleRequest> biDirectionalStream(
        io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBiDirectionalStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SimpleServiceBlockingStub extends io.grpc.stub.AbstractStub<SimpleServiceBlockingStub> {
    private SimpleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SimpleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SimpleServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * server -&gt; client?
     * 1:1?
     * </pre>
     */
    public java.util.Iterator<com.test.jdh.model.Simple.SimpleResponse> serverSideStream(
        com.test.jdh.model.Simple.SimpleRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getServerSideStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * to client?
     * </pre>
     */
    public com.test.jdh.model.Simple.SimpleResponse simpleServerToClient(com.test.jdh.model.Simple.SimpleRequest request) {
      return blockingUnaryCall(
          getChannel(), getSimpleServerToClientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SimpleServiceFutureStub extends io.grpc.stub.AbstractStub<SimpleServiceFutureStub> {
    private SimpleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SimpleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SimpleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SimpleServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * to client?
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.jdh.model.Simple.SimpleResponse> simpleServerToClient(
        com.test.jdh.model.Simple.SimpleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSimpleServerToClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SERVER_SIDE_STREAM = 0;
  private static final int METHODID_SIMPLE_SERVER_TO_CLIENT = 1;
  private static final int METHODID_CLIENT_SIDE_STREAM = 2;
  private static final int METHODID_BI_DIRECTIONAL_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SimpleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SimpleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SERVER_SIDE_STREAM:
          serviceImpl.serverSideStream((com.test.jdh.model.Simple.SimpleRequest) request,
              (io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleResponse>) responseObserver);
          break;
        case METHODID_SIMPLE_SERVER_TO_CLIENT:
          serviceImpl.simpleServerToClient((com.test.jdh.model.Simple.SimpleRequest) request,
              (io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleResponse>) responseObserver);
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
        case METHODID_CLIENT_SIDE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientSideStream(
              (io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleResponse>) responseObserver);
        case METHODID_BI_DIRECTIONAL_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biDirectionalStream(
              (io.grpc.stub.StreamObserver<com.test.jdh.model.Simple.SimpleResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SimpleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SimpleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test.jdh.model.Simple.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SimpleService");
    }
  }

  private static final class SimpleServiceFileDescriptorSupplier
      extends SimpleServiceBaseDescriptorSupplier {
    SimpleServiceFileDescriptorSupplier() {}
  }

  private static final class SimpleServiceMethodDescriptorSupplier
      extends SimpleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SimpleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SimpleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SimpleServiceFileDescriptorSupplier())
              .addMethod(getClientSideStreamMethod())
              .addMethod(getServerSideStreamMethod())
              .addMethod(getSimpleServerToClientMethod())
              .addMethod(getBiDirectionalStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
