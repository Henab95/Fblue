package com.blueland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blueland.model.Maths;

public interface MathsRepository extends JpaRepository <Maths, Long>{
	
}
