package com.springdatajpa.springboot.repository;

import com.springdatajpa.springboot.model.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * テストユーザ(サンプルプログラム用) リポジトリインターフェース
 */
@Repository
public interface TestUserRepository extends JpaRepository<TestUser, Integer> {
    TestUser findTestUserById(int id);
}
