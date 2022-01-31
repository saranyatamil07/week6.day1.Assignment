package Steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class EditLead extends BaseClass{
	
	@Given("click on the Find Lead button")
	public void clickOnTheFindLeadButton() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Given("click on phone")
	public void clickOnPhoneAndGiveNumber() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("Enter the number")
	public void enterNumber() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		Thread.sleep(2000);
	}

	@Given("click on FindLead button")
	public void clickOnFindLeadButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@Then("select first lead")
	public void selectFirstLead() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Thread.sleep(2000);
	}
	@Then("click on Edit")
	public void clickEdit()
	{
		driver.findElement(By.linkText("Edit")).click();
	}

	@Given("update the company name")
	public void updateTheCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	}
	@When("click on submit button")
	public void clickSubmit()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("view Lead Page")
	public void viewLeadPage() {
		String title=driver.getTitle();
		System.out.println(title);

}}
