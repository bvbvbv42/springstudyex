package com.gdu.app00.dao;

import java.util.List;

import com.gdu.app00.dto.TestDto;

public interface TestDao {
    List<TestDto> getAllPosts();
    TestDto getPostById(int id);
    void createPost(TestDto post);
}



