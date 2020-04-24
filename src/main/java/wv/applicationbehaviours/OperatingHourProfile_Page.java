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

import wv.applicationor.OperatingHourProfilePage_OR;
import wv.commonutilities.CommonUtilities;
import wv.commonutilities.FakerData;

public class OperatingHourProfile_Page extends CommonUtilities {

	public OperatingHourProfilePage_OR OHPPageOR;
	public OperatingHourProfile_Page() {
		
		if(OHPPageOR==null) OHPPageOR=PageFactory.initElements(driver, OperatingHourProfilePage_OR.class);
	}
	FakerData fake = new FakerData();
public void OperatingHourProfilePage () {
		
		//boolean status = true ;
		try {
			System.out.println("vijOHP");
			Thread.sleep(5000);
			
			
			elementClick("evolution_Menu", "OperatingHourProfilePage", OHPPageOR.evolution_Menu);
			Thread.sleep(2000);
			elementClick("Owner", "OperatingHourProfilePage", OHPPageOR.Operating_Hour_Profile_Group_Summary);
			Thread.sleep(2000);
				
			elementClick("New", "OperatingHourProfilePage", OHPPageOR.OHP_newbutton);
			Thread.sleep(2000);
			elementClick("Owner", "OperatingHourProfilePage", OHPPageOR.OHP_Owner);
			Thread.sleep(5000);
			elementClick("SelectOwner", "OperatingHourProfilePage", OHPPageOR.OHP_Owner_VijayAutomation);
			Thread.sleep(2000);
			sendData("Owner", "OperatingHourProfilePage", OHPPageOR.OHP_profileGroupName, fake.getAddress_firstname());
			Thread.sleep(2000);
			///Days
			elementClick("MON", "OperatingHourProfilePage", OHPPageOR.OHP_Days_WebTable_Mon);
			Thread.sleep(2000);
			elementClick("TUE", "OperatingHourProfilePage", OHPPageOR.OHP_Days_WebTable_Tue);
			Thread.sleep(2000);
			elementClick("WED", "OperatingHourProfilePage", OHPPageOR.OHP_Days_WebTable_Wed);
			Thread.sleep(2000);
			elementClick("THU", "OperatingHourProfilePage", OHPPageOR.OHP_Days_WebTable_Thu);
			Thread.sleep(2000);
			elementClick("FRI", "OperatingHourProfilePage", OHPPageOR.OHP_Days_WebTable_Fri);
			Thread.sleep(2000);
			elementClick("SAT", "OperatingHourProfilePage", OHPPageOR.OHP_Days_WebTable_Sat);
			Thread.sleep(2000);
			elementClick("SUN", "OperatingHourProfilePage", OHPPageOR.OHP_Days_WebTable_Sun);
			Thread.sleep(2000);
			elementClick("OHP_Access", "OperatingHourProfilePage", OHPPageOR.OHP_Access);
			Thread.sleep(2000);
			elementClick("Access_selectdropdown", "OperatingHourProfilePage", OHPPageOR.OHP_Access_selectdropdown);
			Thread.sleep(2000);
			elementClick("OHP_Save_btn", "OperatingHourProfilePage", OHPPageOR.OHP_Save_btn);
			Thread.sleep(6000);
			
			elementClick("OHP_add_popup_accept", "OperatingHourProfilePage", OHPPageOR.OHP_add_popup_accept);
			Thread.sleep(6000);
			
			
			
	     
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	
}

}



		