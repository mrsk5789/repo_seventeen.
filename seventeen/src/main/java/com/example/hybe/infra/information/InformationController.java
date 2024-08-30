package com.example.hybe.infra.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class InformationController {
	
	@Autowired
	InformationService informationService;
	
	
	@RequestMapping(value="/xdm/v1/infra/information/informationXdmList")
	public String codegroupXdmList(Model model) {
		
		model.addAttribute("list", informationService.selectList());
		
//		System.out.println("codegroups.size():"+codeGroups.size());
//		
//		for(CodeGroupDto codeGroupDto:codeGroups) {
//			System.out.println(codeGroupDto.getIfcgSeq() +"|"+
//								codeGroupDto.getIfcgRenDate() +"|");
//		}
		
		return "/xdm/v1/infra/information/informationXdmList";
	}	
	
	
	
}
