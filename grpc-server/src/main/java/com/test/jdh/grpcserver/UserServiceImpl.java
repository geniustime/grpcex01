package com.test.jdh.grpcserver;

import com.test.jdh.model.User;
import com.test.jdh.model.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Slf4j
@Component
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    private static final String SOME_USER_ID = "hello";

    private User.UserDetail generatedUserDetail(){
        return User.UserDetail.newBuilder()
                .setId(SOME_USER_ID)
                .setAddress("SSS")
                .setAge(111)
                .setName("aaa")
                .setPassword("asasas")
                .setSex(User.Sex.MAN)
                .addHobbies("zzzz111")
                .putAuth("role","admin")
                .build();
    }

    @Override
    public void getUserDetail(User.UserRequest request, StreamObserver<User.UserDetail> responseObserver) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Optional<String> req = Optional.ofNullable(request.getId());

        log.info("///// [UserServiceImpl-getUserDetail] Get Request : {}", req.orElse("Null"));

        if(req.isPresent()){
            if(req.get().toUpperCase().equals(SOME_USER_ID.toUpperCase())){
                responseObserver.onNext(generatedUserDetail());
                responseObserver.onCompleted();
            }
        }else{
            responseObserver.onError(new RuntimeException("///// [UserServiceImpl-getUserDetail] Bad wrong request.."));
        }
    }

}
