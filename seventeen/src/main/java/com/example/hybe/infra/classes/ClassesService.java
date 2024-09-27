package com.example.hybe.infra.classes;

import java.util.List;

public class ClassesService {
	

	private ClassesDao classesDao;
	
	public List<ClassesDto> selectList(ClassesVo classesvo) {
		return classesDao.selectList(classesvo);
	}
	
	public int insert(ClassesDto classesDto) {
		return classesDao.insert(classesDto);
	}
	
	public ClassesDto selectOne(ClassesDto classesDto) {
		return classesDao.selectOne(classesDto);
	}
	
	public int update(ClassesDto classesDto) {
		System.out.println(classesDto.getSeq());
		return classesDao.update(classesDto);
	}
	
	public int uelete(ClassesDto classesDto) {
		System.out.println(classesDto.getSeq());
		return classesDao.uelete(classesDto);
	}
	
	public int delete(ClassesDto classesDto) {
		System.out.println(classesDto.getSeq());
		return classesDao.delete(classesDto);
	}


}

