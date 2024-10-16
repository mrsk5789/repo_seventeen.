package com.example.hybe.infra.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hybe.common.util.UtilDateTime;

import jakarta.servlet.http.HttpSession;
@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;

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
	@RequestMapping(value= "/xdm/v1/infra/member/memberXdmList")
	public String memberXdmList(@ModelAttribute("vo")MemberVo membervo, Model model){
		membervo.setParamsPaging(memberService.selectOneCount(membervo));
//		/* 초기값 세팅이 없는 경우 사용 */
		membervo.setShDateStart(membervo.getShDateStart() == null || membervo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(membervo.getShDateStart()));
		membervo.setShDateEnd(membervo.getShDateEnd() == null || membervo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(membervo.getShDateEnd()));
		if (membervo.getTotalRows() > 0) {
			model.addAttribute("list", memberService.selectList(membervo));
			model.addAttribute("vo", membervo);
		}
		return "/xdm/v1/infra/member/memberXdmList";
  	}
	//로그인 창
	@RequestMapping(value="/xdm/v1/infra/member/signXdmForm")
	public String signXdmForm(MemberDto memberDto) {
		memberService.selectOneLogin(memberDto);
		return "/xdm/v1/infra/member/signXdmForm";
	}
	
	@ResponseBody
	@RequestMapping(value = "/xdm/v1/infra/member/signXdmMForm")
	public Map<String, Object> signXdmMForm(MemberDto memberDto) {
		Map<String, Object> returnMap = new HashMap<String, Object>();

		MemberDto rtMember = memberService.selectOneLogin(memberDto);

			if (rtMember != null) {
				returnMap.put("rt", "success");
				
			} else {
					
				returnMap.put("rt", "fail");
				
			}
		         return returnMap;
	     }
     }
	
	
