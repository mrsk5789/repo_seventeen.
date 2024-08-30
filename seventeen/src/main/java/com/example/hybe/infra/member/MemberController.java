package com.example.hybe.infra.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	
	@RequestMapping(value="/xdm/v1/infra/member/memberXdmList")
	public String MemberXdmList(Model model) {
		
	model.addAttribute("list", memberService.selectList());
		
		//System.out.println("members.size():"+members.size());		
		//for(MemberDto memberDto:members) {
			//System.out.println(memberDto.getSeq() +"|"+
			//				   memberDto.getRegdate() +"|");
	//	}
		
		return "/xdm/v1/infra/member/memberXdmList";
	}
	@RequestMapping(value="/xdm/v1/infra/member/memberXdmForm")
	public String MemberXdmForm() {
		
		return "/xdm/v1/infra/member/memberXdmForm";
	}
	@RequestMapping(value="/xdm/v1/infra/member/memberXdmInst")
	public String MemberXdmInst(MemberDto memberDto) {
	
		System.out.println("memberDto.getName():"+memberDto.getName());
		memberService.insert(memberDto);
		
		return "redirect:/xdm/v1/infra/member/memberXdmList";
	}
}