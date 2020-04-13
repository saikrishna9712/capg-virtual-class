package com.capg.lab2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.lab2.model.Traniee;
import com.capg.lab2.repository.TranieeRepo;

@Service
public class TranieeService {
	
	@Autowired
	TranieeRepo tranieeRepo;
	
	@Transactional
	public Traniee addTraniee(Traniee traniee) {
		return tranieeRepo.save(traniee);
	}
	
	@Transactional
	public boolean deleteTraniee(int id) {
		Traniee traniee=tranieeRepo.getOne(id);
		tranieeRepo.delete(traniee);
		return true;
	}
	
	@Transactional
	public Traniee updateTraniee(Traniee newTranieeData) {
		Traniee oldTraniee=tranieeRepo.getOne(newTranieeData.getTranieeId());
		oldTraniee.setTranieeName(newTranieeData.getTranieeName());
		oldTraniee.setTranieeDomain(newTranieeData.getTranieeDomain());
		oldTraniee.setTranieeLocation(newTranieeData.getTranieeLocation());
		return oldTraniee;
	}
	
	@Transactional
	public Traniee getTranieeById(int id) {
		return tranieeRepo.getOne(id);
	}
	
	@Transactional
	public List<Traniee> getAllTraniees(){
		return tranieeRepo.findAll();
	}

}
