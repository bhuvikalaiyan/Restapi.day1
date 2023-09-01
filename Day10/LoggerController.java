package com.example.Day10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {
Logger logger =  LoggerFactory.getLogger(LoggerController.class);


@GetMapping("/test")
public String hello() {
	logger.trace("A TRACE Message");
logger.debug("A DEBUG Message");
logger.error("A error Message");
logger.info("A INFO Message");
logger.warn("A WARN Message");
return "Hello Scaler";


}

}
