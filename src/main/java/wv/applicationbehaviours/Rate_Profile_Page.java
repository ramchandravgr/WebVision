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


import wv.applicationor.RateProfilePage_OR;
import wv.commonutilities.CommonUtilities;
import wv.commonutilities.FakerData;

public class Rate_Profile_Page extends CommonUtilities {

	public RateProfilePage_OR RateProfilePageOR;
	public Rate_Profile_Page() {
		
		if(RateProfilePageOR==null) RateProfilePageOR=PageFactory.initElements(driver, RateProfilePage_OR.class);
	}
	FakerData fake = new FakerData();
public void RateProfilePage () {
		
		//boolean status = true ;
		try {
			System.out.println("vijrate1");
			Thread.sleep(5000);
			elementClick("Owner", "RateProfilePage", RateProfilePageOR.evolution_Menu);
			Thread.sleep(5000);
			elementClick("Owner", "RateProfilePage", RateProfilePageOR.Rate_Profile_Entry);
			elementClick("Owner", "RateProfilePage", RateProfilePageOR.new_RatePf_Owner);
			Thread.sleep(2000);
			elementClick("Owner_VijayAutomation", "RateProfilePage", RateProfilePageOR.Owner_VijayAutomation);
			Thread.sleep(2000);
			sendData("RatePf_Name", "RateProfilePage", RateProfilePageOR.new_RatePf_Name, fake.getStationname());
			
			Thread.sleep(2000);
			elementClick("PaymentMethod", "RateProfilePage", RateProfilePageOR.new_RatePf_Session_RadioBtn);
			//DAYS
			Thread.sleep(2000);
			elementClick("MON_RadioBtn", "RateProfilePage", RateProfilePageOR.MON_RadioBtn);
			Thread.sleep(1000);
			elementClick("TUE_RadioBtn", "RateProfilePage", RateProfilePageOR.TUE_RadioBtn);
			Thread.sleep(1000);
			elementClick("WED_RadioBtn", "RateProfilePage", RateProfilePageOR.WED_RadioBtn);
			Thread.sleep(1000);
			elementClick("THU_RadioBtn", "RateProfilePage", RateProfilePageOR.THU_RadioBtn);
			Thread.sleep(1000);
			elementClick("FRI_RadioBtn", "RateProfilePage", RateProfilePageOR.FRI_RadioBtn);
			Thread.sleep(1000);
			elementClick("SAT_RadioBtn", "RateProfilePage", RateProfilePageOR.SAT_RadioBtn);
			Thread.sleep(1000);
			elementClick("SUN_RadioBtn", "RateProfilePage", RateProfilePageOR.SUN_RadioBtn);
			//HOURS
			Thread.sleep(2000);
			sendData("HOURS_AMOUNT", "RateProfilePage", RateProfilePageOR.HOURS_AMOUNT, fake.getPerminute());
			
			Thread.sleep(2000);
			sendData("txtFixedAmount_0", "RateProfilePage", RateProfilePageOR.txtFixedAmount_0, fake.getFixedamount());
			
			Thread.sleep(2000);
			sendData("txtPerMinAmount_0", "RateProfilePage", RateProfilePageOR.txtPerMinAmount_0, fake.getAmountperminute());
			Thread.sleep(3000);
			elementClick("Save_RadioBtn", "RateProfilePage", RateProfilePageOR.new_RatePf_Save_btn);
			
			Thread.sleep(5000);
			elementClick("add_popup_accept", "RateProfilePage", RateProfilePageOR.add_popup_accept);
			
			
			
			
			     
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	
}

}



		