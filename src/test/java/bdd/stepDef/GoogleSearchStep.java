package bdd.stepDef;


import bdd.google.PageAction.GoogleSearchAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleSearchStep {
	GoogleSearchAction GoogleSearchActionObj = new GoogleSearchAction();
	
	@Given("^Browse to Google homepage$")
	public void browse_to_Google_homepage() throws Throwable {
		GoogleSearchActionObj.BrowsToGoogle();

	}

	@When("^Search by \"([^\"]*)\"$")
	public void search_by(String keyword) throws Throwable {
		GoogleSearchActionObj.SearchByKeyWord(keyword);
	}

	@Then("^Verify search result appear$")
	public void verify_search_result_appear() throws Throwable {
		System.out.println("Test Complete");
	}

}
