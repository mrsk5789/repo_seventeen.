package com.example.hybe.infra.code;

import java.util.List;

public interface CodeDao {
	
	public List<CodeDto>selectList();
	
	public int insert(CodeDto codeDto);
	
	public CodeDto selectOne(CodeDto codeDto);
	
	public int update(CodeDto codeDto);
	
	public List<CodeDto>selectlistCodeGroup();

}