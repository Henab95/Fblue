package com.blueland.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.blueland.model.Maths;
import com.blueland.repository.MathsRepository;
import com.blueland.service.MathsService;

@Service
public class MathsServiceImpl implements MathsService{

	
	private MathsRepository mathsRepository;
	
	public MathsServiceImpl(MathsRepository mathsRepository) {
		super();
		this.mathsRepository = mathsRepository;
	}

	@Override
	public List<Maths> getAllMathss() {
		
		return mathsRepository.findAll();
	}

	@Override
	public Maths saveMaths(Maths maths) {
		
		return mathsRepository.save(maths);
	}

	@Override
	public Maths getMathsById(Long id) {
		return mathsRepository.findById(id).get();
	}

	@Override
	public Maths updateMaths(Maths maths) {
		return mathsRepository.save(maths);
	}

	@Override
	public void deleteMathsById(Long id) {
		mathsRepository.deleteById(id);
		
	}

	
}
