package com.example.hybe.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeService {
	@Autowired
	private CodeDao codeDao;
	
	public List<CodeDto> selectList() {
		
		return codeDao.selectList();
	}
	
	public int insert(CodeDto codeDto) {
		return codeDao.insert(codeDto);
	}
	
	public CodeDto selectOne(CodeDto codeDto) {
		return codeDao.selectOne(codeDto);
	}
	
	public int update(CodeDto codeDto) {
		System.out.println(codeDto.getIfcdSeq());
		return codeDao.update(codeDto);
	}
	
	public List<CodeDto>selectlistCodeGroup(){
		return codeDao.selectlistCodeGroup();
	}

}
	

