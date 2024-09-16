package com.example.gitaction_test.repository;

import com.example.gitaction_test.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestEntityRepository extends JpaRepository<TestEntity, Long> {

    Optional<TestEntity> findByName(String name);
}
