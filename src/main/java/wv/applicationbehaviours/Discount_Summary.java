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


import wv.applicationor.DiscountPage_OR;
import wv.applicationor.SummaryStation_OR;
import wv.commonutilities.CommonUtilities;
import wv.commonutilities.FakerData;

public class Discount_Summary extends CommonUtilities {

	public DiscountPage_OR DiscountPageOR;
	public Discount_Summary() {
		
		if(DiscountPageOR==null) DiscountPageOR=PageFactory.initElements(driver, DiscountPage_OR.class);
	}
	FakerData fake = new FakerData();
public void DiscountSummary () {
		
		//boolean status = true ;
		try {
			System.out.println("vijdis3");
			Thread.sleep(5000);
				
			elementClick("Discount Summary", "Discount Page", DiscountPageOR.evolution_Menu1);
			Thread.sleep(5000);
			elementClick("Discount Summary", "Discount Page", DiscountPageOR.Discount_Summary);
			elementClick("new", "Discount Page", DiscountPageOR.new_Discount_btn);
			Thread.sleep(2000);
			elementClick("Discount_Owner_Dropdown", "Discount Page", DiscountPageOR.new_Discount_Owner_Dropdown);
			Thread.sleep(5000);
			elementClick("Select_Charger_Owner_Dropdown", "Discount Page", DiscountPageOR.Discount_Evolution_South);
			Thread.sleep(2000);
			sendData("Display name", "Discount Page", DiscountPageOR.new_Discount_Name, fake.getCharger_chargerid());
			Thread.sleep(2000);		
			elementClick("new_Discount_Type", "Discount Page", DiscountPageOR.new_Discount_Type);
			Thread.sleep(2000);
			
			elementClick("Select_Discount_Type", "Discount Page", DiscountPageOR.select_Discount_Type);
			Thread.sleep(2000);
			
			sendData("Discount amount", "Discount Page", DiscountPageOR.new_Discount_Amount, fake.getNew_Charger_Max_Energy_Usage());
             Thread.sleep(2000);
			elementClick("Discount_Users", "Discount Page", DiscountPageOR.new_Discount_Users);
			Thread.sleep(2000);
			elementClick("Seelct_Discount_Users", "Discount Page", DiscountPageOR.select_Users_Type);
			Thread.sleep(2000);
			elementClick("new_Discount_Status", "Discount Page", DiscountPageOR.new_Discount_Status);
			Thread.sleep(2000);
			elementClick("select_status_Type", "Discount Page", DiscountPageOR.select_status_Type);
			//Thread.sleep(2000);
			//elementClick("select_status_Type", "Discount Page", DiscountPageOR.select_status_Type);
			Thread.sleep(2000);
			elementClick("Charger_Check_Box", "Discount Page", DiscountPageOR.new_Discount_Charger_Check_Box);
			Thread.sleep(2000);
			elementClick("Save_btn", "Discount Page", DiscountPageOR.new_Discount_Save_btn);
			
			Thread.sleep(6000);
            elementClick("popup_accept", "Discount Page", DiscountPageOR.new_Discount_add_popup_accept);
			
			Thread.sleep(2000);
			
			
	       
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	
}

}



		