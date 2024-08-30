package com.example.hybe.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService codegroupService;
	
	
	@RequestMapping(value="/xdm/v1/infra/codegroup/codegroupXdmList")
	public String codegroupXdmList(Model model) {
		
		model.addAttribute("list", codegroupService.selectList());
		
//		System.out.println("codegroups.size():"+codeGroups.size());
//		
//		for(CodeGroupDto codeGroupDto:codeGroups) {
//			System.out.println(codeGroupDto.getIfcgSeq() +"|"+
//								codeGroupDto.getIfcgRenDate() +"|");
//		}
		
		return "/xdm/v1/infra/codegroup/codegroupXdmList";
	}	
	
	@RequestMapping(value="/xdm/v1/infra/codegroup/codegroupXdmForm")
	public String codegroupXdmForm() {
	
	    return "/xdm/v1/infra/codegroup/codegroupXdmForm";
}
	@RequestMapping(value="/xdm/v1/infra/codegroup/codegroupXdmInst")
	public String codegroupXdmInst(CodeGroupDto codeGroupDto) {
		
		System.out.println("codeGroupDto.getIfcgName():"+codeGroupDto.getIfcgName());
	    codegroupService.insert(codeGroupDto);
		
	    
	    return "redirect:/xdm/v1/infra/codegroup/codegroupXdmList";
	}
}
	