package com.example.hybe.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hybe.infra.codegroup.CodeGroupDto;


@Service
public class MemberService {
	@Autowired
	private MemberDao memberDao;
	
	public List<MemberDto> selectList() {
		
		return memberDao.selectList();
	}
	
	public int insert(MemberDto memberDto) {
		return memberDao.insert(memberDto);
	}
	public MemberDto selectOne(MemberDto memberDto) {
		return memberDao.selectOne(memberDto);
	}


}