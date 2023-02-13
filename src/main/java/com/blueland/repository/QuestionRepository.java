package com.blueland.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.blueland.model.Question;

public interface QuestionRepository extends JpaRepository <Question, Long>{
	
	
	@Query("SELECT p from Question p WHERE CONCAT(p.rollNo, ' ', p.S1, ' ', p.S2, ' ', p.S3, ' ', p.S4, ' ', p.S5, ' ', p.S6, ' ', p.S7, ' ', p.S8, ' ', p.S9, ' ', p.S10, ' ', p.S11, ' ', p.S12, ' ', p.S13, ' ', p.S14, ' ', p.S15, ' ', p.S16, ' ', p.S17, ' ', p.S18, ' ', p.S19, ' ', p.S20, ' ', p.S21, ' ', p.S22, ' ', p.S23, ' ', p.S24, ' ', p.S25, ' ', p.S26, ' ', p.S27, ' ', p.S28, ' ', p.S29, ' ', p.S30) LIKE %?1%")
	public List<Question> findAll(String keyword);
	public Question findByrollNo(String rollNo);
}
