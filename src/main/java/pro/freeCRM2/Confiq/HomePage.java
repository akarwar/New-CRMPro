package pro.freeCRM2.Confiq;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pro.freeCRM2.Utilities.BaseProject;

public class HomePage extends BaseProject {
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]") WebElement dealsLink;
	@FindBy(xpath = "//a[contains(text(),'Contacts')]") WebElement contactsLink;
	@FindBy(xpath = "//a[@title='New Contact']") WebElement newContactLink;
	@FindBy(id = "first_name") WebElement firstName;
	@FindBy(xpath = "//input[@id='surname']") WebElement lastName;
	@FindBy(xpath = "//input[@value='Save']") WebElement saveButton;

	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void clickonNewContactLink() {
		Actions action = new Actions(driver);
		driver.switchTo().frame("mainpanel");
		action.moveToElement(driver.findElement(By.xpath("html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/a"))).build().perform();
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
		
		
	}
	public void firstName() {
		firstName.sendKeys("Joyce");
	}
	public void lastName() {
		lastName.sendKeys("Chiriga");
	}
	public void clickSave() {
		saveButton.click();
	}
	
}
