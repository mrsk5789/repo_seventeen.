package com.example.hybe.infra.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hybe.infra.codegroup.CodeGroupDto;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public List<UserDto> selectList(UserVo uservo){
	//List<UserDto>users =userDao.selectList(uservo);
    return userDao.selectList(uservo);
	}

	public UserDto SelectOneLogin(UserDto userDto) {
		return userDao.SelectOneLogin(userDto);	
	}

	public UserDto selectOne(UserDto userDto) {
		return userDao.selectOne(userDto);
	}
	
	public int selectOneCount(UserVo uservo) {
		return userDao.selectOneCount(uservo);
	}
	public int insertreview(UserDto userDto) {
		return userDao.insertreview(userDto);
	}
	public List<UserDto> reselectList(){
	//List<UserDto>users =userDao.selectList(uservo);
	    return userDao.reselectList();
	}
	
	public List<UserDto> classSelectList(){
	    return userDao.classSelectList();
    }
	
	public UserDto classSelectOne(UserDto userDto) {
		return userDao.classSelectOne(userDto);
	}
	
	public List<UserDto> teachSelect(){
		return userDao.teachSelect();
	}
	
	public int insertReserve(UserDto userDto) {
		return userDao.insertReserve(userDto);
	}
}
