package com.example.hybe.common.util;

import java.io.File;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.config.annotation.web.oauth2.login.OAuth2LoginSecurityMarker;
import org.springframework.stereotype.Component;

import com.amazonaws.services.s3.AmazonS3Client;

@Component
public class S3Uploader {

	private final AmazonS3Client amazonS3Client = null;
	/*
	@Value("${cloud.aws.bucket}")
	public String bucket;
	
	public String upload(String filePath) throws RuntimeException{
		File targetFile = new File(filePath);
		
		String uploadImageUrl = putS3(targetFile, targetFile.getName());
		
		removeOriginalFile(targetFile);
		return uploadImageUrl;

	}

	private String putS3(File uploadFile, String fileName) throws RuntimeException{
		amazonS3Client = 
		
		

	}
	*/
}
