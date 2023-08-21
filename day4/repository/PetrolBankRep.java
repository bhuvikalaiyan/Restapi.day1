package com.skcet.day4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day4.model.PetrolBank;

public interface PetrolBankRep extends JpaRepository<PetrolBank, Integer> {

}
