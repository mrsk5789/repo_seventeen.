package com.example.hybe.infra.codegroup;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Constants;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
	@Autowired
	private CodeGroupDao codeGroupDao;
	
	public List<CodeGroupDto> selectList(CodeGroupVo codegroupvo) {
		return codeGroupDao.selectList(codegroupvo);
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
	
	public int uelete(CodeGroupDto codeGroupDto) {
		System.out.println(codeGroupDto.getIfcgSeq());
		return codeGroupDao.uelete(codeGroupDto);
	}
	
	public int delete(CodeGroupDto codeGroupDto) {
		System.out.println(codeGroupDto.getIfcgSeq());
		return codeGroupDao.delete(codeGroupDto);
	}
	
	  public int selectOneCount(CodeGroupVo codegroupvo) { 
	    	return codeGroupDao.selectOneCount(codegroupvo); 
	    }
	  
	  
}
