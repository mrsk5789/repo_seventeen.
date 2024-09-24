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
	public String MemberXdmList(Model model, MemberVo membervo) {
		
	model.addAttribute("list", memberService.selectList(membervo));
		
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
	@RequestMapping(value="/xdm/v1/infra/member/memberXdmMForm")
	public String MemberXdmMForm(MemberDto memberDto, Model model) {
	model.addAttribute("item",memberService.selectOne(memberDto));	
	System.out.println("memberDto");
		
		return "/xdm/v1/infra/member/memberXdmMForm";
	}
	//수정 update
		@RequestMapping(value="/xdm/v1/infra/member/memberXdmUpdt")
		public String memberXdmUpdt(MemberDto memberDto){
			
			memberService.update(memberDto);
			System.out.println("memberDto");
			
			return "redirect:/xdm/v1/infra/member/memberXdmList";
		}
	
	//uelete
	@RequestMapping(value="/xdm/v1/infra/member/memberXdmUele")
	public String memberXdmUele(MemberDto memberDto){
		
		memberService.uelete(memberDto);
		System.out.println("uelete");
		
		return "redirect:/xdm/v1/infra/member/memberXdmList";
	}
	
	//delete
	@RequestMapping(value="/xdm/v1/infra/member/memberXdmDele")
	public String memberXdmDele(MemberDto memberDto){
		
		memberService.delete(memberDto);
		System.out.println("delete");
		
		
		return "redirect:/xdm/v1/infra/member/memberXdmList";
	}
}