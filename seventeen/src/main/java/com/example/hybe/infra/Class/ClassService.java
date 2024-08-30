package com.example.hybe.infra.Class;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassService {
	@Autowired
	private ClassDao classDao;
	
	public List<ClassDto> selectList() {
		
		List<ClassDto> classes= classDao.selectList();
		return classes;
	}

}