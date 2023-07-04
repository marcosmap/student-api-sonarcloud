package com.students.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "USER-MOCK-API", url = "${external.mock.api.base-url}")
public interface JsonPlaceholderClient {
    @GetMapping("/posts")
    List<Post> getAllPosts();
}
