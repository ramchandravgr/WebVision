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

import wv.applicationor.ChargerPage_OR;
import wv.applicationor.SummaryStation_OR;
import wv.commonutilities.CommonUtilities;
import wv.commonutilities.FakerData;

public class Charger_Page extends CommonUtilities {

	public ChargerPage_OR ChargerPageOR;
	public Charger_Page() {
		//if(ChargerPageOR==null) ChargerPageOR=PageFactory.initElements(driver,ChargerPage1_OR.class);
		if(ChargerPageOR==null) ChargerPageOR=PageFactory.initElements(driver, ChargerPage_OR.class);
	}
	FakerData fake = new FakerData();
public void Charger_Creation () {
		
		//boolean status = true ;
		try {
			System.out.println("vijcharger1");
			Thread.sleep(2000);
			
			elementHoverAndClick("evolution_Menu", "Charger page", ChargerPageOR.evolution_Menu);	
			Thread.sleep(2000);
			elementHoverAndClick("Charger_Status_Summary", "Charger page", ChargerPageOR.Charger_Status_Summary);	
			Thread.sleep(2000);
				
			elementHoverAndClick("new", "Charger page", ChargerPageOR.new_Charger_btn);
			
			//elementClick("new_Charger_Header", "Charger page", ChargerPageOR.new_Charger_Header);
			Thread.sleep(2000);
			sendData("new_Charger_Id", "Charger page", ChargerPageOR.new_Charger_Id, fake.getCharger_chargerid());
			Thread.sleep(2000);
			elementClick("Charger_Owner_Dropdown", "Charger page", ChargerPageOR.new_Charger_Owner_Dropdown);
			Thread.sleep(5000);
			elementClick("new_Charger_Owner_Dropdown", "Charger page", ChargerPageOR.Evolution_South);
			Thread.sleep(2000);
			sendData("Display name", "Charger page", ChargerPageOR.new_Charger_Display_Name, fake.getCharger_chargerid());
			Thread.sleep(2000);		
			elementClick("new_Charger_Charger_Type", "Charger page", ChargerPageOR.new_Charger_Charger_Type);
			Thread.sleep(2000);
			elementClick("select_Charger_Charger_Type", "Charger page", ChargerPageOR.select_Charger_Charger_Type);
			Thread.sleep(2000);
			elementClick("new_Charger_Station_Dropdown", "Charger page", ChargerPageOR.new_Charger_Station_Dropdown);
			Thread.sleep(2000);
			elementClick("select station", "Charger page", ChargerPageOR.select_station);
			Thread.sleep(2000);
			
			sendData("new_Charger_Chargin_Speed", "Charger page", ChargerPageOR.new_Charger_Chargin_Speed, fake.getNew_Charger_Chargin_Speed());
			Thread.sleep(2000);
			elementClick("new_Charger_Config_Group_Dropdown", "Charger page", ChargerPageOR.new_Charger_Config_Group_Dropdown);
			Thread.sleep(2000);
			elementClick("select_Charger_Config_Group_Dropdown", "Charger page", ChargerPageOR.select_Charger_Config_Group_Dropdown);
			
			Thread.sleep(2000);
			sendData("new_Charger_Max_Energy_Usage", "Charger page", ChargerPageOR.new_Charger_Max_Energy_Usage, fake.getNew_Charger_Max_Energy_Usage());
			Thread.sleep(2000);
			elementClick("hrChargeDuration_Hour_Dropdown", "Charger page", ChargerPageOR.hrChargeDuration_Hour_Dropdown);
			Thread.sleep(2000);
			elementClick("max_Hour_Dropdown", "Charger page", ChargerPageOR.max_Hour_Dropdown);
			Thread.sleep(2000);
			
			elementClick("min_Duration_Hour_Dropdown", "Charger page", ChargerPageOR.minChargeDuration_Hour_Dropdown);
			Thread.sleep(2000);
			elementClick("min__Hour_Dropdown", "Charger page", ChargerPageOR.min_Hour_Dropdown);
			Thread.sleep(2000);
			
	        elementClick("new_Charger_Access_Group_Dropdown", "Charger page", ChargerPageOR.new_Charger_Access_Group_Dropdown);
			Thread.sleep(2000);
			elementClick("select access gropup", "Charger page", ChargerPageOR.select_group);
			Thread.sleep(2000);
			elementClick("isDisableAuthorization", "Charger page", ChargerPageOR.isDisableAuthorization);
			Thread.sleep(2000);
			
			
		    sendData("new_Charger_No_Of_Connectors_Dropdown", "Charger page", ChargerPageOR.new_Charger_No_Of_Connectors_Dropdown, fake.getConnectors());
			Thread.sleep(2000);
			elementClick("new_Charger_Connector1_Dropdown", "Charger page", ChargerPageOR.new_Charger_Connector1_Dropdown);
			Thread.sleep(2000);
			elementClick("Chademo_Connector1_Dropdown", "Charger page", ChargerPageOR.CHAdeMo_Connector1_Dropdown);
			
			//elementClick("new_Charger_Connector2_Dropdown", "Charger page", ChargerPageOR.new_Charger_Connector2_Dropdown);
		         Thread.sleep(2000);
	elementClick("new_Charger_Rate_Profile", "Charger page", ChargerPageOR.new_Charger_Rate_Profile);
				Thread.sleep(2000);
		elementClick("rateProfile_1", "Charger page", ChargerPageOR.rateProfile_1);
		        Thread.sleep(2000);
		elementClick("new_Charger_Rates_Discounts_Tab", "Charger page", ChargerPageOR.rateProfile_southoati);
			Thread.sleep(2000);
			elementClick("Discounts_Effective", "Charger page", ChargerPageOR.Discounts_Effective);
			Thread.sleep(2000);
			
			elementClick("select_Discounts_Effective", "Charger page", ChargerPageOR.select_Discounts_Effective);
			Thread.sleep(3000);
			
			elementClick("new_Charger_Save_btn", "Charger page", ChargerPageOR.new_Charger_Save_btn);
			Thread.sleep(5000);
			elementClick("Ok_popup", "Charger page", ChargerPageOR.Ok_popup);
	       
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
}

}



		