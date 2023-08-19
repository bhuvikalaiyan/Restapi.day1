package com.skcet.day1.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Execise3 {
@Value("${var1}")
private String yourFavColor;
@GetMapping("color")
public String getFavColor() {
	return "My Favorite Color is "+yourFavColor;
}
}
