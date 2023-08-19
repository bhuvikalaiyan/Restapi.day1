package com.skcet.day1.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Execise2 {
@Value("${var}")
private String studentName;
@GetMapping("blue")
public String GetName() {
	return "Welcome "+studentName;
}
}
