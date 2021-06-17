package crmMultipleSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.OmistusCrm.generic.FileLib;
import com.OmistusPages.CreateCampaignPage;
import com.OmistusPages.DisplayingCustomViewDetailsPage;
import com.OmistusPages.HomePage;
import com.OmistusPages.LoginPage;
import com.OmistusPages.createPotentialPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiScenarioSteps {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://192.168.174.128:8080/crm/HomePage.do");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() {
		System.out.println("iam tearDown method where u close the browser");
		driver.quit();
	}
	LoginPage lp;
	HomePage hp;
	DisplayingCustomViewDetailsPage Dcp ;
	CreateCampaignPage cp ;
	createPotentialPage Cpp ;

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
	}

	@When("^user Pass valid username and password$")
	public void user_Pass_valid_username_and_password() throws InterruptedException {
		lp = new LoginPage(driver);
		lp.getUntb().sendKeys("rashmi@dell.com");
		lp.getPwtb().sendKeys("123456");
		lp.getSignInBtn().click();
		Thread.sleep(2000);
	}
	
	@Then("^user navigates to home page$")
	public void user_navigates_to_home_page() {
		System.out.println("user navigates to home page");
	}

	@And("^user click on campaign module$")
	public void user_click_on_campaign_module() throws InterruptedException {
		hp= new HomePage(driver);
		hp.clickCampaignLink();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^campaign list page is displayed$")
	public void campaign_list_page_is_displayed() throws InterruptedException {
		 Thread.sleep(2000);
		if (driver.getTitle().equals("Zoho CRM - Displaying Custom View Details")) {
			System.out.println("Zoho CRM - Displaying Custom View Details page is displayed");
		} else {
			System.out.println("Zoho CRM - Displaying Custom View Details page is notdisplayed");
		}
		
	}
	
	@When("^user click on <Newcampaign button$")
	public void user_click_on_newcampaign_button() {
		Dcp = new DisplayingCustomViewDetailsPage(driver);
		Dcp.clickNewCampaignBtn();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Then("^create Newcampaign page is displayed$")
	public void create_newcampaign_page_is_displayed() {
		if (driver.getTitle().equals("Zoho CRM - Create Campaign")) {
			System.out.println("Zoho CRM - Create Campaign page is displayed");
		} else {
			System.out.println("Zoho CRM - Create Campaign page is notdisplayed");
		}

	}
	
	@When("give valid campaignName and Numvalue")
	public void give_valid_campaign_name_and_numvalue() {
	    cp=new CreateCampaignPage(driver);
        cp.getCampaignName().sendKeys("Pawan Kalyan");
	    cp.getNumSent().sendKeys("300");
	}
     

	@When("^click on saveBtn$")
	public void click_on_save_btn() {
		cp = new CreateCampaignPage(driver);
		cp.clicksavebtn();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^user is navigated to campaign details page$")
	public void user_is_navigated_to_campaign_details_page() {
		if (driver.getTitle().equals("Zoho CRM - Campaign Details")) {
			System.out.println("Zoho CRM - Campaign Details page is displayed");
		} else {
			System.out.println("Zoho CRM - Campaign Details page is notdisplayed");
		}
	}

	@When("^user click on Potentials module$")
	public void user_click_on_potentials_module() {
		hp = new HomePage(driver);
		hp.clickPotentialLink();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("^Potential list page is displayed$")
	public void potential_list_page_is_displayed() {
		if (driver.getTitle().equals("Zoho CRM - Displaying Custom View Details")) {
			System.out.println("Zoho CRM - Displaying Custom View Details page is displayed");
		} else {
			System.out.println("Zoho CRM - Displaying Custom View Details page is notdisplayed");
		}
	}

	@When("^user clicks on Potential button$")
	public void user_clicks_on_potential_button() {
		Dcp = new DisplayingCustomViewDetailsPage(driver);
		Dcp.clickNewPotentailBtn();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^create Potential page is displayed$")
	public void create_potential_page_is_displayed() {
		if (driver.getTitle().equals("Zoho CRM - Create Potential")) {
			System.out.println("Zoho CRM - Create Potential page is displayed");
		} else {
			System.out.println("Zoho CRM - Create Potential page is notdisplayed");
		}
	}

	@When("^user give valid (.*)$")
	public void user_give_valid_srikant(String PotentialName) throws InterruptedException {
		Cpp = new createPotentialPage(driver);
Thread.sleep(3000);
		Cpp.EnterPotenialName(PotentialName);

	}

	@When("^user clicks on saveBtn$")
	public void user_clicks_on_save_btn() {
		Cpp = new createPotentialPage(driver);

		Cpp.ClickSaveBtn();
	}

	@Then("^user is navigated to Potential details page$")
	public void user_is_navigated_to_potential_details_page() {
		System.out.println("Potential details page");
	}
}
