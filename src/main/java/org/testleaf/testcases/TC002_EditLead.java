package org.testleaf.testcases;

import org.testleaf.baseAPI.ProjectSpecificMethods;
import org.testleaf.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002_EditLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "Data";
		Sheetname = "EditLead";
	}

	@Test(dataProvider="fetchData")
	public void EditLead(String UserName, String Password, String EditFirstName, String NewCompanyName) throws InterruptedException {
		new LoginPage()
		.enterUserName(UserName)
		.enterPassword(Password)
		.clickLogin()
		.clickCRMSFA()
		.ClickLead()
		.ClickFindLeads()
		.enterFirstName(EditFirstName)
		.ClickFindLead()
		.ClickLeadList()
		.ClickEdit()
		.EnterNewCompanyname(NewCompanyName)
		.ClickUpdate()
		.VerfiytheCompanyName()
		.closeBrowser();
		
		
	}


}
