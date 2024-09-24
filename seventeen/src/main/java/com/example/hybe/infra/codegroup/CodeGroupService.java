package com.example.hybe.infra.codegroup;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Constants;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
	@Autowired
	private CodeGroupDao codeGroupDao;
	
	public List<CodeGroupDto> selectList(CodeGroupVo codegroupvo) {
		return codeGroupDao.selectList(codegroupvo);
	}
	
	public int insert(CodeGroupDto codeGroupDto){
		return codeGroupDao.insert(codeGroupDto);
	}
	
	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto) {
		return codeGroupDao.selectOne(codeGroupDto);
	}

	public int update(CodeGroupDto codeGroupDto){
		System.out.println(codeGroupDto.getIfcgSeq());
		return codeGroupDao.update(codeGroupDto);
	}
	
	public int uelete(CodeGroupDto codeGroupDto) {
		System.out.println(codeGroupDto.getIfcgSeq());
		return codeGroupDao.uelete(codeGroupDto);
	}
	
	public int delete(CodeGroupDto codeGroupDto) {
		System.out.println(codeGroupDto.getIfcgSeq());
		return codeGroupDao.delete(codeGroupDto);
	}
	
//	public static String addNowTimeString(String date) {
//		LocalDateTime localDateTime=LocalDateTime.now();
//		String localDateTimeString=localDateTime.format(DateTimeFormatter.ofPattern(Constants.TIME_FORMAT_BASIC));
//		return date+" "+localDateTimeString;
//	}
//	public static String add00TimeString(String date) {
//		return date +"00:00:00";
//	}
//	public static String add59TimeString(String date) {
//		return date +"23:59:59";
//	}	
//	public static String dateToString(Date dateParam) {
//		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
//	    String dateRt=simpleDateFormat.format(dateParam);
//	    return dateRt;
//	}
//	public static String dateTimeToString(Date dateTimeParam) {
//		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String dateTimeRt=simpleDateFormat.format(dateTimeParam);
//		return dateTimeRt;
//	}
	  public int selectOneCount(CodeGroupVo codegroupvo) { 
	    	return codeGroupDao.selectOneCount(codegroupvo); 
	    }
}
