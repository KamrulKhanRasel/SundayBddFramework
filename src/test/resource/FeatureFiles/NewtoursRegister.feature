@Newtour
Feature: Users ability to create account

Scenario Outline: User should be able to create account using Register

		Given Browser to Newtours homepage
		When Navigate to Register page
		And Fill form with some basic information
		And Complete creating account with "<UserName>"
		Then VErify account created succesfully
		
		Examples:
			|UserName  	 |
			|Sam	     |
#			|Alex		 |