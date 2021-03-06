package bdd.stepDef;

import bdd.newtours.PageActions.NewtoursHomePageAction;
import bdd.newtours.PageActions.RegisterConfrPageAction;
import bdd.newtours.PageActions.RegisterPageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewtoursRegisterSteps {

	NewtoursHomePageAction homePageAction = new NewtoursHomePageAction();
	RegisterPageAction newtoursRegisterPageAction = new  RegisterPageAction();
	RegisterConfrPageAction registerConfrPageActionObj = new RegisterConfrPageAction();
			
	@Given("^Browser to Newtours homepage$")
	public void browser_to_Newtours_homepage() throws Throwable {
		homePageAction.launchNewtoursHomepage();
	}

	@When("^Navigate to Register page$")
	public void navigate_to_Register_page() throws Throwable {
		homePageAction.NavigatetoRegisterPage();
	}

	@When("^Fill form with some basic information$")
	public void fill_form_with_some_basic_information() throws Throwable {
		newtoursRegisterPageAction.fillUpContactInfo();
		newtoursRegisterPageAction.fillUpMailingInfo();

		
	}

	@When("^Complete creating account with \"([^\"]*)\"$")
	public void complete_creating_account_with(String UserName) throws Throwable {
		newtoursRegisterPageAction.fillUpUserInfo(UserName);
		newtoursRegisterPageAction.submitForm();
	}

	@Then("^VErify account created succesfully$")
	public void verify_account_created_succesfully() throws Throwable {
	  registerConfrPageActionObj.verifyThankyouRegister();
	}


	
}
