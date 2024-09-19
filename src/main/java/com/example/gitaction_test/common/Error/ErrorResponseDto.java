package com.example.gitaction_test.common.Error;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.ResponseEntity;

@Data
@Builder
public class ErrorResponseDto {

    private int status;
    private String name;
    private String code;
    private String msg;

    public static ResponseEntity<ErrorResponseDto> toResponseEntity(ErrorCode errorCode) {
        return ResponseEntity
                .status(errorCode.getHttpStatus())
                .body(ErrorResponseDto.builder()
                        .status(errorCode.getHttpStatus().value())
                        .name(errorCode.name())
                        .code(errorCode.getCode())
                        .msg(errorCode.getMsg())
                        .build());
    }

}
