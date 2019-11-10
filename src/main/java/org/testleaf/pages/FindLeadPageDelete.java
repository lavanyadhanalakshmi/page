package org.testleaf.pages;

import org.openqa.selenium.WebElement;
import org.testleaf.baseAPI.ProjectSpecificMethods;

public class FindLeadPageDelete  extends ProjectSpecificMethods {
	public FindLeadPageDelete ClickPhone(){
		driver.findElementByXPath("//span[(text()='Phone')]").click();
		return this ;
	}
	public FindLeadPageDelete EntrePhoneNumber(String PhoneNumber) {
		driver.findElementByName("phoneNumber").sendKeys(PhoneNumber);
		return this;
		
	}
	
	public FindLeadPageDelete ClickFindLeadDeleButton() {
		driver.findElementByXPath("//button[text()= 'Find Leads']").click();
		return this;
	}
	
	public ViewLeadDelete CaptureLeadIDandClick() throws InterruptedException {
		Thread.sleep(5000);
		WebElement title = driver.findElementByXPath(
				"((//td[@class = 'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//div)[1]//a[1])");
		String LeadID= title.getText();
		System.out.println(LeadID);
		title.click();
		return new ViewLeadDelete();
	}

}
