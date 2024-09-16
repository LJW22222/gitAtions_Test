package com.example.gitaction_test.DB;

import com.example.gitaction_test.model.TestEntity;
import com.example.gitaction_test.repository.TestEntityRepository;
import org.aspectj.lang.annotation.Before;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@SpringBootTest
@Transactional
public class TestDB {

    private TestEntity test;

    @Autowired
    TestEntityRepository testEntityRepository;

    @BeforeEach
    public void createEntity() {
        test = TestEntity.builder()
                .name("Test")
                .age(20)
                .build();
    }

    @Test
    public void insertEntity() {
        testEntityRepository.save(test);

        Optional<TestEntity> test1 = testEntityRepository.findByName("Test");
        Assertions.assertThat(test1).isNotEmpty();

        Assertions.assertThat(test1.get().getName()).isEqualTo("Test");
    }
}
