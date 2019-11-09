package com.test.jdh.grpcserver;

import com.test.jdh.model.Simple;
import com.test.jdh.model.SimpleServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j                                // add model to maven dependency
public class SimpleServiceImpl extends SimpleServiceGrpc.SimpleServiceImplBase {

    private List<Simple.SimpleResponse> generatedStreamData(int size){
        return IntStream.rangeClosed(1, size).boxed().map(x -> Simple.SimpleResponse.newBuilder().setSeq(x).setMessage("///// [SimpleServiceImpl-generatedStreamData] Push message no. "+ x).build()).collect(Collectors.toList());
    }
/*
public interface StreamObserver<V>

Receives notifications from an observable stream of messages.
It is used by both the client stubs and service implementations for sending or receiving stream messages.

void	onCompleted()
Receives a notification of successful stream completion.
void	onError(Throwable t)
Receives a terminating error from the stream.
void	onNext(V value)
Receives a value from the stream.
 */

    // return type?
    @Override
    public StreamObserver<Simple.SimpleRequest> clientSideStream(StreamObserver<Simple.SimpleResponse> responseObserver) {

        // ??
        return new StreamObserver<Simple.SimpleRequest>() {
            long callCount=0;
            long started=System.nanoTime();

            @Override
            public void onNext(Simple.SimpleRequest simpleRequest) {
                callCount++;
                // {} : mapping ??
                log.info("///// [SimpleServiceImpl-clientSideStream-onNext] 추가로 요청 오고 있음 call Count : {}", callCount);
            }

            @Override
            public void onError(Throwable throwable) {
                log.error(throwable.getMessage(), throwable);
            }

            @Override
            public void onCompleted() {
                long finished= TimeUnit.SECONDS.toSeconds(System.nanoTime() - started);
                log.info("///// [SimpleServiceImpl-clientSideStream-onCompleted] finished time : {} , call count : {}", finished, callCount);

                // error
                // ??                                                                                                                                     setSeq?
                responseObserver.onNext(Simple.SimpleResponse.newBuilder().setMessage("///// [StreamObserver-onCompleted] no no ... callCount : " + callCount + "elapsed time : "+finished).setSeq((int) callCount).build());

                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void serverSideStream(Simple.SimpleRequest request, StreamObserver<Simple.SimpleResponse> responseObserver) {

        generatedStreamData(10).forEach(x -> {
            log.info("///// [SimpleServiceImpl-serverSideStream] push to client");
            responseObserver.onNext(x);
        });
        log.info("///// [StreamObserver] done!");
        responseObserver.onCompleted();
    }

    // ???
    @Override
    public void simpleServerToClient(Simple.SimpleRequest request, StreamObserver<Simple.SimpleResponse> responseObserver) {

        Optional<Simple.SimpleResponse> res = generatedStreamData(1).stream().reduce((x1,x2) -> Simple.SimpleResponse
                .newBuilder()
                .setMessage(x1.getMessage() + x2.getMessage())
                .setSeq(1)
                .build());

        res.ifPresent(responseObserver::onNext);

        responseObserver.onCompleted();
    }

    // return type ?
    @Override
    public StreamObserver<Simple.SimpleRequest> biDirectionalStream(StreamObserver<Simple.SimpleResponse> responseObserver) {

        return new StreamObserver<Simple.SimpleRequest>() {
            @Override
            public void onNext(Simple.SimpleRequest simpleRequest) {
                int seq = simpleRequest.getSeq();
                if(seq % 2 == 0){
                    log.info("///// [SimpleServiceImpl-biDirectionalStream-onNext] 양방향 2번 보냄, 요청한 정보 {}", simpleRequest.getSeq());
                    responseObserver.onNext(Simple.SimpleResponse.newBuilder().setSeq(seq).setMessage("1번!!!!! " + seq + ", message").build());
                    responseObserver.onNext(Simple.SimpleResponse.newBuilder().setSeq(seq).setMessage("2번!!!!! " + seq + ", message").build());
                }else{
                    log.info("///// [SimpleServiceImpl-biDirectionalStream-onNext] 양방향 1번 보냄, 요청한 정보 {}", simpleRequest.getSeq());
                    responseObserver.onNext(Simple.SimpleResponse.newBuilder().setSeq(seq).setMessage("전송" + seq + ", message").build());
                }
            }

            @Override
            public void onError(Throwable throwable) {
                log.error(throwable.getMessage(),throwable);
            }

            @Override
            public void onCompleted() {
                log.info("///// [SimpleServiceImpl-biDirectionalStream-onCompleted] 양방향 서버 종료");
                responseObserver.onCompleted();
            }
        };
    }
}
