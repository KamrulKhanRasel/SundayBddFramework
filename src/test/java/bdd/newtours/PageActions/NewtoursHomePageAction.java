package bdd.newtours.PageActions;


import java.util.concurrent.TimeUnit;

import bdd.newtours.PageElements.HomePageLocators;
import bdd.utilities.SetupDrivers;

public class NewtoursHomePageAction {

	HomePageLocators newtoursHomePageLocators = new HomePageLocators();
	
	public void launchNewtoursHomepage() throws Exception{
		//System.out.println(ReadExcelSheetData.getMapData("FirstName"));
		SetupDrivers.driver.get("http:/newtours.demoaunt.com/");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void NavigatetoRegisterPage(){
		
		newtoursHomePageLocators.RegisterButton.click();
		
	}
}

