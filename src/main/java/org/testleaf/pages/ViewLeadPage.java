package org.testleaf.pages;

import org.testleaf.baseAPI.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods  {
	public ViewLeadPage verify() {
		String firstname = driver.findElementById("viewLead_firstName_sp").getText();
		if (firstname.contains("laav")) {
			System.out.println(firstname + "  " + "name is correct");
		} else {
			System.out.println("name is not maatched");
		}
return this;
		
	}

}
