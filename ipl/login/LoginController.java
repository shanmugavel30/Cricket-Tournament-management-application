package com.ipl.login;


public class LoginController implements ModelToController,ViewToController{
	private ControllerToView loginview;
	private ControllerToModel loginmodel;
	
	public LoginController(LoginView loginview) {
		this.loginmodel=new LoginModel(this);
		this.loginview=loginview;
	}
}
