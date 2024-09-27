package com.example.hybe.infra.code;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.hybe.infra.codegroup.CodeGroupDto;
import com.example.hybe.infra.codegroup.CodeGroupService;
import com.example.hybe.infra.codegroup.CodeGroupVo;

@Controller
public class CodeController {
	
	@Autowired
	CodeService codeService;
	
//	@RequestMapping(value="/xdm/v1/infra/code/codeXdmList")
//	public String codeXdmList(Model model, CodeVo codevo) {
//		model.addAttribute("list",codeService.selectList(codevo));
////		System.out.println("codes.size():"+codes.size());
////		for(CodeDto codeDto:codes) {System.out.println(codeDto.getIfcdSeq() +"|"+codeDto.getIfcdName() +"|");}
//		return "/xdm/v1/infra/code/codeXdmList";}	
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
	
	//uelete
		@RequestMapping(value="/xdm/v1/infra/code/codeXdmUele")
		public String codeXdmUele(CodeDto codeDto){
			codeService.uelete(codeDto);
			System.out.println("codeD");
			return "redirect:/xdm/v1/infra/code/codeXdmList";
		}
		
		//delete
		@RequestMapping(value="/xdm/v1/infra/code/codeXdmDele")
		public String codegroupXdmDele(CodeDto codeDto){
			codeService.delete(codeDto);
			System.out.println(codeDto.getIfcdSeq());
			return "redirect:/xdm/v1/infra/code/codeXdmList";
		}
		
		@RequestMapping(value= "/xdm/v1/infra/code/codeXdmList")
		public String codeXdmList(@ModelAttribute("vo")CodeVo codevo, Model model){
			codevo.setParamsPaging(codeService.selectOneCount(codevo));
			
			if (codevo.getTotalRows() > 0) {
				model.addAttribute("list", codeService.selectList(codevo));
				model.addAttribute("vo", codevo);
			}
			return "/xdm/v1/infra/code/codeXdmList";
	  	}
		
}