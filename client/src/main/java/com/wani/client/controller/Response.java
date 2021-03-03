package com.wani.client.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class Response {

    private List<String> servers;

    public Response(List<String> servers) {
        this.servers = servers;
    }
}
