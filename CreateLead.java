package assignments_steps;


import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends Base {
	
	
	@When("Click on the CRM link button")
		public  void CRMSFA() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	
		}
		@Then("Home Page should be Opened")
		public  void Verifyhomepage() {
			String title = driver.getTitle();
			if (title.equals("My Home | opentaps CRM")) {
				System.out.println("My Home Page Opened");
				
			}else {
				System.out.println("My Home Page Not Opened");
			}
		}
		@When("Click on Leads button")
		public  void Leadsbutton() {
			driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		}
		
		@Then("Leads Page should be Opened")
		public  void verifyLeadsPage() {
			String title1 = driver.getTitle();
			if (title1.equals("My Leads | opentaps CRM")) {
				System.out.println("Leads Page Opened");
				
			}else {
				System.out.println("Leads Page Not Opened");
			}
		}
		@When("Click on Create Lead button")
		public  void CreateLeads() {
			driver.findElement(By.linkText("Create Lead")).click();
		}
		@Then("Then Create Lead page should be opened")
		public  void verifyCreateLeadPage() {
			String title2 = driver.getTitle();
			if (title2.equals("Create Lead | opentaps CRM")) {
				System.out.println("Create Lead Page Opened");
				
			}else {
				System.out.println("Create Lead Page Not Opened");
			}
			
		}
		@Given("Enter Company Name")
		public  void companyName() {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("INTEGRA");
		}
		@And("Enter First Name")
		public  void firstName() {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manikandan");
			
		}
		@And("Enter Last Name")
		public  void lastName() {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
			
		}
		@And("Enter Phone Number")
		public  void phnum() {
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
			
		}
		@When("Click on Create Lead Button")
		public  void submitButton() {
			driver.findElement(By.name("submitButton")).click();
		}
		@Then("View Lead page should be Opened")
		public void verifyleadpage() {
			String title3 = driver.getTitle();
			if (title3.equals("View Lead | opentaps CRM")) {
				System.out.println("View Lead Page Opened");
				
			}else {
				System.out.println("View Lead Page Not Opened");
			}
		}
	}






