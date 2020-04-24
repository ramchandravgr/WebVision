package wv.applicationbehaviours;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.support.PageFactory;

import wv.applicationor.SignInPage_OR;
import wv.commonutilities.CommonUtilities;

public class SignIn_Authentication extends CommonUtilities {

	public SignInPage_OR signInPageOR;
	
	public List<Credentials> credentials=new ArrayList();
	
	public SignIn_Authentication()
	{
		if(signInPageOR==null)signInPageOR=PageFactory.initElements(driver, SignInPage_OR.class);
		
	}
	
	public void verify_Authentication_Page_Display()
	{
		boolean status=true;
		
		try
		{
			
			status=isDisplayed("Login page header", "User Login", signInPageOR.heading_UserLogin);
			if(status)
			{
				System.out.println("Login page header is displayed");
			}else
			{
				System.out.println("Login page header is not displayed");
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		
	}
	
	
	public void login(String username, String password)
	{
		
		
		try {
			Thread.sleep(2000);
			SignIn_Authentication.sendData("Username", "Login Page", signInPageOR.txt_username, username);
			Thread.sleep(2000);
			SignIn_Authentication.sendData("Password", "Login Page", signInPageOR.txt_password, password);
			Thread.sleep(2000);
			SignIn_Authentication.elementClick("Login button", "Login Page", signInPageOR.btn_Login);
			
		}catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		
	}
	
	
}
