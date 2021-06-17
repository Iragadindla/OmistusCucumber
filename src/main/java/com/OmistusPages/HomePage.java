package com.OmistusPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
	
	@FindBy(xpath = "//a[text()='Campaigns']") private WebElement campaignsLink;
	@FindBy(xpath="//a[text()='Potentials']")private WebElement potentialLink;
	@FindBy(xpath="//a[text()='Leads']")private WebElement LeadsModule;
	

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCampaignsLink() {
		return campaignsLink;
	}
	public void clickCampaignLink() {
		campaignsLink.click();
	}
	public WebElement getPotentialLink() {
		return potentialLink;
	}
	public void clickPotentialLink() {
		potentialLink.click();
	}
	public WebElement getLeadsModule() {
		return LeadsModule;
	}
	public void clickLeadModule() {
		LeadsModule.click();
	}
}
