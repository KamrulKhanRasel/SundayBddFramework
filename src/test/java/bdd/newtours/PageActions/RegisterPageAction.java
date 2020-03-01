package bdd.newtours.PageActions;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import bdd.newtours.PageElements.RegisterPageLocators;
import bdd.utilities.ReadExcelSheetData;

public class RegisterPageAction {

	RegisterPageLocators newtoursRegisterPageLocators = new RegisterPageLocators();	
	ReadExcelSheetData ExcelData = new ReadExcelSheetData();
	
	public void fillUpContactInfo() throws IOException{
		newtoursRegisterPageLocators.FirstName.sendKeys(ReadExcelSheetData.getMapData("FirstName"));
		newtoursRegisterPageLocators.LastName.sendKeys("Khan");
		newtoursRegisterPageLocators.PhoneNumber.sendKeys("909090909");
		newtoursRegisterPageLocators.EmailAddress.sendKeys("rasel@gmail.com");
		
	}
	
	public void fillUpMailingInfo(){
		newtoursRegisterPageLocators.AddressLine1.sendKeys("123 mail");
		newtoursRegisterPageLocators.AddressLine2.sendKeys("apt 2f");
		newtoursRegisterPageLocators.City.sendKeys("New York");
		newtoursRegisterPageLocators.State.sendKeys("NY");
		newtoursRegisterPageLocators.Postal.sendKeys("1234");
		
		Select mydrpdwn = new Select(newtoursRegisterPageLocators.Country);
		mydrpdwn.selectByVisibleText("UNITED STATES");
	}
	
	public void fillUpUserInfo(String Username){
		
		newtoursRegisterPageLocators.UserName.sendKeys("raselkhan");
		newtoursRegisterPageLocators.Password.sendKeys("12345");
		newtoursRegisterPageLocators.ConfirmPassword.sendKeys("12345");
		
	}
	
	public void submitForm(){
		
		newtoursRegisterPageLocators.SubmitButton.click();
		
	}
}
