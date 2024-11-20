package com.example.hybe.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value= "")
public class MemberRestController {
	
//	@Autowired
//	MemberService memberService;
//	
//	@GetMapping(value= "")
//	public List <MemberDto>SelectList(MemberVo membervo){
//		List<MemberDto>selectList(MemberVo membervo) throws Exception {
//			List<MemberDto> list = service.selectList(membervo);
//			System.out.println(list+"@@@@@@@@@@@@@");
//			return list;
//		}
//		
//		
//		@GetMapping("/{mSeq}")
//		public MemberDto selectOne(MemberDto memberDto) throws Exception {
//			MemberDto item = service.selectOne(memberDto);
//			return item;
//		
//		}
//	}
}
	
