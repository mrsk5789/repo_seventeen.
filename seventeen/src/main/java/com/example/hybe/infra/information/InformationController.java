package com.example.hybe.infra.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.hybe.infra.codegroup.CodeGroupDto;
@Controller
public class InformationController {
	
	@Autowired
	InformationService informationService;
	
	
	@RequestMapping(value="/xdm/v1/infra/information/informationXdmList")
	public String codegroupXdmList(Model model) {
		
		model.addAttribute("list", informationService.selectList());
		
//		System.out.println("codegroups.size():"+codeGroups.size());		
//		for(CodeGroupDto codeGroupDto:codeGroups) {
//			System.out.println(codeGroupDto.getIfcgSeq() +"|"+
//								codeGroupDto.getIfcgRenDate() +"|");
		
		return "/xdm/v1/infra/information/informationXdmList";
	}	
	@RequestMapping(value="/xdm/v1/infra/information/informationXdmForm")
	public String informationXdmForm() {
	
		
		
	    return "/xdm/v1/infra/information/informationXdmForm";
    }
	@RequestMapping(value="/xdm/v1/infra/information/informationXdmInst")
	public String informationXdmInst(InformationDto informationDto) {
		
		System.out.println("informationDto.getName():"+informationDto.getName());
	    informationService.insert(informationDto);
		
	    return "redirect:/xdm/v1/infra/information/informationXdmList";
	}
	@RequestMapping(value="/xdm/v1/infra/information/informationXdmMForm")
	public String informationXdmMForm(InformationDto informationDto, Model model) {
		model.addAttribute("item", informationService.selectOne(informationDto));
		System.out.println("informationDto.getName()");
	    return "/xdm/v1/infra/information/informationXdmMForm";
    }
	
}
