package com.LeadModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.OmistusCrm.generic.FileLib;
import com.OmistusCrm.generic.IAutoConsts;
import com.OmistusCrm.generic.WebDriverCommonLib;
import com.OmistusPages.CreateLeadPage;
import com.OmistusPages.DisplayingCustomViewDetailsPage;
import com.OmistusPages.HomePage;
import com.OmistusPages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class leadcreation implements IAutoConsts {
	WebDriver driver;
	FileLib fl;
	WebDriverCommonLib wdlib= new WebDriverCommonLib();
	LoginPage lp;
	HomePage hp;
	DisplayingCustomViewDetailsPage Dcp;
	CreateLeadPage clp;
	@Before
	public void setup() {
		System.out.println("i am setup method");
	}
	@After
	public void tearDown() {
		System.out.println("i am tearDown method");
		driver.quit();
	}
	
	@Given("browser is avalable")
	public void browser_is_avalable() throws Throwable {
		fl= new FileLib();
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(fl.readPropData(PROP_PATH, "url"));
	}

	@When("giving valid user login credentials")
	public void giving_valid_user_login_credentials() throws Throwable {
		lp =new LoginPage(driver);
		  lp.login(fl.readPropData(PROP_PATH, "username"), fl.readPropData(PROP_PATH, "password")); 
	}

	@And("user clicking leadmodule")
	public void user_clicking_leadmodule() throws Throwable {
	   hp=new HomePage(driver);
	   hp.clickLeadModule();
	   Thread.sleep(2000);
	   if (driver.getTitle().equals("Zoho CRM - Displaying Custom View Details")) {
			System.out.println("Zoho CRM - Displaying Custom View Details is displayed");
		} else {
			System.out.println("Zoho CRM - Displaying Custom View Details is notdisplayed");
		}
	   Dcp= new DisplayingCustomViewDetailsPage(driver);
        Dcp.clickNewLeadBtn();
	   Thread.sleep(2000);
	}

	@And("user created lead with valid Data")
	public void user_created_lead_with_valid_data() throws Throwable {
	    clp=new CreateLeadPage(driver);
	    clp.enterFirstname(fl.readDataFromExcel(EXCEL_PATH, "leadModule", 0, 0));
	    clp.enterLastname(fl.readDataFromExcel(EXCEL_PATH, "leadModule", 0, 1));
	    clp.EnterCompanyName(fl.readDataFromExcel(EXCEL_PATH,"leadModule" , 1, 0));
	    
	clp.clicksaveBtn();
	Thread.sleep(2000);
	}

	@Then("user navigated to leads details page")
	public void user_navigated_to_leads_details_page() {
		System.out.println("user navigated to leads details page");
	}


}
