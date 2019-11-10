package org.testleaf.pages;

import org.openqa.selenium.WebElement;
import org.testleaf.baseAPI.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods { 
	
	public FindLeadPage enterFirstName(String EditFirstName){
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(EditFirstName);
		return this ;
	}
	
	public FindLeadPage ClickFindLead() {
		driver.findElementByXPath("//button[text()= 'Find Leads']").click();
		return this;
	}
	
	public ViewEditLeadPage ClickLeadList() throws InterruptedException {
		Thread.sleep(5000);
		WebElement title = driver.findElementByXPath(
				"((//td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//div)[1]//a[1])");
		title.click();
		String head = driver.getTitle();
		System.out.println("the current title is" + "" + head);
		return new ViewEditLeadPage();
	}

}
