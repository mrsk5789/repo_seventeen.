package com.example.hybe.infra.classes;

import java.util.List;

public interface ClassesDao {
	
public List<ClassesDto>selectList(ClassesVo classesvo);
	
	public int insert(ClassesDto classesDto);
	
	public ClassesDto selectOne(ClassesDto classesDto);
	
	public int update(ClassesDto classesDto);
	
	public int uelete(ClassesDto classesDto);
	
	public int delete(ClassesDto classesDto);

}



