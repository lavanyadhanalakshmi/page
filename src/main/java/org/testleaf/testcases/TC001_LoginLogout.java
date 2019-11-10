package org.testleaf.testcases;

import org.testleaf.baseAPI.ProjectSpecificMethods;
import org.testleaf.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_LoginLogout extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "Data";
		Sheetname = "CreateLead";
	}

	@Test(dataProvider="fetchData")
	public void loginLogout(String UserName, String Password,String CompanyName ,String Firstname, String Lastname) {
		
		/*LoginPage obj = new LoginPage();
		obj.enterUserName();
		obj.enterPassword();
		obj.clickLogin();*/
		
		new LoginPage()
		.enterUserName(UserName)
		.enterPassword(Password)
		.clickLogin()
		.clickCRMSFA()
		.ClickLead()
		.ClickCreatelead()
		.enterCompanyName(CompanyName)
		.enterFirstName(Firstname)
		.enterSecondNAme(Lastname)
		.ClickCreateLead()
		.verify();
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}
	
	
}
