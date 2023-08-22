package com.skcet.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day5.model.SchoolModel;

public interface SchoolRep extends JpaRepository<SchoolModel, Integer>{

}
