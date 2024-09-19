package com.example.gitaction_test.common;

import com.example.gitaction_test.common.Error.ErrorResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    protected ResponseEntity<ErrorResponseDto> customException(CustomException customException) {
        return ErrorResponseDto.toResponseEntity(customException.getErrorCode());
    }

}
