package com.example.hybe.infra.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.hybe.common.util.UtilDateTime;
import com.example.hybe.infra.codegroup.CodeGroupDto;
import com.example.hybe.infra.codegroup.CodeGroupVo;
@Controller
public class InformationController {
	
	@Autowired
	InformationService informationService;
	
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
	//수정 update
		@RequestMapping(value="/xdm/v1/infra/information/informationXdmUpdt")
		public String informationXdmUpdt(InformationDto informationDto){
			informationService.update(informationDto);
			System.out.println("informationDto");
			return "redirect:/xdm/v1/infra/information/informationXdmList";
		}
	//uelete
	@RequestMapping(value="/xdm/v1/infra/information/informationXdmUele")
	public String informationXdmUele(InformationDto informationDto){
		informationService.uelete(informationDto);
		System.out.println("uelete");
		return "redirect:/xdm/v1/infra/information/informationXdmList";
	}
	//delete
		@RequestMapping(value="/xdm/v1/infra/information/informationXdmDele")
		public String informationXdmDele(InformationDto informationDto){
			informationService.delete(informationDto);
			System.out.println("delete");
			return "redirect:/xdm/v1/infra/information/informationXdmList";
		}	
	@RequestMapping(value= "/xdm/v1/infra/information/informationXdmList")
	public String informationXdmList(@ModelAttribute("vo")InformationVo informationvo, Model model){
		informationvo.setParamsPaging(informationService.selectOneCount(informationvo));
		System.out.println("StartRnumForMysql : "+informationvo.getStartRnumForMysql());
		System.out.println("RowNumToShow : "+informationvo.getRowNumToShow());
//			/* 초기값 세팅이 없는 경우 사용 */
		informationvo.setShDateStart(informationvo.getShDateStart() == null || informationvo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(informationvo.getShDateStart()));
		informationvo.setShDateEnd(informationvo.getShDateEnd() == null || informationvo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(informationvo.getShDateEnd()));
		if (informationvo.getTotalRows() > 0) {
			model.addAttribute("list", informationService.selectList(informationvo));
		//	model.addAttribute("vo", codegroupvo);
		}
		return "/xdm/v1/infra/information/informationXdmList";
  	}
}
