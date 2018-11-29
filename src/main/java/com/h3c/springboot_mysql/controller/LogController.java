package com.h3c.springboot_mysql.controller;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private final static Logger LOG = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public Map<String, Object> home() {

            LOG.trace("trace level log");
            LOG.debug("debug level log");
            LOG.info("info level log");
            LOG.warn("warn level log");
            LOG.error("error level log");
        Map<String, Object> result = new HashMap<>();
        result.put("status", "good");
        result.put("name", "abc");
        result.put("password", "abc");
        return result;
    }
}

