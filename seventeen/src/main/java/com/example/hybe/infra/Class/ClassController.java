package com.example.hybe.infra.Class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.hybe.infra.Class.ClassService;

@Controller
public class ClassController {
	
	@Autowired
	ClassService classService;
	
	
	@RequestMapping(value="/xdm/v1/infra/class/classXdmList")
	public String codegroupXdmList(Model model) {
		
		model.addAttribute("list", classService.selectList());
		
//		System.out.println("codegroups.size():"+codeGroups.size());
//		
//		for(CodeGroupDto codeGroupDto:codeGroups) {
//			System.out.println(codeGroupDto.getIfcgSeq() +"|"+
//								codeGroupDto.getIfcgName() +"|"+
//								codeGroupDto.getIfcgUseNy() +"|"+
//								codeGroupDto.getIfcgOrder() +"|"+
//								codeGroupDto.getIfcgRenDate() +"|");
//		}
		
		return "/xdm/v1/infra/class/classXdmList";
	}
}