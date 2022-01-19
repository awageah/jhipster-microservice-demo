package com.jhipster.microservice.demo.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoResource controller
 */
@RestController
@RequestMapping("/api/demo")
public class DemoResource {

    private final Logger log = LoggerFactory.getLogger(DemoResource.class);

    /**
     * GET sayHello
     */
    @GetMapping("/say-hello")
    public String sayHello() {
        return "Hello !";
    }
}
