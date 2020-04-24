package wv.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage_OR {
	
	
	//******************************* Login *****************************************
	
	@FindBy(xpath="//h1[text()='User Login']")
	public WebElement heading_UserLogin;
		
	@FindBy(xpath="//input[@name='username']")
	public WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement txt_password;
	
	@FindBy(xpath="//button[@id='btnSubmit']")
	public WebElement btn_Login;
	
	

}