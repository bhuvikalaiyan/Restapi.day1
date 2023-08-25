package com.example.Day6.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.Day6.model.HotelModel;
import com.example.Day6.repository.Hotelrep;
@Service
public class HotelService {
	@Autowired
	public Hotelrep hrep;
	public HotelModel saveHotel(HotelModel s){
		return hrep.save(s);
	}
	//sorting
	public List<HotelModel> sortByAsc(String name){
		return hrep.findAll(Sort.by(name).ascending());
	}
	public List<HotelModel> sortByDesc(String name){
		return hrep.findAll(Sort.by(name).descending());
	}
	//pagination
	public List<HotelModel> pagination(int pageNu ,int pageSize){
		Page<HotelModel>cont=hrep.findAll(PageRequest.of(pageNu, pageSize));
		return cont.getContent();
	}
	////paginationand sorting
	public List<HotelModel>paginationAndSorting(int pageNu,int pageSize,String name){
		Page<HotelModel> cont1=hrep.findAll(PageRequest.of(pageNu, pageSize,Sort.by(name)));
		return cont1.getContent();
	}
	}


