package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class ViewLeadDuplicatePage extends ProjectSpecificMethods {
	
	public DuplicateLeadPage ClickDuplicate(){
		driver.findElementByLinkText("Duplicate Lead").click();
		return new DuplicateLeadPage();
	}
	
	

}
