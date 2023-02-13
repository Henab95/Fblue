package com.blueland.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.blueland.model.Member;

public interface MemberService {
	
	
	List<Member> getAllMembers();
	
	Member saveMember(Member member);
	
	Member getMemberById(Long id);
	
	Member updateMember(Member member);
	
	void deleteMemberById(Long id);
	
	Page<Member> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
