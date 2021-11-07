package assignments_steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends Base{
	
	@When("Click the CRM link button")
	public void CRM() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When("Click the Leads button")
	public void clickLead() {
		driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
	}
	
	@When("Click on Finds Leads")
	public void FindsLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@Then("Find Leads page should be Opened")
	public void verifyFindsLead() {
		String expecttitle = "Find Leads | opentaps CRM";
		String acttitle = driver.getTitle();
		Assert.assertEquals(expecttitle, acttitle);
	}
	@When("Click on Phone")
	public void Phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
	}
	@Given("Phone Number")
	public void PhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");	
	}
	@When("Click on Find Leads search button")
	public void SearchButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Then("Lead List should be displayed")
	public void LeadList() {
	String text = driver.findElement(By.xpath("//span[text() = 'Lead List']")).getText();
	String exptext = "Lead List";
	Assert.assertEquals(exptext, text);
	}
	
	//error
	@When("click the First Lead Link")
	public void firstLead() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	}
	
	
	@Then("View Lead should be Opened")
	public void verifyViewLead() {
		String expecttitle = "View Lead | opentaps CRM";
		String acttitle = driver.getTitle();
		Assert.assertEquals(expecttitle, acttitle);
	}
	@When("Click on the Edit Button")
	public void editButton() {
		driver.findElement(By.linkText("Edit")).click();
	}
	@Then("Edit Lead form should be displayed")
	public void editLeadForm() {
	String text = driver.findElement(By.xpath("//div[text() = 'Edit Lead']")).getText();
	String exptext = "Edit Lead";
	Assert.assertEquals(exptext, text);
	}
	@Given("Company Name")
	public void Update() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	}
	
	@When("Click on the Update Button")
	public void UpdateButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	public void verifyViewLead1() {
		String expecttitle = "View Lead | opentaps CRM";
		String acttitle = driver.getTitle();
		Assert.assertEquals(expecttitle, acttitle);
		
	}

}
