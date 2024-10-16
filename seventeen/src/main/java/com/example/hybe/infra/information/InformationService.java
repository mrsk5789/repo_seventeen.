package com.example.hybe.infra.information;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformationService {
	@Autowired
	private InformationDao informationDao;
	
	public List<InformationDto> selectList(InformationVo informationvo) {
		return informationDao.selectList(informationvo);
	}	
		
	public int insert(InformationDto informationDto) {
		return informationDao.insert(informationDto);
	}
	
	public InformationDto selectOne(InformationDto informationDto) {
		return informationDao.selectOne(informationDto);
	}
	
	public int update(InformationDto informationDto) {
		System.out.println(informationDto.getSeq());
		return informationDao.update(informationDto);
	}
	
	public int uelete(InformationDto informationDto) {
		System.out.println(informationDto.getSeq());
		return informationDao.uelete(informationDto);
	}
	
	public int delete(InformationDto informationDto) {
		System.out.println(informationDto.getSeq());
		return informationDao.delete(informationDto);
	}
	
	public int selectOneCount(InformationVo informationvo) {
		return informationDao.selectOneCount(informationvo);
	}

}