package org.testleaf.testcases;

import org.testleaf.baseAPI.ProjectSpecificMethods;
import org.testleaf.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC003DuplicateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "Data";
		Sheetname = "Duplicate";
	}

	@Test(dataProvider="fetchData")
	public void EditLead(String UserName, String Password, String EmailAddress) throws InterruptedException {
		new LoginPage()
		.enterUserName(UserName)
		.enterPassword(Password)
		.clickLogin()
		.clickCRMSFA()
		.ClickLead()
		.ClickFindLeadD()
		.ClickEmailId()
		.EntreEmailAdd(EmailAddress)
		.ClickFindLeadDButton()
		.ClickLeadListDup()
		.ClickDuplicate()
		.VerrifyTitle()
		.CpatureDuplicateNamefirstname()
		.closeBrowser();
		
	}	
		
}
