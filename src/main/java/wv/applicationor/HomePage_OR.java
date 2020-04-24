package wv.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_OR {

	
	//******************************* Homepage *****************************************
	
		@FindBy(xpath="//div[text()='EVolution UI | Ramchandra']")
		public WebElement heading_Homepage;
		
		@FindBy(xpath="//li[text()='TEST_SOUTH']")
		public WebElement dropdown_Network;
			
		@FindBy(xpath="//div/div/div/input[@value=\"TEST_SOUTH\"]")
		public WebElement required_Network;
		
		@FindBy(xpath="//div/div/div/input[@role=\"combobox\"]")
		public WebElement select_Network;
		
		@FindBy(xpath="//p[text()=\"Evolution\"]")
		public WebElement evolution_Menu;
		
		@FindBy(xpath="//span/span/p[text()=\"Owner Summary\"]")
		public WebElement select_Owner_Summary;
		
		@FindBy(xpath="//p[contains(text(),'Station Summary')]")
		public WebElement StationSummary_tab_enabled;
		
		@FindBy(xpath="//p[contains(text(),'Charger Status Summary')]")
		public WebElement select_Charger_Status_Summary;
		
		@FindBy(xpath="//p[contains(text(),'Charger Group Configuration')]")
		public WebElement select_Charger_Group_Configuration;
		
		@FindBy(xpath="//p[contains(text(),'Discount Summary')]")
		public WebElement Discount_Summary;
		
		@FindBy(xpath="//p[contains(text(),'Rate Profile Entry')]")
		public WebElement Rate_Profile_Entry;
		
		@FindBy(xpath="//p[contains(text(),'Charger Group Configuration')]")
		public WebElement Charger_Group_Configuration;
		
		@FindBy(xpath="//p[contains(text(),'Operating Hour Profile Group Summary')]")
		public WebElement Operating_Hour_Profile_Group_Summary;
		
		
		
		
		
	
}
