package com.example.hybe.infra.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hybe.common.util.UtilDateTime;
import com.example.hybe.infra.codegroup.CodeGroupVo;
import com.example.hybe.infra.member.MemberDto;


@Controller
public class UserController {
	@Autowired
	UserService userService;
	
		
	@RequestMapping(value="/usr/v1/infra/user/userForm")
	public String userForm() {
	    return "/usr/v1/infra/user/userForm";
    }
	
	@RequestMapping(value="/usr/v1/infra/user/userside")
	public String userside(@ModelAttribute("vo")UserVo uservo,Model model) {
		uservo.setParamsPaging(userService.selectOneCount(uservo));
		System.out.println("StartRnumForMysql : "+uservo.getStartRnumForMysql());
		System.out.println("RowNumToShow : "+uservo.getRowNumToShow());
		//List<UserDto> users=userService.selectList();
		
		if (uservo.getTotalRows() > 0) {
			model.addAttribute("list", userService.selectList(uservo));
			//model.addAttribute("vo", uservo);
		}
	    return "/usr/v1/infra/user/userside";
    }
	//login
	@RequestMapping(value="/usr/v1/infra/user/userlogin")
	public String userlogin(UserDto userDto) {
		userService.SelectOneLogin(userDto);
	    return "/usr/v1/infra/user/userlogin";
    }
	@ResponseBody
	@RequestMapping(value = "/usr/v1/infra/user/userrlogin")
	public Map<String, Object> userrlogin(UserDto userDto) {
		Map<String, Object> returnMap = new HashMap<String, Object>();

		UserDto rtUser = userService.SelectOneLogin(userDto);

			if (rtUser != null) {
				returnMap.put("rt", "success");
			} else {
				returnMap.put("rt", "fail");
			}
		      return returnMap;
	     }
	@RequestMapping(value="/usr/v1/infra/user/userrForm")
	public String userrForm() {
	    return "/usr/v1/infra/user/userrForm";
    }
	
	@RequestMapping(value="/usr/v1/infra/user/userProfile")
	public String userProfile() {
	    return "/usr/v1/infra/user/userProfile";
    }
	
	@RequestMapping(value="/usr/v1/infra/user/userInformation")
	public String userInformation() {
	    return "/usr/v1/infra/user/userInformation";
    }
	
	@RequestMapping(value="/usr/v1/infra/user/usersideDetail")
	public String usersideDetail(UserDto userDto, Model model) {
		model.addAttribute("item", userService.selectOne(userDto));
		
		
		System.out.println("dd ");
	    return "/usr/v1/infra/user/usersideDetail";
    }
	
	@RequestMapping(value="/usr/v1/infra/user/addcenter")
	public String addcenter() {
	   return "/usr/v1/infra/user/addcenter";
    }
	
}	
