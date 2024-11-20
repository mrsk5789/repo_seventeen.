package com.example.hybe.infra.information;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.model.ObjectMetadata;
import com.example.hybe.common.config.S3Config;
import com.example.hybe.common.util.UtilDateTime;
import com.amazonaws.services.s3.AmazonS3Client;

@Service
public class InformationService {
	@Autowired
	private InformationDao informationDao;
	
	@Autowired
	private AmazonS3Client amazonS3Client;
	private MultipartFile[] multipartFiles;

	//@Value("${cloud.aws.bucket}") 
	private String bucket = "seventeen17"; // S3 버킷 이름

	public List<InformationDto> selectList(InformationVo informationvo) {
		return informationDao.selectList(informationvo);
	}	
		
	public int insert(InformationDto informationDto) {
		try {
			uploadFile(informationDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;// informationDao.insert(informationDto);
	}
	
	public InformationDto selectOne(InformationDto informationDto) {
		return informationDao.selectOne(informationDto);
	}
	
	public int update(InformationDto informationDto) {
		System.out.println(informationDto.getiSeq());
		return informationDao.update(informationDto);
	}
	
	public int uelete(InformationDto informationDto) {
		System.out.println(informationDto.getiSeq());
		return informationDao.uelete(informationDto);
	}
	
	public int delete(InformationDto informationDto) {
		System.out.println(informationDto.getiSeq());
		return informationDao.delete(informationDto);
	}
	
	public int selectOneCount(InformationVo informationvo) {
		return informationDao.selectOneCount(informationvo);
	}
	
	public void uploadFile(InformationDto informationDto) throws Exception {
		multipartFiles = informationDto.getUploadFiles();
		System.out.println(multipartFiles.length);
		
		for(int i=0; i<multipartFiles.length; i++) {
			System.out.println(multipartFiles[i].getOriginalFilename());
			
			if(!multipartFiles[i].isEmpty()) {
				String className = informationDto.getClass().getSimpleName().toString().toLowerCase();		
				String fileName = multipartFiles[i].getOriginalFilename();
				String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
				String uuid = UUID.randomUUID().toString();
				String uuidFileName = uuid + "." + ext;
				String pathModule = className;
				String nowString = UtilDateTime.nowString();
				String pathDate = nowString.substring(0,4) + "/" + nowString.substring(5,7) + "/" + nowString.substring(8,10); 
				int type=0;
				String path = pathModule + "/" + type + "/" + pathDate + "/";
	//			String pathForView = Constants.UPLOADED_PATH_PREFIX_FOR_VIEW_LOCAL + "/" + pathModule + "/" + type + "/" + pathDate + "/";
				
				
		        ObjectMetadata metadata = new ObjectMetadata();
		        metadata.setContentLength(multipartFiles[i].getSize());
		        metadata.setContentType(multipartFiles[i].getContentType());
		        
		        amazonS3Client.putObject(bucket, path + uuidFileName, multipartFiles[i].getInputStream(), metadata);
				
		        String objectUrl = amazonS3Client.getUrl(bucket, path + uuidFileName).toString();
		        
		        informationDto.setPath(objectUrl);
		        informationDto.setOriginalName(fileName);
		        informationDto.setUuidName(uuidFileName);
		        informationDto.setExt(ext);
		        informationDto.setSize(multipartFiles[i].getSize());
				
	//	        informationDto.setTableName(tableName);
		        informationDto.setType(type);
	//			dto.setDefaultNy();
				
	    //      informationDao.insert(informationDto);
			}
		}
	}

}