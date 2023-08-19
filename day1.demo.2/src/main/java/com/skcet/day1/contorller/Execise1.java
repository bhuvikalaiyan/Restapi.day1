package com.skcet.day1.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Execise1 {
@GetMapping("welcome")
public String welcome() {
	return "Welcome String BOOt!";
}
}
