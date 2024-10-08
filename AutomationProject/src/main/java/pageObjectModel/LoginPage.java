package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	@FindBy(name = "username") private WebElement usnTB;
	@FindBy(name = "pwd") private WebElement pwdTB;
	@FindBy(id = "loginButton") private WebElement loginButton;
	@FindBy(id = "keepLoggedInCheckBox") private WebElement Checkbox;
	@FindBy(id = "licenseLink") private WebElement LicenceToUseSoftware;
	@FindBy(partialLinkText = "Actimind Inc.") private WebElement ActiTimeInc;
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getUsnTB() {
		return usnTB;
	}
	public WebElement getPwdTB() {
		return pwdTB;
	}
	public WebElement getloginButton() {
		return loginButton;
	}
	public WebElement getCheckbox() {
		return Checkbox;
	}
	public WebElement getLicenceToUseSoftware() {
		return LicenceToUseSoftware;
	}
	public WebElement getActiTimeInc() {
		return ActiTimeInc;	
	}
	
	//operational methods
	public void validLogin(String validusn,String invalidpass) {
		usnTB.sendKeys(validusn);
		pwdTB.sendKeys(invalidpass);
		loginButton.click();
		usnTB.clear();
	}
}
