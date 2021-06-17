package com.OmistusPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	@FindBy(name = "property(Campaign Name)")
	private WebElement CampaignName;
	@FindBy(xpath="//input[@name='property(Num sent)']")private WebElement NumSent;
	@FindBy(xpath = "//td[contains(text(),'Create Campaign')]/ancestor::table/following-sibling::table[2]/descendant::input[@value='Save']")
	private WebElement saveBtn;
	
	
	public CreateCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getCampaignName() {
		return CampaignName;
	}

	public void enterCampaignName(String campaignName) {
		CampaignName.sendKeys(campaignName);

	}
	
	public WebElement getNumSent() {
		return NumSent;
	}

	public void EnterNumSent(String Num) {
		NumSent.sendKeys(Num);
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
     public void clicksavebtn() {
    	 saveBtn.click();
     }

	


     
}
