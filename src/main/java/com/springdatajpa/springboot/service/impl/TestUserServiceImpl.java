package com.springdatajpa.springboot.service.impl;

import com.springdatajpa.springboot.model.TestUser;
import com.springdatajpa.springboot.repository.TestUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springdatajpa.springboot.service.TestUserService;

import java.util.List;

/**
 * テストユーザ(サンプルプログラム用) サービスクラス
 */
@Service
public class TestUserServiceImpl implements TestUserService {
    @Autowired
    private TestUserRepository testUsersRepository;

    // 全件取得
    @Override
    public List<TestUser> getAllTestUser() {
        return testUsersRepository.findAll();
    }

    // 個別取得
    @Override
    public TestUser getTestUser(int id) {
        return testUsersRepository.findTestUserById(id);
    }

    // 登録
    @Override
    public void createTestUser(TestUser testUser) {
        testUsersRepository.save(testUser);
    }

    // 更新
    @Override
    public void updateTestUser(TestUser testUser) {
        testUsersRepository.save(testUser);
    }

    // 削除
    @Override
    public void deleteTestUser(int id) {
        testUsersRepository.deleteById(id);
    }


}
