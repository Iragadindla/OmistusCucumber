package com.filib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.OmistusCrm.generic.FileLib;
import com.OmistusCrm.generic.IAutoConsts;
import com.OmistusCrm.generic.WebDriverCommonLib;
import com.OmistusPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login implements IAutoConsts {
	WebDriver driver;
	FileLib fl;
	WebDriverCommonLib wdlib= new WebDriverCommonLib();
	LoginPage lp;
	@Given("browser open")
	public void browser_open () throws Throwable {
		fl= new FileLib();
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(fl.readPropData(PROP_PATH, "url"));
	}

	@When("login application")
	public void login_application() throws Throwable {
		lp =new LoginPage(driver);
	  lp.login(fl.readPropData(PROP_PATH, "username"), fl.readPropData(PROP_PATH, "password")); 

	}

	@Then("navigates to requiredPage")
	public void navigates_to_required_page() {
	    System.out.println("sreekanth");
	}

}
