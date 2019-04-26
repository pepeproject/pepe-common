package com.globo.pepe.common.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthcheckController {

    @GetMapping(value = "/healthcheck")
    public String healthcheck() { return "WORKING"; }
}
