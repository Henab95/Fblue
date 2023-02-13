package com.blueland.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.blueland.model.Member;
import com.blueland.repository.MemberRepository;
import com.blueland.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	
	private MemberRepository memberRepository;
	
	public MemberServiceImpl(MemberRepository memberRepository) {
		super();
		this.memberRepository = memberRepository;
	}

	@Override
	public List<Member> getAllMembers() {
		
		return memberRepository.findAll();
	}

	@Override
	public Member saveMember(Member member) {
		
		return memberRepository.save(member);
	}

	@Override
	public Member getMemberById(Long id) {
		return memberRepository.findById(id).get();
	}

	@Override
	public Member updateMember(Member member) {
		return memberRepository.save(member);
	}

	@Override
	public void deleteMemberById(Long id) {
	memberRepository.deleteById(id);
		
	}

	@Override
	public Page<Member> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.memberRepository.findAll(pageable);
	}
	
	
	
	
}
	
