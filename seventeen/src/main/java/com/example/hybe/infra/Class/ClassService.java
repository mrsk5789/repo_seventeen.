package com.example.hybe.infra.Class;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassService {
	@Autowired
	private ClassDao classDao;
	
	public List<ClassDto> selectList() {
		
		
		return classDao.selectList();
	}
	
	public int insert(ClassDto classDto) {
		return classDao.insert(classDto);
	}

}