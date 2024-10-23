package com.example.hybe.infra.user;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
	
	public List<UserDto>selectList(UserVo uservo);

	public UserDto SelectOneLogin(UserDto userDto);
	
	public UserDto selectOne(UserDto userDto);
	
	public int selectOneCount(UserVo uservo);

}