package org.testleaf.pages;

import org.openqa.selenium.WebElement;
import org.testleaf.baseAPI.ProjectSpecificMethods;

public class ViewEditLeadPage extends ProjectSpecificMethods {
	public ViewEditLeadPage ClickEdit(){
		driver.findElementByLinkText("Edit").click();
		return this ;
	}
	
	public ViewEditLeadPage EnterNewCompanyname(String NewCompanyName) throws InterruptedException{
		WebElement company = driver.findElementById("updateLeadForm_companyName");
		String Name1 = company.getAttribute("value");
		Thread.sleep(5000);
		System.out.println("the name before edit is" + " " + Name1);
		company.clear();
		company.sendKeys(NewCompanyName);
		return this ;
	}
	
	public UpdateViewEditLeadPage ClickUpdate() {
		driver.findElementByName("submitButton").click();
		return new UpdateViewEditLeadPage();
	}
	 
}
