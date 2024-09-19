package com.example.gitaction_test.common.Success;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class SuccessResponseDto<T> {

    private HttpStatus status;
    private String msg;
    private T data;

}
