package com.example.hybe.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	
	@Autowired
	CodeService codeService;
	
	
	@RequestMapping(value="/xdm/v1/infra/code/codeXdmList")
	public String codeXdmList() {
		List<CodeDto> codes=codeService.selectList();
		
//		System.out.println("codes.size():"+codes.size());
//		
//		for(CodeDto codeDto:codes) {
//			System.out.println(codeDto.getIfcdSeq() +"|"+
//								codeDto.getIfcdName() +"|"+
//								codeDto.getIfcdUseNy() +"|"+
//								codeDto.getIfcdOrder() +"|");
//		}
//		
		return "/xdm/v1/infra/code/codeXdmList";
	}	
	
	
	
}