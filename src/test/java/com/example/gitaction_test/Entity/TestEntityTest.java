package com.example.gitaction_test.Entity;

import com.example.gitaction_test.model.TestEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestEntityTest {
    private TestEntity test;


    @BeforeEach
    public void createEntity() {
        test = TestEntity.builder()
                .name("Test")
                .age(20)
                .build();
    }

    @Test
    public void setTestEntity() {
        int age = test.getAge();
        String name = test.getName();
        Assertions.assertThat(age).isEqualTo(20);
        Assertions.assertThat(name).isEqualTo("Test");
    }

}
