package com.example.hybe.infra.code;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hybe.infra.codegroup.CodeGroupVo;

import jakarta.annotation.PostConstruct;

@Service
public class CodeService {
	@Autowired
	private CodeDao codeDao;
	
	public List<CodeDto> selectList(CodeVo codevo) {
		
		return codeDao.selectList(codevo);
	}
	
	public int insert(CodeDto codeDto) {
		return codeDao.insert(codeDto);
	}
	
	public CodeDto selectOne(CodeDto codeDto) {
		return codeDao.selectOne(codeDto);
		
	}
	
	public int update(CodeDto codeDto) {
		System.out.println(codeDto.getIfcdSeq());
		return codeDao.update(codeDto);
	}
	
	public List<CodeDto>selectlistCodeGroup(){
		return codeDao.selectlistCodeGroup();
	}
	
	public int uelete(CodeDto codeDto) {
		System.out.println(codeDto.getIfcdSeq());
		return codeDao.uelete(codeDto);
	}
	
	public int delete(CodeDto codeDto) {
		System.out.println(codeDto.getIfcdSeq());
		return codeDao.delete(codeDto);
	}

	public int selectOneCount(CodeVo codevo) { 
    	return codeDao.selectOneCount(codevo); 
    }
    @PostConstruct
	public void selectListCachedCodeArrayList() {
		List<CodeDto> codeListFromDb = (ArrayList<CodeDto>) codeDao.selectListCachedCodeArrayList();
//		codeListFromDb = (ArrayList<Code>) dao.selectListCachedCodeArrayList();
		CodeDto.cachedCodeArrayList.clear(); 
		CodeDto.cachedCodeArrayList.addAll(codeListFromDb);
		System.out.println("cachedCodeArrayList: " + CodeDto.cachedCodeArrayList.size() + " chached !");
	}
    public static void clear() {
		CodeDto.cachedCodeArrayList.clear();
	}
	
	
	public static List<CodeDto> selectListCachedCode(String codegroup_seq) {
		List<CodeDto> rt = new ArrayList<CodeDto>();
		for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
			if (codeRow.getCodegroup_seq().equals(codegroup_seq)) {
				rt.add(codeRow);
			} else {
				// by pass
			}
		}
		return rt;
	}
	
	public static String selectOneCachedCode(int ifcdSeq) {
		String rt = "";
		for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
			if (codeRow.getIfcdSeq().equals(Integer.toString(ifcdSeq))) {
				rt = codeRow.getIfcdName();
			} else {
				// by pass
			}
		}
		return rt;
	}
    
}