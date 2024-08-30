package com.example.hybe.infra.Class;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface ClassDao {
	
	public List<ClassDto>selectList();

}
