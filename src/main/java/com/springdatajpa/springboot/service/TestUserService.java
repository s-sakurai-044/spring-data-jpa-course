package com.springdatajpa.springboot.service;

import com.springdatajpa.springboot.model.TestUser;

import java.util.List;

/**
 * テストユーザ(サンプルプログラム用) サービスインターフェース
 */
public interface TestUserService {
    // 情報をすべて取得
    List<TestUser> getAllTestUser();
    // 個別取得
    TestUser getTestUser(int id);
    // 登録
    void createTestUser(TestUser testUser);
    // 更新
    void updateTestUser(TestUser testUser);
    // 削除
    void deleteTestUser(int id);
}
