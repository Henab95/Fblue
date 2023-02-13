package com.blueland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blueland.model.Member;


public interface MemberRepository extends JpaRepository <Member, Long>{
	
	
	
}