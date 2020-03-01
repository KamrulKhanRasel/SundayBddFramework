 package bdd.google.PageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.google.PageElements.GoogleSearchLocator;
import bdd.utilities.SetupDrivers;

public class GoogleSearchAction {
	
	GoogleSearchLocator GoogleSearchLocatorObj;
	
	public GoogleSearchAction(){
		GoogleSearchLocatorObj = new GoogleSearchLocator(); 
		PageFactory.initElements(SetupDrivers.driver, GoogleSearchLocatorObj);
	}
	

	
	public void BrowsToGoogle() throws Exception{
		SetupDrivers.driver.get("https://www.google.com/");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void SearchByKeyWord(String keyword){

		GoogleSearchLocatorObj.SearchBar.sendKeys(keyword);
		GoogleSearchLocatorObj.SearchButton.click();
	}
}
