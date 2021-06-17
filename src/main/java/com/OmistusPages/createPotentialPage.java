package com.OmistusPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class createPotentialPage {
	
	@FindBy(xpath="//input[@name='property(Potential Name)']")private WebElement PotentialName;
@FindBy(xpath="//td[contains(text(),'Create Potential')]/ancestor::table/following-sibling::table[2]/descendant::input[@value='Save']")
private WebElement SaveButton;
	public createPotentialPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		
	}

	public WebElement getPotentialName() {
		return PotentialName;
	}
	
	public void EnterPotenialName(String PotentailName) {
		PotentialName.sendKeys(PotentailName);
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
	public void ClickSaveBtn() {
		SaveButton.click();
	}
	
}