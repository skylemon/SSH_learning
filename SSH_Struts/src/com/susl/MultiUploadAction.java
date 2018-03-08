package com.susl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MultiUploadAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File[] uploads;
	private String[] uploadsContentType;
	private String[] uploadsFilename;
	private String savaPath;
	
	public String execute() throws Exception{
		String realPath=getSavaPath();
		if(uploads!=null){
			File savePath=new File(realPath);
			if(!savePath.exists()){
				savePath.mkdirs();
			}
			for(int i=0;i<uploads.length;i++){
				File saveFile=new File(savaPath,getUploadsFilename()[i]);
				FileUtils.copyFile(uploads[i], saveFile);
			}
			ActionContext.getContext().put("message", "upload succeed");
			return "success";
		}
		return "error";
	}
	
	public File[] getUploads() {
		return uploads;
	}
	public void setUploads(File[] uploads) {
		this.uploads = uploads;
	}
	public String[] getUploadsContentType() {
		return uploadsContentType;
	}
	public void setUploadsContentType(String[] uploadsContentType) {
		this.uploadsContentType = uploadsContentType;
	}
	public String[] getUploadsFilename() {
		return uploadsFilename;
	}
	public void setUploadsFilename(String[] uploadsFilename) {
		this.uploadsFilename = uploadsFilename;
	}
	public String getSavaPath() {
		return ServletActionContext.getServletContext().getRealPath(savaPath);
	}
	public void setSavaPath(String savaPath) {
		this.savaPath = savaPath;
	}
	
}
