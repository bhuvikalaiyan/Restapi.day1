package com.skcet.project1.controller;

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
import org.springframework.web.bind.annotation.RestController;
import com.skcet.project1.model.AccountingApplication;
import com.skcet.project1.service.AccountingService;

@RestController
public class AccountController {
@Autowired
public AccountingService srepo;
//////////postmapping///////////////
@PostMapping("/saveAccount")
public String postAccountInfo(@RequestBody AccountingApplication aap) {
	srepo.saveaccount(aap);
	return "data saved";
}
/////////getmapping//////////////
@GetMapping("/getAccount")
public List<AccountingApplication> getAccountInfo(){
	 return srepo.getAccounting();
}
/////////putmapping//////////////
@PutMapping("/updateAccount")
public AccountingApplication updateAccountInfo(@RequestBody AccountingApplication sa) {
	return srepo.updateAccounting(sa);
	
}
@PutMapping("updateAccount/{id}")
public String modifybyid(@PathVariable int id,AccountingApplication s) {
	return srepo.updateinfobyid(id, s);
}
/////////deletedmapping/////////////
@DeleteMapping("/deleteAccountif/{id}")
public ResponseEntity<String>deleteAccountInfo(@PathVariable int id){
	boolean deleted = srepo.deleteAccountingif(id);
	if(deleted) {
		return ResponseEntity.ok("Acccount with id "+id+"deleted successfully");
	}else {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Account with id "+id+"not found");
	}
}
@DeleteMapping("/deleteAccount/{id}")
public String removeAccount(@PathVariable("id") int sid) {
	srepo.deleteAccounting(sid);
	return "Account with id"+sid+"is deleted";
}
@DeleteMapping("/byReqParm")
public String removeByRequestParm(@RequestParam("id")int id) {
	srepo.deleteAccounting(id);
	return "Account with id"+id+"is deleted";
}
@GetMapping("/users/{userId}")
public ResponseEntity<?>getUserId(@PathVariable int userId){
	Optional<AccountingApplication> Account=srepo.getUserId(userId);
	if(Account != null) {
		return ResponseEntity.ok(Account);
	}
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user not available with ID");
}
}
