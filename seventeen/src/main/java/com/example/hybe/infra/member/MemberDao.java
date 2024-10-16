package com.example.hybe.infra.member;



import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.hybe.infra.codegroup.CodeGroupDto;
import com.example.hybe.infra.codegroup.CodeGroupVo;
//import com.example.hybe.infra.members.MemberDto2;

@Repository
public interface MemberDao {
	
	public List<MemberDto>selectList(MemberVo membervo);
	
	public int insert(MemberDto memberDto);
	
	public MemberDto selectOne(MemberDto memberDto);
	
	public int uelete(MemberDto memberDto);
	
	public int delete(MemberDto memberDto);
	
	//public String addNowTimeString(MemberDto memberDto);

	public int update(MemberDto memberDto);
	
	public int selectOneCount(MemberVo membervo);
	
	public MemberDto selectOneLogin(MemberDto memberDto);

	
}
