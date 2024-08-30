package com.example.hybe.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeService {
	@Autowired
	private CodeDao codeDao;
	
	public List<CodeDto> selectList() {
		
		List<CodeDto> codes=  codeDao.selectList();
		return codes;
	}

}
	

