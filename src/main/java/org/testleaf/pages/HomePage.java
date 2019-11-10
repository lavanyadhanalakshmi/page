package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public MyHomePage  clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click(); 
		return new MyHomePage();
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
