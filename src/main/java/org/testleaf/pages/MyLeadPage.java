package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods {
	public CreateLeadpage ClickCreatelead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadpage();
	}

	public FindLeadPage ClickFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadPage();
	}
	public FindLeadPageDuplicate ClickFindLeadD() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadPageDuplicate();
	}
	public FindLeadPageDelete ClickFindLeadDelete() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadPageDelete();
	}
}
