package com.example.gitaction_test.common;


import com.example.gitaction_test.common.Error.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException{

    ErrorCode errorCode;

}
