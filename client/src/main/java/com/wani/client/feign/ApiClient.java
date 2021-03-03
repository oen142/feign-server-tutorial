package com.wani.client.feign;

import com.wani.client.controller.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "api", url = "http://localhost:8081")
public interface ApiClient {

    @GetMapping("/server")
    List<String> findServer();
}
