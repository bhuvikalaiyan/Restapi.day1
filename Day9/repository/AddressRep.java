package com.example.Day9.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Day9.model.Address;

public interface AddressRep extends JpaRepository<Address, Integer> {

}
