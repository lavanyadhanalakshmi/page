package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class ViewLeadDelete extends ProjectSpecificMethods{

	public DeleteMyLead ClickDelete(){
		driver.findElementByLinkText("Delete").click();
		return new DeleteMyLead();
	}
}
