package org.testleaf.pages;

import org.openqa.selenium.WebElement;
import org.testleaf.baseAPI.ProjectSpecificMethods;

public class UpdateViewEditLeadPage  extends ProjectSpecificMethods{
	
	public UpdateViewEditLeadPage VerfiytheCompanyName() throws InterruptedException {
		Thread.sleep(5000);
		WebElement company2 = driver.findElementById("viewLead_companyName_sp");
		String Name2 = company2.getText();
		System.out.println("Edited name:" + Name2);
		String patterns = "[ ()0-9]";
		String firstNq = Name2.replaceAll(patterns, "");

		System.out.println("the name after edit is" + " " + firstNq);

		if (firstNq.contains("Acc")) {
			System.out.println("the company name is same ");

		} else {

			System.out.println("the company name is diff ");

		}
		return this;
	}
	
}
