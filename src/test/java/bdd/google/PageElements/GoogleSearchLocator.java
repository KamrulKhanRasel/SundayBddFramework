package bdd.google.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchLocator {
	
	@FindBy(xpath = "//input[@title='Search']")
	 public WebElement SearchBar;
	
	@FindBy(xpath = "//input[@value='Google Search']")
	 public WebElement SearchButton;
}
