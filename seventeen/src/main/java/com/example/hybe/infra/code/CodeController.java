package com.example.hybe.infra.code;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.hybe.infra.codegroup.CodeGroupService;

@Controller
public class CodeController {
	
	@Autowired
	CodeService codeService;
	
	@RequestMapping(value="/xdm/v1/infra/code/codeXdmList")
	public String codeXdmList(Model model) {
		model.addAttribute("list",codeService.selectList());
		
//		System.out.println("codes.size():"+codes.size());
//		for(CodeDto codeDto:codes) {
//			System.out.println(codeDto.getIfcdSeq() +"|"+
//								codeDto.getIfcdName() +"|");}
		return "/xdm/v1/infra/code/codeXdmList";
	}	
	
	@RequestMapping(value="/xdm/v1/infra/code/codeXdmInst")
	public String codeXdmInst(CodeDto codeDto) {
		System.out.println("codeDto.getIfcdName():"+codeDto.getIfcdName());
	    codeService.insert(codeDto);
	    return "redirect:/xdm/v1/infra/code/codeXdmList";
	}
	@RequestMapping(value="/xdm/v1/infra/code/codeXdmMForm")
	public String codeXdmMForm(CodeDto codeDto, Model model){
		//CodeGroupDto dto = codegroupService.selectOne(codeGroupDto);
		model.addAttribute("item", codeService.selectOne(codeDto));
		System.out.println("codeDto.getIfcdName()");
	    return "/xdm/v1/infra/code/codeXdmMForm";
    }
	@RequestMapping(value="/xdm/v1/infra/code/codeXdmUpdt")
	public String codeXdmUpdt(CodeDto codeDto){
		codeService.update(codeDto);
		System.out.println("codeGroupDto");
		return "redirect:/xdm/v1/infra/code/codeXdmList";
	}
	@RequestMapping(value="/xdm/v1/infra/code/codeXdmForm")
	public String codeXdmForm(Model model) {
		
		List<CodeDto> codegroups=codeService.selectlistCodeGroup();
		model.addAttribute("listCodeGroup",codegroups);
	
	    return "/xdm/v1/infra/code/codeXdmForm";
    }
}