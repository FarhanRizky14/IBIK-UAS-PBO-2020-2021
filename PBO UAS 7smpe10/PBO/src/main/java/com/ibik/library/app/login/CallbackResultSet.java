package com.ibik.library.app.login;

import com.ibik.library.app.login.LoginController;

public class CallbackResultSet extends LoginController {
	private boolean response;
	private String label;
	
	public boolean getResponce() {
		return response;
	}
	public void setResponce(boolean responce) {
		this.response = responce;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		label = label;
	}
}