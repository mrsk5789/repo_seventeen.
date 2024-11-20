package com.example.hybe.infra.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.hybe.infra.review.reviewDto;

@Repository
public interface UserDao {
	
	public List<UserDto>selectList(UserVo uservo);

	public UserDto SelectOneLogin(UserDto userDto);
	
	public UserDto selectOne(UserDto userDto);
	
	public int selectOneCount(UserVo uservo);
	
	public int insertreview(UserDto userDto);
	
	public List<UserDto>reselectList();
	
	public List<UserDto>classSelectList();
	
	public UserDto classSelectOne(UserDto userDto);
	
	public List<UserDto>teachSelect();
	
	public int insertReserve(UserDto userDto);
	

}