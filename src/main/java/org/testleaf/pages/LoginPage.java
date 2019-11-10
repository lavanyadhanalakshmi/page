package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUserName(String UserName) {
		driver.findElementByName("USERNAME").sendKeys(UserName);
		return this;
	}
	
	public LoginPage enterPassword(String Password) {
		driver.findElementById("password").sendKeys(Password);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
//		HomePage obj = new HomePage();
//		return obj;
		return new HomePage();
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
