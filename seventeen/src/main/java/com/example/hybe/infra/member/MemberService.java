package com.example.hybe.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hybe.infra.codegroup.CodeGroupDto;


@Service
public class MemberService {
	@Autowired
	private MemberDao memberDao;
	
	public List<MemberDto> selectList(MemberVo membervo) {
		
		return memberDao.selectList(membervo);
	}
	
	public int insert(MemberDto memberDto) {
		return memberDao.insert(memberDto);
	}
	public MemberDto selectOne(MemberDto memberDto) {
		return memberDao.selectOne(memberDto);
	}
	
	public int update(MemberDto memberDto) {
		System.out.println(memberDto.getSeq());
		return memberDao.update(memberDto);
	}
	
	public int uelete(MemberDto memberDto) {
		System.out.println(memberDto.getSeq());
		return memberDao.uelete(memberDto);
	}
	
	public int delete(MemberDto memberDto) {
		System.out.println(memberDto.getSeq());
		return memberDao.delete(memberDto);
	}


}