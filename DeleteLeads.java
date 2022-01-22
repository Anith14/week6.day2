package step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeads extends Base {
	String element;
	/*@Given("Open the chromeBrowser")
	public void open_the_chromebrowser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("Open the link")
	public void open_the_url() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();*/
	
	@Given("Login with username as {string}")
	public void login_with_username_as(String usern) {
		driver.findElement(By.id("username")).sendKeys(usern);
		
	}
	@Given("Login with password as {string}")
	public void login_with_password_as(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	@When("Click on the login")
	public void click_on_the_login() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("homepage should be display")
	public void homepage_should_be_display() {
		driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	}
	@When("Click on the {string}")
	public void click_on_the(String key) {
		driver.findElement(By.linkText(key)).click();
	  
	}
	@Then("{string} should be display")
	public void should_be_display(String text4) {
boolean displayed = driver.findElement(By.linkText(text4)/*("//div=[text()='"+text+"']"*/).isDisplayed();
		
		System.out.println(displayed);
		if(displayed) {
			System.out.println(text4+" displayed");
		}
		else {
			System.out.println(text4+"fails");}
	
	}
	@When("Click on phone")
	public void click_on_phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
	    
	}
	@Given("Enter the phone.no")
	public void enter_the_phone_no() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7");
	   
	}
	@When("Click on the findleads")
	public void click_on_the_findleads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	   
	}
	@Then("leadlist  should be display")
	public void leadlist_should_be_display() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).isDisplayed();
	    
	}
	@When("Click on the first coming  lead id")
	public void click_on_the_first_coming_lead_id() throws InterruptedException {
		Thread.sleep(2000);
		 WebElement element = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	   element.click();
	}
	@Given("Enter the leadid as leadID")
	public void enter_the_leadid_as_lead_id() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(element);
		}
	@When("click the button")
	public void click_the_button() {
		
		driver.findElement(By.linkText("Delete")).click();
	   
	}
	@Then("check the deleted lead exist or not")
	public void check_the_deleted_lead_exist_or_not() {
		String text5 = driver.findElement(By.className("x-paging-info")).getText();
		if (text5.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		driver.close();
}

}
