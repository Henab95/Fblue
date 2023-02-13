package com.blueland.service;

import java.util.List;

import com.blueland.model.English1;

public interface English1Service {

	List<English1> getAllEnglish1s();
	
	English1 saveEnglish1(English1 english1);
	
	English1 getEnglish1ById(Long id);
	
	English1 updateEnglish1(English1 english1);
	
	void deleteEnglish1ById(Long id);
}
