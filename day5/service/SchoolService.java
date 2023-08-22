package com.skcet.day5.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.skcet.day5.model.SchoolModel;
import com.skcet.day5.repository.SchoolRep;
@Service
public class SchoolService {
@Autowired
public SchoolRep srep;
public String saveSchool(SchoolModel s){
	srep.save(s);
	return "Data is saved to database";
}
public List<SchoolModel> getSchool(){
	return srep.findAll();
}
public SchoolModel updateSchool(SchoolModel sm) {
	return srep.saveAndFlush(sm);
}
public boolean deleteSchoolif(int schoolId) {
	if(srep.existsById(schoolId)) {
		srep.deleteById(schoolId);
		return true;
	}
	return false;
}
public void deleteSchool(int school_id) {
	System.out.println("Deleted");
	srep.deleteById(school_id);
}
public Optional<SchoolModel> getUserId(int userId){
	Optional<SchoolModel> School=srep.findById(userId);
	if(School.isPresent()) {
		return School;
	}
	return null;
}
}
