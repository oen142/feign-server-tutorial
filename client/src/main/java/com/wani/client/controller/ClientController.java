package com.wani.client.controller;

import com.wani.client.feign.ApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    private ApiClient apiClient;

    public ClientController(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @GetMapping("/client")
    public ResponseEntity<List<String>> getList() {
        List<String> server = apiClient.findServer();
        return ResponseEntity.ok().body(server);
    }
}
