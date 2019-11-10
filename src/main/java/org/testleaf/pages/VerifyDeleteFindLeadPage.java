package org.testleaf.pages;

import org.openqa.selenium.WebElement;
import org.testleaf.baseAPI.ProjectSpecificMethods;

public class VerifyDeleteFindLeadPage  extends ProjectSpecificMethods{
	
	public VerifyDeleteFindLeadPage enterLeadID(String LeadName){
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(LeadName);
		return this;
	}
	
	public VerifyDeleteFindLeadPage ClickFindLeadDelete2() {
		driver.findElementByXPath("//button[text()= 'Find Leads']").click();
		return this;
	}
	public VerifyDeleteFindLeadPage VerifyDisplay() {
	WebElement delete = driver.findElementByXPath("//div[text() ='No records to display']");
	String DD= delete.getText();
	System.out.println(DD);
	
	if(DD.equals("No records to display"))
	{
		System.out.println("delete the Lead");
	}else {
		System.out.println(" Lead is not delete");
	}
	
	return this;
	}
}
