package com.ipl.login;

public class LoginModel implements ControllerToModel {
private ModelToController logincontroller;
	
	public LoginModel(LoginController logincontroller) {
		this.logincontroller=logincontroller;
	}

}
