package com.gdu.app00.service;

import java.util.List;

import com.gdu.app00.dto.TestDto;

public class TestService {
    private com.gdu.app00.dao.TestDao TestDao;

    public TestService(com.gdu.app00.dao.TestDao TestDao) {
        this.TestDao = TestDao;
    }

    public List<TestDto> getAllPosts() {
        return TestDao.getAllPosts();
    }

    public TestDto getPostById(int id) {
        return TestDao.getPostById(id);
    }

    public void createPost(TestDto post) {
        TestDao.createPost(post);
    }
}

