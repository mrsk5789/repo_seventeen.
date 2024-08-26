package com.example.hybe.infra.codegroup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeGroupController {
	
	@RequestMapping(value="/v1/infra/codegroup/codegroupXdmList")
	public String CodeGroupController() {
		return "/v1/infra/codegroup/codegroupXdmList";
	}	

}
