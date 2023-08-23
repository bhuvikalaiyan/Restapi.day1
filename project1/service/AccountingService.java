package com.skcet.project1.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skcet.project1.model.AccountingApplication;
import com.skcet.project1.repository.AccountingApplicationRep;

@Service
public class AccountingService {
@Autowired
AccountingApplicationRep arep;
public String saveaccount(AccountingApplication a){
	arep.save(a);
	return "Data is saved to database";
}
public List<AccountingApplication> getAccounting(){
	return arep.findAll();
}
public  AccountingApplication updateAccounting (AccountingApplication sm) {
	return arep.saveAndFlush(sm);
}
public String updateinfobyid(int id,AccountingApplication s) {
	arep.saveAndFlush(s);
	if(arep.existsById(id)) {
		return "Updated";
	}
	else {
		return "Enter valid id";
	}
}
public boolean deleteAccountingif(int AccountId) {
	if(arep.existsById(AccountId)) {
		arep.deleteById(AccountId);
		return true;
	}
	return false;
}
public void deleteAccounting(int Account_id) {
	System.out.println("Deleted");
	arep.deleteById(Account_id);
}
public Optional<AccountingApplication> getUserId(int userId){
	Optional<AccountingApplication> Account=arep.findById(userId);
	if(Account.isPresent()) {
		return Account;
	}
	return null;
}
}
