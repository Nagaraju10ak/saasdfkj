package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadTestSteps {
/*	public RemoteWebDriver driver;

	@Given("open chrome browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
@And("maximize the browser")
	public void maxBrowser() {
		driver.manage().window().maximize();
	}
@And("set timeout")
	public void setWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

@And("Enter the URL as (.*)")
public void enterURL(String data) {
	driver.get(data);
}

@And("Enter the username as (.*)")
public void enterUsername(String data) {
	driver.findElementById("username").sendKeys(data);
}

@And("Enter the password as (.*)")
public void enterpassword(String data) {
	driver.findElementById("password").sendKeys(data);
}

@And("click on login button")
public void clickLogin() {
	driver.findElementByClassName("decorativeSubmit").click();
}

@And("Click on crmsfa logo")
public void clickCRMSFA() {
	driver.findElementByLinkText("CRM/SFA").click();
}

@And("click on Lead")
public void clickLeads() {
	driver.findElementByLinkText("Leads").click();
}

@And("click on create lead")
public void clickCreateLeads() {
	driver.findElementByLinkText("Create Lead").click();
}

@And("enter company name as (.*)")
public void enterCompanyName(String data) {
	driver.findElementById("createLeadForm_companyName").sendKeys(data);
}

@And("enter first name as (.*)")
public void enterFirstName(String data) {
	driver.findElementById("createLeadForm_firstName").sendKeys(data);
}

@And("enter last name as (.*)")
public void enterLastName(String data) {
	driver.findElementById("createLeadForm_lastName").sendKeys(data);
}

@When("click create lead button")
public void clickCreateLeadButton() {
	driver.findElementByName("submitButton").click();
}

@Then("verify first name as (.*)")
public void verifyName(String data) {
	String name = driver.findElementById("viewLead_firstName_sp").getText();
	if(name.equalsIgnoreCase(data)) {
		System.out.println("Lead created successfully");
		driver.close();
		
	}
	else {
		System.out.println("Your coding is not good");
		driver.close();

	}
*/	
	
	/*@Then("Login is success")
	public void loginOleaf() {
		System.out.println("Login success");
	}
	
	@Then("Login is not success")
	public void login1() {
		System.out.println("Login is not success");
	}*/
//}

















}
