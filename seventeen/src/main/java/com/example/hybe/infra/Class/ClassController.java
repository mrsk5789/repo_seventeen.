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
	
	
	@RequestMapping(value="/xdm/v1/infra/Class/classXdmList")
	public String classXdmList(Model model) {
		
		model.addAttribute("list", classService.selectList());
		
//		System.out.println("codegroups.size():"+codeGroups.size());
//		for(CodeGroupDto codeGroupDto:codeGroups) {
//			System.out.println(codeGroupDto.getIfcgSeq() +"|"+
//								codeGroupDto.getIfcgRenDate() +"|");}
		return "/xdm/v1/infra/Class/classXdmList";
	}
	@RequestMapping(value="/xdm/v1/infra/Class/classXdmForm")
	public String classXdmForm() {
		return "/xdm/v1/infra/Class/classXdmForm";
	}
	@RequestMapping(value="/xdm/v1/infra/Class/classXdmInst")
	public String classXdmInst(ClassDto classDto) {
		
		System.out.println("classDto.getName():"+classDto.getClassName());
		classService.insert(classDto);
		
		return "redirect:/xdm/v1/infra/Class/classXdmList";
	}
	@RequestMapping(value="/xdm/v1/infra/Class/classXdmMForm")
	public String classXdmMForm() {
	
	    return "/xdm/v1/infra/Class/classXdmMForm";
    }
}