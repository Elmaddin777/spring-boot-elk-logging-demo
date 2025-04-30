package org.demo.elk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/info")
    public String writeInfoLog() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("Writing info log at " + localDateTime);
        return "ok";
    }

    @GetMapping("/warn")
    public String writeWarningLog() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.warn("Writing warning log at " + localDateTime);
        return "ok";
    }

    @GetMapping("/error")
    public String writeErrorLog() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.error("Writing error log at " + localDateTime);
        return "ok";
    }

}
