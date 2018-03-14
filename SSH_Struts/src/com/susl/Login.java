package com.susl;

import java.util.Map;

import org.apache.struts2.components.Else;

import com.opensymphony.xwork2.ActionContext;

public class Login {
	private String msg;
	private String inputCode;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getInputCode() {
		return inputCode;
	}

	public void setInputCode(String inputCode) {
		this.inputCode = inputCode;
	}


	public String execute() throws Exception{
		Map map=ActionContext.getContext().getSession();
		String code=(String)map.get("code");
		if(code!=null){
			if(null==getInputCode()||getInputCode().equals("")){
				map.put("msgSession", "Empty code!");
				return "login";
			}
			else if(!getInputCode().equals(code)){
				map.put("msgSession", "Invalid code!");
				return "login";
			}
			else{
				msg="Congratulations! You've logged in!";
				return "success";
			}
		}
		msg = "Congratulations! You've logged in!";
	    return "success";
	}
}
