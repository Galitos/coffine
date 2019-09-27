package com.example.coffine.controller;



import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class UploadController {
	
	private static final Logger logger = LoggerFactory.getLogger(UploadController.class);
	
	@Resource(name = "uploadPath")
	private String uploadPath;
	
	 // upload
	@RequestMapping(value = "/uploadForm", method = RequestMethod.GET)
	public void uploadFormGet() throws Exception{
		logger.info("upload.....");
	}
	// upload
		@RequestMapping(value = "/uploadForm", method = RequestMethod.POST)
		public void uploadFormPost(MultipartFile file1, Model model) throws Exception{
			
			logger.info("upload.....originalname {}", file1.getOriginalFilename());
			
			String savedFileName = uploadFile(file1);
			model.addAttribute("savedFileName", savedFileName);
		}
	private String uploadFile(MultipartFile file1) throws IOException {
		String filename = UUID.randomUUID().toString() + "_" + file1.getOriginalFilename();
		File target = new File(uploadPath, filename);
		FileCopyUtils.copy(file1.getBytes(), target);
		return filename;
	}		
	
}




