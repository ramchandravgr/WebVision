package wv.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChargerPage_OR {
	
	
	@FindBy(xpath="//p[text()=\"Evolution\"]")
	public WebElement evolution_Menu;
	
	@FindBy(xpath="//p[contains(text(),'Charger Status Summary')]")
	public WebElement Charger_Status_Summary;


	@FindBy(xpath="//div[text()=\"Charger Status Summary\"]/parent::div/following-sibling::a[@data-qtip=\"New\"]//descendant::i")
	//@FindBy(xpath="//a[@data-qtip=\"New\"]//descendant::i")
	public WebElement new_Charger_btn;
	
	//@FindBy(xpath="(//div[contains(text(),'Charger Status Entry')])[2]")
	//public WebElement new_Charger_Header;
	
	@FindBy(xpath="//*[@name=\"ChargerName\"]")
	public WebElement new_Charger_Id;
	
	@FindBy(xpath="//*[@name=\"chargerEntryOwnerDropdown\"]")
	public WebElement new_Charger_Owner_Dropdown;
	//*[@id="ext-974"]
	@FindBy(xpath="//li[contains (text(),'VijayAutomation')]")
	//@FindBy(xpath="//*[@id=\"ext-974\"]")
	public static WebElement Evolution_South;
	
	@FindBy(xpath="//input[@name=\"displayName\"]")
	public WebElement new_Charger_Display_Name;
	
	@FindBy(xpath="//input[@name=\"chargerType\"]")
	public WebElement new_Charger_Charger_Type;
	
	@FindBy(xpath="//li[contains(text(),'DC Fast')]")
	public WebElement select_Charger_Charger_Type;
	
	
	@FindBy(xpath="//div[contains(text(),'Charger Status Entry')]/ancestor::div[@role=\"toolbar\" and @aria-hidden=\"false\"]/following-sibling::div//span[text()=\"Station:\"]/ancestor::label/following-sibling::div//input")
	public WebElement new_Charger_Station_Dropdown;
	
	@FindBy(xpath="//li[contains(text(),'Vijaydeepdlt')]")
	public WebElement select_station;
	
	@FindBy(xpath="//input[@name=\"chargingSpeed\"]")
	public WebElement new_Charger_Chargin_Speed;
	
	@FindBy(xpath="//input[@name=\"configGroup\"]")
	public WebElement new_Charger_Config_Group_Dropdown;
	
	@FindBy(xpath="//li[contains(text(),'TEST_CONFIG')]")
	public WebElement select_Charger_Config_Group_Dropdown;
	
	@FindBy(xpath="//input[@name=\"maxEnergyUsage\"]")
	public WebElement new_Charger_Max_Energy_Usage;
	
	//@FindBy(xpath="//input[@name=\"hrChargeDuration\"]")
	//public WebElement new_Charger_Max_Duration_Hour_Dropdown;
	
	//@FindBy(xpath="//*[@name=\"hrChargeDuration\"]")
	@FindBy(xpath="//tr[6]/td[2]/div/div/div/div[1]/div/div/div[2]")
	public WebElement hrChargeDuration_Hour_Dropdown;
	
	@FindBy(xpath="//li[contains(text(),'23')]")
	public WebElement max_Hour_Dropdown;
	
	//@FindBy(xpath="//*[@name=\"minChargeDuration\"]")
	@FindBy(xpath="//tr[6]/td[2]/div/div/div/div[2]/div/div/div[2]")
	public WebElement minChargeDuration_Hour_Dropdown;
	
	@FindBy(xpath="//li[contains(text(),'59')]")
	public WebElement min_Hour_Dropdown;
	
	
	@FindBy(xpath="//input[@name=\"operatingGroup\"]")
	public WebElement new_Charger_Access_Group_Dropdown;
	//li[contains(text(),'South')]
	@FindBy(xpath="//li[contains(text(),'Irena')]")
	public WebElement select_group;
	
	@FindBy(xpath="//*[@name=\"isDisableAuthorization\"]")
	public WebElement isDisableAuthorization;
	
	@FindBy(xpath="//input[@name=\"ConnectorNo\"]")
	public WebElement new_Charger_No_Of_Connectors_Dropdown;
	
	@FindBy(xpath="//input[@name=\"ConnectorTypeId_1\"]")
	public WebElement new_Charger_Connector1_Dropdown;
	
	//li[contains(text(),'CHAdeMO')]
	@FindBy(xpath="//li[contains(text(),'CHAdeMO')]")
	public WebElement CHAdeMo_Connector1_Dropdown;
	
	@FindBy(xpath="//input[@name=\"ConnectorTypeId_2\"]")
	public WebElement new_Charger_Connector2_Dropdown;
	
	@FindBy(xpath="//div[contains(text(),'Owner Entry')]/ancestor::div[@role=\"toolbar\" and @aria-hidden=\"false\"]/following-sibling::div//a[@data-qtip=\"Reset\"]")
	public WebElement new_Charger_Reset_btn;
	
	@FindBy(xpath="//span[contains(text(),'Rates & Discounts')]")
	public WebElement new_Charger_Rate_Profile;
	
	@FindBy(xpath="//*[@name=\"rateProfile_1\"]")
	public WebElement rateProfile_1;
	
	@FindBy(xpath="//li[contains(text(),'Vijaylzttyfn')]")
	public WebElement rateProfile_southoati;
	
	@FindBy(xpath="//*[@name=\"durationOptionsdiscountsEffectivediscountsEffective\"]")
	public WebElement Discounts_Effective;
	
	@FindBy(xpath="//li[contains(text(),'This Year')]")
	public WebElement select_Discounts_Effective;
	
	
	@FindBy(xpath="//a//span[text()=\"Chargers\"]")
	public WebElement new_Charger_Chargers_Tab;
	
	@FindBy(xpath="//a//span[text()=\"Rates & Discounts\"]")
	public WebElement new_Charger_Rates_Discounts_Tab;
	
	//@FindBy(xpath="//div[contains(text(),'Owner Entry')]/ancestor::div[@role=\"toolbar\" and @aria-hidden=\"false\"]/following-sibling::div//a[@data-qtip=\"Save\"]")
    //@FindBy(xpath="//html/body/div[4]/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div[3]/div/div/div[2]/div[2]/div/a[1]/span/span/span[2]/i")
	
	@FindBy(xpath="//*[@class=\"fa fa-floppy-o glow\"]")
	public WebElement new_Charger_Save_btn;
	
	@FindBy(xpath="//span[contains(text(),'OK')]")
	public WebElement Ok_popup;
	
	
}
