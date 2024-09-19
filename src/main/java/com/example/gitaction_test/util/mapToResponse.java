package com.example.gitaction_test.util;

import com.example.gitaction_test.model.Request.TestRequest;
import com.example.gitaction_test.model.TestEntity;

public class mapToResponse {

    public static TestRequest mapToTestEntityResponse(TestEntity test) {
        return TestRequest.builder()
                .name(test.getName())
                .age(test.getAge())
                .build();
    }

}
