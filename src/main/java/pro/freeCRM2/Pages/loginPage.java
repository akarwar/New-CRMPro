package pro.freeCRM2.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pro.freeCRM2.Confiq.HomePage;
import pro.freeCRM2.Utilities.BaseProject;

public class loginPage extends BaseProject {
	
	
	//define object
	@FindBy(xpath= "//img[contains(@alt,'free crm logo')]") WebElement CRMLogo;
	@FindBy(xpath= "//small[contains(.,'Forgot Password?')]") WebElement forgotpasswordLink;
	@FindBy(xpath= "//a[contains(.,'Features')]") WebElement FeaturesLink;
	@FindBy(xpath= "//a[contains(.,'Sign Up')]") WebElement SingupLink;
	@FindBy(xpath= "//a[contains(.,'Pricing')]") WebElement PricingLink;
	@FindBy(xpath= "//a[contains(.,'Customers')]") WebElement CustomersLink;
	@FindBy(xpath= "//a[contains(.,'Contact')]") WebElement ContactLink;
	@FindBy(name= "username") WebElement UsernameLink;
	@FindBy(name= "password") WebElement PasswordLink;
	@FindBy(xpath = "//input[@value='Login']") WebElement LoginLink;
	
	
	//Initializing the page object
public loginPage() {
	PageFactory.initElements(driver, this);
	
		
	}

public String validateLoginTitle() {
	return driver.getTitle();
	
}

public boolean validateCRMLOGO() {
	return CRMLogo.isDisplayed();
	
}

public boolean validateForgotPasswordLink() {
	return forgotpasswordLink.isDisplayed();
	
}

public boolean validateFeaturesLink() {
	return FeaturesLink.isDisplayed();
	
}

public boolean validatesignupLink() {
	return SingupLink.isDisplayed();
	
}

public boolean validatepricingLink() {
	return PricingLink.isDisplayed();
	
}

public boolean validatecustomerLink () {
	return CustomersLink.isDisplayed();
	
}

public boolean validatecontactLink() {
	return ContactLink.isDisplayed();
	
}


public HomePage login(String username,String password) {
	UsernameLink.sendKeys(username);
	PasswordLink.sendKeys(password);
	return new HomePage();
	
}

public static void clickLink() {
	driver.findElement(By.xpath("//input[@value='Login']")).click();
}


}