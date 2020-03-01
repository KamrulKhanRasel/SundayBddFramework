package bdd.newtours.PageActions;

import org.junit.Assert;

import bdd.newtours.PageElements.RegisterConfrPageLocators;

public class RegisterConfrPageAction {
	RegisterConfrPageLocators RegisterConfrPageLocators = new RegisterConfrPageLocators();

	public void verifyThankyouRegister(){
	String confMsg = RegisterConfrPageLocators.TxtThankYou.getText();
	Assert.assertEquals(confMsg, "Thank you for registering. You may now sign-in using the user name and password");
	}
	
}
