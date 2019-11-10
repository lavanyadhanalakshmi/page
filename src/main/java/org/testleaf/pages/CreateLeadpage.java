package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class CreateLeadpage extends ProjectSpecificMethods {

	public CreateLeadpage enterCompanyName(String CompanyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(CompanyName);
		return this;
	}	
	public CreateLeadpage enterFirstName(String Firstname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(Firstname);
		return this;
	}		
	public CreateLeadpage enterSecondNAme(String Lastname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(Lastname);
		return this;
	}
	
	public ViewLeadPage ClickCreateLead() {
		driver.findElementByXPath("//input[@ value ='Create Lead']").click();
		return new ViewLeadPage() ;
	}
}
