package com.example.hybe.infra.information;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformationService {
	@Autowired
	private InformationDao informationDao;
	
	public List<InformationDto> selectList() {
		
		return informationDao.selectList();
	}	
		
	public int insert(InformationDto informationDto) {
		return informationDao.insert(informationDto);
	}
	
	public InformationDto selectOne(InformationDto informationDto) {
		return informationDao.selectOne(informationDto);
	}

}