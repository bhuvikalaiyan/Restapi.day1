package com.skcet.day5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day5.model.SchoolModel;
import com.skcet.day5.service.SchoolService;

@RestController
public class SchoolController {
@Autowired
public SchoolService sserv;
@PostMapping("/saveSchool")
public String postSchoolInfo(@RequestBody SchoolModel sm) {
	sserv.saveSchool(sm);
	return "data saved";
}
@GetMapping("/getSchool")
public List<SchoolModel> getSchoolInfo(){
	 return sserv.getSchool();
}
@PutMapping("/updateSchool")
public SchoolModel updateSchoolInfo(@RequestBody SchoolModel sa) {
	return sserv.updateSchool(sa);
	
}
@DeleteMapping("/deleteSchoolif/{id}")
public ResponseEntity<String>deleteSchoolInfo(@PathVariable int id){
	boolean deleted = sserv.deleteSchoolif(id);
	if(deleted) {
		return ResponseEntity.ok("School with id "+id+"deleted successfully");
	}else {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("school with id "+id+"not found");
	}
}
@DeleteMapping("/deleteSchool/{id}")
public String removeSchool(@PathVariable("id") int sid) {
	sserv.deleteSchool(sid);
	return "School with id"+sid+"is deleted";
}
@DeleteMapping("/byReqParm")
public String removeByRequestParm(@RequestParam("id")int id) {
	sserv.deleteSchool(id);
	return "School with id"+id+"is deleted";
}
@GetMapping("/users/{userId}")
public ResponseEntity<?>getUserId(@PathVariable int userId){
	Optional<SchoolModel> School=sserv.getUserId(userId);
	if(School != null) {
		return ResponseEntity.ok(School);
	}
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user not available with ID");
}
}
