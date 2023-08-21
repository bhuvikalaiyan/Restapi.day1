package com.skcet.day4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.day4.model.PetrolBank;
import com.skcet.day4.repository.PetrolBankRep;

@Service
public class FuelService {
	@Autowired
	public PetrolBankRep frepo;
	
	public PetrolBank saveDetails(PetrolBank p)
	{
		return frepo.save(p);
	}
	public List<PetrolBank> getDetails(){
		return frepo.findAll();
	}
}
