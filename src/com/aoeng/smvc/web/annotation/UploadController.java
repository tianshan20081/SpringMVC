/**
 * 
 */
package com.aoeng.smvc.web.annotation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * Nov 25, 201311:32:44 AM
 * 
 */
@Controller
@RequestMapping("/upload/")
public class UploadController
{
	@RequestMapping("index")
	public String index() {

		return "upload_index";
	}

	@RequestMapping("swf")
	public String swf() {

		return "upload_swf";
	}

	@RequestMapping("upload")
	public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request, String god, String uid) {
		long begin = System.currentTimeMillis();
		if (null != file) {
			System.out.println("fileName --->" + file.getOriginalFilename());
			if (!file.isEmpty()) {
				try {
					System.out.println(file.getSize() / 1024 / 1024 + "MB");
					FileOutputStream fos = new FileOutputStream("/home/paynet/java/mee/SpringMVC/WebRoot/files/"
							+ System.currentTimeMillis() + file.getOriginalFilename());
					InputStream in = file.getInputStream();
					int b = 0;
					while ((b = in.read()) != -1) {
						fos.write(b);
					}
					fos.close();
					in.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		System.out.println(System.currentTimeMillis() - begin);
		return "upload_success";
	}

	@RequestMapping("multiUpload")
	public String multiUpload(HttpServletRequest request) throws Exception, IOException {
		long begin = System.currentTimeMillis();
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		if (resolver.isMultipart(request)) {
			MultipartHttpServletRequest httpServletRequest = (MultipartHttpServletRequest) request;
			Iterator<String> iter = httpServletRequest.getFileNames();
			while (iter.hasNext()) {
				String fileName = (String) iter.next();
				MultipartFile multipartFile = httpServletRequest.getFile(fileName);
				if (null != multipartFile) {
					System.out.println(multipartFile.getOriginalFilename());
					String filePath = "/home/paynet/java/mee/SpringMVC/WebRoot/files/" + System.currentTimeMillis()
							+ multipartFile.getOriginalFilename();
					File file = new File(filePath);
					System.out.println(multipartFile.getSize() / 1024 / 1024 + "MB");
					
					multipartFile.transferTo(file);
				}
			}
		}
		System.out.println(System.currentTimeMillis() - begin);
		return "upload_success";
	}

}
