package com.OmistusPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class DisplayingCustomViewDetailsPage {
	@FindBy(xpath = "//input[@value='New Campaign']")
	private WebElement NewCampaignBtn;
	@FindBy(xpath="//input[@value='New Potential']")
	private WebElement NewPotentialBtn;
	@FindBy(xpath = "//input[@value= 'New Lead']")private WebElement NewLeadBtn;
	
	public DisplayingCustomViewDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getNewCampaignBtn() {
		return NewCampaignBtn;
	}

	public void clickNewCampaignBtn() {
		NewCampaignBtn.click();

	}
	public WebElement getNewPotentialBtn() {
		return NewPotentialBtn;
	}
public void clickNewPotentailBtn() {
	NewPotentialBtn.click();
}

public WebElement getNewLeadBtn() {
	return NewLeadBtn;
}
public void clickNewLeadBtn() {
	NewLeadBtn.click();
}
}
	

	
	