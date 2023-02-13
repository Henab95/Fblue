package com.blueland.service;

import java.util.List;

import com.blueland.model.Maths;

public interface MathsService {

	List<Maths> getAllMathss();
	
	Maths saveMaths(Maths maths);
	
	Maths getMathsById(Long id);
	
	Maths updateMaths(Maths maths);
	
	void deleteMathsById(Long id);
}
