package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginClass extends BaseClass {

	@FindBy(name="user-name")
	WebElement name;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(name="login-button")
	WebElement button;
	
	public LoginClass() {
		PageFactory.initElements(driver, this);
	}
	
	public void CreateLogin(String name1,String pass1)
	{
		name.sendKeys(name1);
		pass.sendKeys(pass1);
	}
	
	public void click()
	{
		button.click();
	}
	
	
}
