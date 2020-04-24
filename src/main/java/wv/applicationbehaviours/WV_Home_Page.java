package wv.applicationbehaviours;

import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import wv.applicationor.HomePage_OR;
import wv.commonutilities.CommonUtilities;

public class WV_Home_Page extends CommonUtilities {
	
	public HomePage_OR homePageOR;
	
	public WV_Home_Page() {
		if(homePageOR==null)homePageOR=PageFactory.initElements(driver, HomePage_OR.class);
	}
	
	
	public void verify_Home_Page_Display()
	{
		boolean status = true;
			try {
				status = isDisplayed("Homepage header", "Homepage", homePageOR.heading_Homepage);
			if(status) {
				System.out.println("Home page header is displayed");
				logStatus("Pass", "Homepage header is displayed");
			}
			else
				System.out.println("Home page header is not displayed");
			logStatus("Fail", "Homepage header is not displayed");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	public void select_Network()
	{
		boolean status = true;
		try {
			status = isDisplayed("Network Selection", "Homepage", homePageOR.required_Network);
		if(status) {
			System.out.println("TEST_SOUTH network selected");
		logStatus("Pass", "TEST_SOUTH network is selected/enabled");
		}
		else
		{
			System.out.println("Final");
		logStatus("Fail", "TEST_SOUTH network is not selected/enabled");
		}
			//elementHoverAndClick("Network selection dropdown", "Homepage", homePageOR.select_Network);
		//elementHoverAndClick("Testing Network selection", "Homepage", homePageOR.dropdown_Network);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void navigateTo_Owner_Summary()
	{
		
		elementHoverAndClick("Evolution menu", "Homepage", homePageOR.evolution_Menu);
		elementHoverAndClick("Owner Summary", "Homepage", homePageOR.select_Owner_Summary);
				
	}
	
	public void navigateTo_Station_Summary()
	{
		
		elementHoverAndClick("Evolution menu", "Homepage", homePageOR.evolution_Menu);
		elementHoverAndClick("Summary Station", "Homepage", homePageOR.StationSummary_tab_enabled);
				
	}
	
	public void navigateTo_Charger_Status_Summary()
	{
		
		elementHoverAndClick("Evolution menu", "Homepage", homePageOR.evolution_Menu);
		
		elementHoverAndClick("Charger page", "Homepage", homePageOR.select_Charger_Status_Summary);
				
	}
	

	public void navigateTo_Discount_Summary()
	{
		
		elementHoverAndClick("Evolution menu", "Homepage", homePageOR.evolution_Menu);
		//elementHoverAndClick("Discount Summary", "Homepage", homePageOR.Discount_Summary);
				
	}
	
	
	public void navigateTo_Rate_Profile_Entry()
	{
		
		elementHoverAndClick("Evolution menu", "Homepage", homePageOR.evolution_Menu);
		
		//elementHoverAndClick("Charger page", "Homepage", homePageOR.Rate_Profile_Entry);
				
	}
	
	public void navigateTo_Charger_Group_Config()
	{
		
		elementHoverAndClick("Evolution menu", "Homepage", homePageOR.evolution_Menu);
		
		elementHoverAndClick("Charger page", "Homepage", homePageOR.Charger_Group_Configuration);
				
	}
	public void navigateTo_Operating_Hour_Profile_Group_Summary()
	{
		
		elementHoverAndClick("Evolution menu", "Homepage", homePageOR.evolution_Menu);
		
		elementHoverAndClick("Charger page", "Homepage", homePageOR.Operating_Hour_Profile_Group_Summary);
				
	}

	
	
	
	

}
