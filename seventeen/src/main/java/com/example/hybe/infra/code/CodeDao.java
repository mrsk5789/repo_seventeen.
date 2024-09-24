package com.example.hybe.infra.code;

import java.util.List;

public interface CodeDao {
	
	public List<CodeDto>selectList(CodeVo codevo);
	
	public int insert(CodeDto codeDto);
	
	public CodeDto selectOne(CodeDto codeDto);
	
	public int update(CodeDto codeDto);
	
	public List<CodeDto>selectlistCodeGroup();
	
	public int uelete(CodeDto codeDto);
	
	public int delete(CodeDto codeDto);
	
	public String addNowTimeString(CodeDto codeDto);

}