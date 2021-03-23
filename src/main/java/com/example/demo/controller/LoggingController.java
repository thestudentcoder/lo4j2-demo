package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    Logger logger = LogManager.getLogger(LoggingController.class);

    @RequestMapping("/")
    public String index() {
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message", new Exception("test"));

        return "Howdy! Check out the Logs to see the output...";
    }
}

