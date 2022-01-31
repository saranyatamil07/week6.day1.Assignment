package Steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends BaseClass{
	

@Given("click on FindLeads")
public void clickOnFindLeads1() {
	driver.findElement(By.linkText("Find Leads")).click();
}
@Then("select phone tab")
public void selectPhobeTab() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
}
@Given ("Enter the  number")
public void EnterThemobNumber()
{
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
}
@Given ("click on FindLead button")
public void clickFindLead() throws InterruptedException
{
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
}

@Then ("select first lead")
public void selectFirstLeadShown()
{
	String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	
}

@When("Search lead")
public void searchLead() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	
}
@Then("click on Delete Lead")
public void clickOnDeleteLead() {
	driver.findElement(By.linkText("Delete")).click();
}
@Then("Click on Find Leads")
public void clickOnFindLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
}


}
