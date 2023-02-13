package com.blueland.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blueland.model.English1;
import com.blueland.repository.English1Repository;

@Service
public class English1ServiceImpl implements English1Service{

	
	private English1Repository english1Repository;
	
	public English1ServiceImpl(English1Repository english1Repository) {
		super();
		this.english1Repository = english1Repository;
	}

	@Override
	public List<English1> getAllEnglish1s() {
		
		return english1Repository.findAll();
	}

	@Override
	public English1 saveEnglish1(English1 english1) {
		
		return english1Repository.save(english1);
	}

	@Override
	public English1 getEnglish1ById(Long id) {
		return english1Repository.findById(id).get();
	}

	@Override
	public English1 updateEnglish1(English1 english1) {
		return english1Repository.save(english1);
	}

	@Override
	public void deleteEnglish1ById(Long id) {
		english1Repository.deleteById(id);
		
	}

	
}
