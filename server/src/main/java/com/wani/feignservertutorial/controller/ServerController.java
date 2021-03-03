package com.wani.feignservertutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ServerController {

    @GetMapping("/server")
    public List<String> getServer() {
        return Arrays.asList("test", "server", "client");
    }
}
