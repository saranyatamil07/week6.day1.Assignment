package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateLead extends BaseClass {
	
	
	@Given("Enter into Crate Leads tab")
	public void enterIntoCrateLeadsTab() {
		driver.findElement(By.linkText("Create Lead")).click();
		}
	@Given("Enter the companyName {string}")
	public void enterTheCompanyNameCompanyName(String CompanyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
	    
	}
	@Given("Enter the firstName {string}")
	public void enterTheFirstNameFirstName(String FirstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName); 
	}
	@Given("Enter the lastName {string}")
	public void enterTheLastNameLastName(String LastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
	}
	@When("click on submit button")
	public void clickOnSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
	    
	}
	@Then("created Lead page should be displayed")
	public void createdLeadPageShouldBeDisplayed() {
	  String title=driver.getTitle();
	  System.out.println(title);
	}

}
