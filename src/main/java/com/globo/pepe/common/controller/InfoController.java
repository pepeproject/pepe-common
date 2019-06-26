package com.globo.pepe.common.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class InfoController {

    private final ObjectMapper mapper;

    public InfoController(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Value("${build.project}")
    private String buildProject;

    @Value("${build.version}")
    private String buildVersion;

    @Value("${build.timestamp}")
    private String buildTimestamp;

    @GetMapping(value = "/info")
    public JsonNode info() throws IOException {
        String body = String.format("{\"name\":\"%s\", \"version\":\"%s\", \"build\":\"%s\", \"health\":\"WORKING\"}", buildProject, buildVersion, buildTimestamp);
        return mapper.readValue(body, JsonNode.class);
    }

}
