package org.testleaf.pages;

import org.openqa.selenium.WebElement;
import org.testleaf.baseAPI.ProjectSpecificMethods;

public class FindLeadPageDuplicate extends ProjectSpecificMethods {
	public FindLeadPageDuplicate ClickEmailId(){
		driver.findElementByXPath("//span[(text()='Email')]").click();
		return this ;
	}

	public FindLeadPageDuplicate EntreEmailAdd(String EmailAddress) {
		driver.findElementByName("emailAddress").sendKeys(EmailAddress);
		return this;
		
	}
	
	public FindLeadPageDuplicate ClickFindLeadDButton() {
		driver.findElementByXPath("//button[text()= 'Find Leads']").click();
		return this;
	}
	
	public ViewLeadDuplicatePage ClickLeadListDup() throws InterruptedException {
		Thread.sleep(2000);
		WebElement name = driver
				.findElementByXPath("((//td[@class= 'x-grid3-col x-grid3-cell x-grid3-td-firstName '])/div/a[1])[1]");
		String getName = name.getText();
		System.out.println(getName);
		name.click();
	/*return getName;*/
		return new ViewLeadDuplicatePage();
	
}
}
	
	