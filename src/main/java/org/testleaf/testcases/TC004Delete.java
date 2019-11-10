package org.testleaf.testcases;

import org.testleaf.baseAPI.ProjectSpecificMethods;
import org.testleaf.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC004Delete extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "Data";
		Sheetname = "Delete";
	}

	@Test(dataProvider="fetchData")
	public void EditLead(String UserName, String Password, String PhoneNumber, String LeadName ) throws InterruptedException {
		new LoginPage()
		.enterUserName(UserName)
		.enterPassword(Password)
		.clickLogin()
		.clickCRMSFA()
		.ClickLead() 
		.ClickFindLeadDelete()
		.ClickPhone()
		.EntrePhoneNumber(PhoneNumber)
		.ClickFindLeadDeleButton()
		.CaptureLeadIDandClick()
		.ClickDelete()
		.ClickFindLeadDelete2()
		.enterLeadID(LeadName)
		.VerifyDisplay()
		.closeBrowser();
		
		
	}
}
