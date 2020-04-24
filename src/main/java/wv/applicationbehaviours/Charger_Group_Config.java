package wv.applicationbehaviours;



import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import wv.applicationor.Charger_Group_Config_OR;
import wv.commonutilities.CommonUtilities;
import wv.commonutilities.FakerData;

public class Charger_Group_Config extends CommonUtilities {

	public Charger_Group_Config_OR ChargerGroupConfigOR;
	public Charger_Group_Config() {
		
		if(ChargerGroupConfigOR==null) ChargerGroupConfigOR=PageFactory.initElements(driver, Charger_Group_Config_OR.class);
	}
	FakerData fake = new FakerData();
public void ChargerGroupConfig () {
		
		//boolean status = true ;
		try {
			System.out.println("vijrate1");
			Thread.sleep(5000);
				
			elementClick("Owner", "RateProfilePage", ChargerGroupConfigOR.new_CGC_btn);
			Thread.sleep(2000);
			
			
			
			
			
			
			
			     
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	
}

}



		