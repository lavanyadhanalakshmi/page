package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods{
	
	public DuplicateLeadPage VerrifyTitle() {
		String duplititle = driver.getTitle();
		if (duplititle.startsWith("Duplicate")) {
			System.out.println("Your title is: " + duplititle + " And your title is correct");
		} else {
			System.out.println("Your title is: " + duplititle + " And your title is incorrect");
		}
	
	return this;
}
	public DuplicateLeadPage CpatureDuplicateNamefirstname() {
		String firstname = driver.findElementById("createLeadForm_firstName").getAttribute("value");
		System.out.println(firstname);
		if ("lead2".equals(firstname)) {
			System.out.println(firstname + "  " + "name is correct");
		} else {
			System.out.println("name is not maatched");
		}
	
	return this;
}
}
