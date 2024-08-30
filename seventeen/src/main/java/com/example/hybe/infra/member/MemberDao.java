package com.example.hybe.infra.member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {
	
	public List<MemberDto>selectList();
	
	public int insert(MemberDto memberDto);

	
}
