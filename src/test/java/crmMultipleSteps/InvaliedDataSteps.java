package crmMultipleSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.OmistusPages.CreateCampaignPage;
import com.OmistusPages.DisplayingCustomViewDetailsPage;
import com.OmistusPages.HomePage;
import com.OmistusPages.LoginPage;
import com.OmistusPages.createPotentialPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvaliedDataSteps {	

WebDriver driver;
@Before
public void setup() {
	System.out.println("i am setup method");
}
@After
public void tearDown() {
	System.out.println("i am tearDown method");
	driver.quit();
}

LoginPage lp;

	@Given("^Open the browser$")
	public void open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver(); 
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^Enter the url$")
	public void enter_the_url() {
		driver.get("http://192.168.174.128:8080/crm/HomePage.do");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Given("^I am in login page$")
	public void i_am_in_login_page() {
		System.out.println("I am in login page");
	}

	@When("^gives valid (.*) and (.*)$")
	public void gives_valid_rashmi_dell_com_and(String un,String pwd) throws Throwable {
		lp = new LoginPage(driver);
		lp.getUntb().sendKeys(un);
		lp.getPwtb().sendKeys(pwd);
		lp.getSignInBtn().click();
		Thread.sleep(2000);
	}

	@Then("^I am navigated to home page$")
	public void i_am_navigated_to_home_page() {
		System.out.println("I am navigated to home page"); 
	}

	

}