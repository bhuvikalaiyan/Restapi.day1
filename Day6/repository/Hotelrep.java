package com.example.Day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Day6.model.HotelModel;

public interface Hotelrep  extends JpaRepository<HotelModel, Integer>{

}
