package Steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class DuplicateLead extends BaseClass{
	
	@Given("Given click on FindLeads")
	public void clickFindLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Given("click on the phone tab")
	public void clickOnThePhoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("Enter the number")
	public void enterTheNumber() {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	}
	@Given("click on the find lead button")
	public void clickOnTheFindLeadButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@Given("select first lead")
	public void selectFirstLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Given("click on duplicate Lead button")
	public void clickOnDuplicateLeadButton() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@Given("click on submit Button")
	public void clickOnSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
	}
}
