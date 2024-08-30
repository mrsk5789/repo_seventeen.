package com.example.hybe.infra.codegroup;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeGroupDao {
	
	public List<CodeGroupDto>selectList();
	
	public int insert(CodeGroupDto codeGroupDto);

}