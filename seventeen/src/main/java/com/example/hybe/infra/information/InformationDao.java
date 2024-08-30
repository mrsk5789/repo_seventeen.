package com.example.hybe.infra.information;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface InformationDao {
	
	public List<InformationDto>selectList();


}

