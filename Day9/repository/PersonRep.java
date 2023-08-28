package com.example.Day9.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Day9.model.PersonModel;

public interface PersonRep extends JpaRepository<PersonModel, Integer> {

}
