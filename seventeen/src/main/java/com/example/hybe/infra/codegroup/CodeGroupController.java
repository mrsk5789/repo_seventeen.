package com.example.hybe.infra.codegroup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.hybe.common.util.UtilDateTime;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class CodeGroupController {

	@Autowired
	CodeGroupService codegroupService;
    //Form
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codegroupXdmForm")
	public String codegroupXdmForm() {
		return "/xdm/v1/infra/codegroup/codegroupXdmForm";
	}
    //Insert
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codegroupXdmInst")
	public String codegroupXdmInst(CodeGroupDto codeGroupDto) {

		System.out.println("codeGroupDto.getIfcgName():" + codeGroupDto.getIfcgName());
		codegroupService.insert(codeGroupDto);
		return "redirect:/xdm/v1/infra/codegroup/codegroupXdmList";
	}

	@RequestMapping(value = "/xdm/v1/infra/codegroup/codegroupXdmMForm")
	public String codegroupXdmMForm(CodeGroupDto codeGroupDto, Model model) {
		// CodeGroupDto dto = codegroupService.selectOne(codeGroupDto);
		model.addAttribute("item", codegroupService.selectOne(codeGroupDto));
		System.out.println("codeGroupDto.getIfcgName()");
		return "/xdm/v1/infra/codegroup/codegroupXdmMForm";
	}

	// 수정 update
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codegroupXdmUpdt")
	public String codegroupXdmUpdt(CodeGroupDto codeGroupDto) {
		codegroupService.update(codeGroupDto);
		System.out.println("codeGroupDto");
		return "redirect:/xdm/v1/infra/codegroup/codegroupXdmList";
	}

	// uelete
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codegroupXdmUele")
	public String codegroupXdmUele(CodeGroupDto codeGroupDto) {
		codegroupService.uelete(codeGroupDto);
		System.out.println("uelete");
		return "redirect:/xdm/v1/infra/codegroup/codegroupXdmList";
	}

	// delete
	@RequestMapping(value = "/xdm/v1/infra/codegroup/codegroupXdmDele")
	public String codegroupXdmDele(CodeGroupDto codeGroupDto) {
		codegroupService.delete(codeGroupDto);
		System.out.println("delete");
		return "redirect:/xdm/v1/infra/codegroup/codegroupXdmList";
	}

	@RequestMapping(value= "/xdm/v1/infra/codegroup/codegroupXdmList")
	public String codegroupXdmList(@ModelAttribute("vo")CodeGroupVo codegroupvo, Model model) throws IOException{
		

		codegroupvo.setParamsPaging(codegroupService.selectOneCount(codegroupvo));
		System.out.println("StartRnumForMysql : "+codegroupvo.getStartRnumForMysql());
		System.out.println("RowNumToShow : "+codegroupvo.getRowNumToShow());
//		/* 초기값 세팅이 없는 경우 사용 */
		codegroupvo.setShDateStart(codegroupvo.getShDateStart() == null || codegroupvo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(codegroupvo.getShDateStart()));
		codegroupvo.setShDateEnd(codegroupvo.getShDateEnd() == null || codegroupvo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(codegroupvo.getShDateEnd()));
		if (codegroupvo.getTotalRows() > 0) {
			model.addAttribute("list", codegroupService.selectList(codegroupvo));
		//	model.addAttribute("vo", codegroupvo);
		}
	
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1471000/CovidDagnsRgntProdExprtStusService/getCovidDagnsRgntProdExprtStusInq"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=서비스키"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("3", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8")); /*응답데이터 형식(xml/json) default : xml*/
        urlBuilder.append("&" + URLEncoder.encode("YYYY","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*년도*/
        urlBuilder.append("&" + URLEncoder.encode("MM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*실적월*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
        
        ObjectMapper objectMapper = new ObjectMapper();
		JsonNode node = objectMapper.readTree(sb.toString());
		
		System.out.println("node.get(\"header\").get(\"resultCode\").asText(): " + node.get("header").get("resultCode").asText());
		System.out.println("node.get(\"header\").get(\"resultMsg\").asText(): " + node.get("header").get("resultMsg").asText());
		System.out.println("node.get(\"header\").get(\"resultMsg\").asText(): " + node.get("body").get("items").get(0).get("KIT_PROD_QTY").asText());
	
		return "/xdm/v1/infra/codegroup/codegroupXdmList";
   }
	
	
}
