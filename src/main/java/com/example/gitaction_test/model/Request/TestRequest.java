package com.example.gitaction_test.model.Request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TestRequest {

    private String name;
    private int age;

}
