package com.example.gitaction_test.common.Error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "ERROR-001", "사용자 없음"),
    USER_EMAIL_NOT_FOUND(HttpStatus.BAD_REQUEST, "ERROR-002", "이메일 없음");


    private final HttpStatus httpStatus;
    private final String code;
    private final String msg;


}
