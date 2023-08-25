package com.example.Day6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Day6.model.HotelModel;
import com.example.Day6.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	public HotelService hserv;
	@PostMapping("/saveHotel")
	public HotelModel postHotelInfo(@RequestBody HotelModel sm) {
		return hserv.saveHotel(sm);
	}
	////sorting
	@GetMapping("/sortAsc/{name}")
	public List<HotelModel> sortasc(@PathVariable("name")String name){
		return hserv.sortByAsc(name);
	}
	@GetMapping("/sortDesc/{name}")
	public List<HotelModel> sortdesc(@PathVariable("name")String name){
		return hserv.sortByDesc(name);
	}
	////pagination
	@GetMapping("/pagination/{num}/{size}")
	public List<HotelModel>paginationEx(@PathVariable("num")int num,@PathVariable("size") int size){
		return hserv.pagination(num, size);
	}
	///pagination sort
	@GetMapping("/pagination/{num}/{size}/{name}")
	public List<HotelModel>paginationEx(@PathVariable("num")int num,@PathVariable("size")int size,@PathVariable("name") String name){
		return hserv.paginationAndSorting(num,size,name);
	}
	
	}

