package com.example.hybe.infra.code;

import java.util.List;

import com.example.hybe.infra.codegroup.CodeGroupVo;

public interface CodeDao {
	
	public List<CodeDto>selectList(CodeVo codevo);
	
	public int insert(CodeDto codeDto);
	
	public CodeDto selectOne(CodeDto codeDto);
	
	public int update(CodeDto codeDto);
	
	public List<CodeDto>selectlistCodeGroup();
	
	public int uelete(CodeDto codeDto);
	
	public int delete(CodeDto codeDto);
	
	//public String addNowTimeString(CodeDto codeDto);
	
	public int selectOneCount(CodeVo codevo);
	
	 public List<CodeDto> selectListCachedCodeArrayList();

}