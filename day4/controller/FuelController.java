package com.skcet.day4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day4.model.PetrolBank;
import com.skcet.day4.service.FuelService;

@RestController
public class FuelController {
	@Autowired
	FuelService fser1;
	@PostMapping("/saveFule")
	public PetrolBank saveFuleStationDe( @RequestBody  PetrolBank pb) {
		return fser1.saveDetails(pb);
	}
	@GetMapping("/getFule")
	public List<PetrolBank> getFuelStationDe(){
		return fser1.getDetails();
	}
}
