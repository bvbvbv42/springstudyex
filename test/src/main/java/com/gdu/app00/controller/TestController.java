package com.gdu.app00.controller;
import java.util.List;

import com.gdu.app00.dto.TestDto;
import com.gdu.app00.service.TestService;

public class TestController {
    private com.gdu.app00.service.TestService TestService;

    public TestController(TestService TestService) {
        this.TestService = TestService;
    }

    public List<TestDto> getAllPosts() {
        return TestService.getAllPosts();
    }

    public TestDto getPostById(int id) {
        return TestService.getPostById(id);
    }

    public void createPost(TestDto post) {
        TestService.createPost(post);
    }
}
