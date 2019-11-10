package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class DeleteMyLead  extends ProjectSpecificMethods {

	public VerifyDeleteFindLeadPage ClickFindLeadDelete2() {
		driver.findElementByLinkText("Find Leads").click();
		return new VerifyDeleteFindLeadPage();
	}
}
	
