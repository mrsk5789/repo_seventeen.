package com.example.hybe.infra.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hybe.infra.codegroup.CodeGroupDto;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public List<UserDto>selectList(){
	//List<UserDto>users =userDao.selectList();
    return userDao.selectList();
	}

	public UserDto SelectOneLogin(UserDto userDto) {
		
		return userDao.SelectOneLogin(userDto);	
	}

	public UserDto selectOne(UserDto userDto) {
		return userDao.selectOne(userDto);
	}

}
