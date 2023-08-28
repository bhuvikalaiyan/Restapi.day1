package com.example.Day9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Day9.model.PersonModel;
import com.example.Day9.repository.PersonRep;

@RestController
@RequestMapping("/")
public class PersonController {
	@Autowired
	PersonRep srepo;
	@PostMapping()
	public PersonModel saveDetails(@RequestBody PersonModel am) {
		return srepo.save(am);
	}
	@GetMapping()
	public List<PersonModel> getDetails(){
		return srepo.findAll();
	}
	@DeleteMapping("/{id}")
	public String deletePerson(@PathVariable("id") int id) {
		 return "the Id "+id+" is deleted";
	}
	
}
