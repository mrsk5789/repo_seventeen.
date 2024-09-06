package com.example.hybe.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
	@Autowired
	private CodeGroupDao codeGroupDao;
	
	public List<CodeGroupDto> selectList() {
		
		return codeGroupDao.selectList();
	}
	
	public int insert(CodeGroupDto codeGroupDto){
		return codeGroupDao.insert(codeGroupDto);
		
	}
		
	
	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto) {
		return codeGroupDao.selectOne(codeGroupDto);
	}

	public int update(CodeGroupDto codeGroupDto){
		System.out.println(codeGroupDto.getIfcgSeq());
		return codeGroupDao.update(codeGroupDto);
	   
	}

}
