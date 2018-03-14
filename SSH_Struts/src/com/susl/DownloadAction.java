package com.susl;

import com.opensymphony.xwork2.ActionSupport;
import java.io.*;

import javax.servlet.Servlet;

import org.apache.struts2.ServletActionContext;

public class DownloadAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String downloadPath;
	private String filename;
	public String getDownloadPath() {
		return downloadPath;
	}
	public void setDownloadPath(String downloadPath) {
		this.downloadPath = downloadPath;
	}
	public String getFilename() throws UnsupportedEncodingException {
		String path=new String(filename.getBytes("utf-8"),"ISO8859-1");
		System.out.println(path);
		return path;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public InputStream getTargetFile() throws FileNotFoundException,UnsupportedEncodingException{
		String realPath=downloadPath+"/"+getFilename();
		
		InputStream inputStream= ServletActionContext.getServletContext().getResourceAsStream(realPath);
		
		return inputStream;
	}
	
	public String execute(){
		return "success";
	}
	
}
