package com.OmistusPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadPage {
	@FindBy(xpath="//input[@name='property(First Name)']")private WebElement firstNameText;
	@FindBy(xpath="//div[text()='* Required Field(s)']/ancestor::table/following-sibling::table[1]/descendant::input[@value='Save']")
	private WebElement saveBtn;
	@FindBy(xpath="//input[@name=\"property(Company)\"]")private WebElement companyText;
	@FindBy(xpath="//input[@name=\"property(Last Name)\"]") private WebElement lastNme;
	@FindBy(xpath="//select[@name='property(Lead Source)']")private WebElement LeadSource;
    @FindBy(xpath="//img[@title='Campaign Name Lookup']")private WebElement Campaignlookup;
	
	public CreateLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameText() {
		return firstNameText;
	}
	
	public void enterFirstname(String firstname) {
		firstNameText.sendKeys(firstname);
	}
	

	public WebElement getCompanyText() {
		return companyText;
	}
public void EnterCompanyName(String companyname) {
	companyText.sendKeys(companyname);
}

	public WebElement getLastNme() {
	return lastNme;
}
	public void enterLastname(String lastname) {
		lastNme.sendKeys(lastname);
	}
	

	public WebElement getLeadSource() {
		return LeadSource;
	}
	public void clickLeadSource() {
		LeadSource.click();
	}
	public void selectLeadSourceDropdown(String Value) {
		Select sel=new Select(LeadSource);
		sel.selectByValue(Value);
	}
	
	
	public WebElement getCampaignlookup() {
		return Campaignlookup;
	}

	public void clickCampaignlookup() {
		Campaignlookup.click();
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void clicksaveBtn() {
		saveBtn.click();
	}
	
 
}
