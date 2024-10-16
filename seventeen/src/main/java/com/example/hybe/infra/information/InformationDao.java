package com.example.hybe.infra.information;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface InformationDao {
	
	public List<InformationDto>selectList(InformationVo informationvo);

	public int insert(InformationDto informationDto);
	
	public InformationDto selectOne(InformationDto informationDto);
	
	public int update(InformationDto informationDto);
	
	public int uelete(InformationDto informationDto);
	
	public int delete(InformationDto informationDto);
	
	public int selectOneCount(InformationVo informationvo);


}

