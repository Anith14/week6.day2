package step;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeads extends Base{
	
	@When("Click on {string} link")
	public void click_on_login_button(String linktext) {
		driver.findElement(By.linkText(linktext)).click();
	}

	 @Then("{string} page should be displayed")
	public void homepage_should_be_displayed(String text) {
		boolean displayed = driver.findElement(By.linkText(text)/*("//div=[text()='"+text+"']"*/).isDisplayed();
		
		System.out.println(displayed);
		if(displayed) {
			System.out.println(text+" displayed");
		}
		else {
			System.out.println(text+"fails");}
		}
		@When("When Click on {string} link")
		public void clclick(String linktext1) {
			driver.findElement(By.linkText(linktext1)).click();
		}
		 @Then("{string} page should be displayed ")
			public void clopen(String text1) {
				boolean displayed = driver.findElement(By.linkText(text1)/*("//div=[text()='"+text+"']"*/).isDisplayed();
				
				System.out.println(displayed);
				if(displayed) {
					System.out.println(text1+" displayed");
				}
				else {
					System.out.println(text1+"fails");
}
	    
	}
	}

