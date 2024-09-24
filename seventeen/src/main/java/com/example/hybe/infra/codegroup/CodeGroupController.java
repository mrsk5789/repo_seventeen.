package com.example.hybe.infra.codegroup;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@Autowired
	CodeGroupService codegroupService;
//	@RequestMapping(value="/xdm/v1/infra/codegroup/codegroupXdmList")
//	public String codegroupXdmList(Model model, CodeGroupVo codegroupvo) {
//		model.addAttribute("list", codegroupService.selectList(codegroupvo));
////		System.out.println("codegroups.size():"+codeGroups.size());	
////		for(CodeGroupDto codeGroupDto:codeGroups) {System.out.println(codeGroupDto.getIfcgSeq() +"|"+codeGroupDto.getIfcgRenDate() +"|");
//		return "/xdm/v1/infra/codegroup/codegroupXdmList";}	
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
	
	@RequestMapping(value="/xdm/v1/infra/codegroup/codegroupXdmMForm")
	public String codegroupXdmMForm(CodeGroupDto codeGroupDto, Model model){
		//CodeGroupDto dto = codegroupService.selectOne(codeGroupDto);
		model.addAttribute("item", codegroupService.selectOne(codeGroupDto));
		System.out.println("codeGroupDto.getIfcgName()");
	    return "/xdm/v1/infra/codegroup/codegroupXdmMForm";
    }
	//수정 update
	@RequestMapping(value="/xdm/v1/infra/codegroup/codegroupXdmUpdt")
	public String codegroupXdmUpdt(CodeGroupDto codeGroupDto){
		codegroupService.update(codeGroupDto);
		System.out.println("codeGroupDto");
		return "redirect:/xdm/v1/infra/codegroup/codegroupXdmList";
	}
	
	//uelete
	@RequestMapping(value="/xdm/v1/infra/codegroup/codegroupXdmUele")
	public String codegroupXdmUele(CodeGroupDto codeGroupDto){
		codegroupService.uelete(codeGroupDto);
		System.out.println("codeGroupD");
		return "redirect:/xdm/v1/infra/codegroup/codegroupXdmList";
	}
	
	//delete
	@RequestMapping(value="/xdm/v1/infra/codegroup/codegroupXdmDele")
	public String codegroupXdmDele(CodeGroupDto codeGroupDto){
		codegroupService.delete(codeGroupDto);
		System.out.println("delete");
		return "redirect:/xdm/v1/infra/codegroup/codegroupXdmList";
	}
	
	@RequestMapping(value= "/xdm/v1/infra/codegroup/codegroupXdmList")
	public String codegroupXdmList(@ModelAttribute("vo")CodeGroupVo codegroupvo, Model model){
		codegroupvo.setParamsPaging(codegroupService.selectOneCount(codegroupvo));
		
		if (codegroupvo.getTotalRows() > 0) {
			model.addAttribute("list", codegroupService.selectList(codegroupvo));
			model.addAttribute("vo", codegroupvo);
		}
		return "/xdm/v1/infra/codegroup/codegroupXdmList";
  	}
}