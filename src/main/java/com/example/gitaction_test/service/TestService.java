package com.example.gitaction_test.service;

import com.example.gitaction_test.common.CustomException;
import com.example.gitaction_test.common.Error.ErrorCode;
import com.example.gitaction_test.common.Success.SuccessResponseDto;
import com.example.gitaction_test.model.Request.TestRequest;
import com.example.gitaction_test.model.TestEntity;
import com.example.gitaction_test.repository.TestEntityRepository;
import com.example.gitaction_test.util.mapToResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestEntityRepository testEntityRepository;


    public SuccessResponseDto<?> findUser(String name) {
        Optional<TestEntity> byName = testEntityRepository.findByName(name);
        byName.orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));
        return SuccessResponseDto.builder()
                .status(HttpStatus.OK)
                .msg("성공적")
                .data(mapToResponse.mapToTestEntityResponse(byName.get()))
                .build();
    }

}
