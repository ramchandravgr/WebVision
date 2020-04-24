package wv.testcases;



import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wv.applicationbehaviours.SignIn_Authentication;

import wv.commonutilities.CommonUtilities;

public class TC_01_Login extends CommonUtilities{

@Test
public static void TC_01_Login() throws Exception {

	
	launchApplication("chrome", getExcelData("TestData","Url"));
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	
	
	SignIn_Authentication signin=new SignIn_Authentication();
	
	signin.verify_Authentication_Page_Display();
	signin.login(getExcelData("TestData","username"), getExcelData("TestData","password"));
	
}
}
