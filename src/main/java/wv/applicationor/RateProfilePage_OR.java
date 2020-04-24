package wv.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RateProfilePage_OR {

	@FindBy(xpath="//p[text()=\"Evolution\"]")
	public WebElement evolution_Menu;
	
	@FindBy(xpath="//p[contains(text(),'Rate Profile Entry')]")
	public WebElement Rate_Profile_Entry;
	@FindBy(xpath="//a[@aria-selected=\"true\"]//child::span[text()=\"Rate Profile Entry View\"]")
	public WebElement rate_profile_tab_enabled;
	
	@FindBy(xpath="//a[@data-qtip=\"Rate Profile Entry View\"]/span[2]")
	public WebElement rate_profile_tab_close_btn;	
	
	@FindBy(xpath="//div[contains(text(),'Rate Profile Entry')]")
	public WebElement new_RatePf_Header;
	
	@FindBy(xpath="//input[@name=\"ownerRateProfile\"]")
	public WebElement new_RatePf_Owner;
	
	@FindBy(xpath="//li[contains(text(),'VijayAutomation')]")
	public WebElement Owner_VijayAutomation;
	
	
	//@FindBy(xpath="//input[@name=\"ownerRateProfile\"]")
	
    @FindBy(xpath="//input[@name=\"rateProfileName\"]")
	public WebElement new_RatePf_Name;
	
	@FindBy(xpath="//label[text()=\"Session Duration\"]/preceding-sibling::span/input")
	public WebElement new_RatePf_Session_RadioBtn;
	
	@FindBy(xpath="//label[text()=\"KWH usage\"]/preceding-sibling::span/input")
	public WebElement new_RatePf_Kwh_RadioBtn;
	
	@FindBy(xpath="//div[text()=\"Days\"]//ancestor::legend/following-sibling::div/table/tbody/tr[1]/td[1]/div/div/div/span")
	public WebElement new_RatePf_WebTable;
	
	@FindBy(xpath="//label[contains(text(),'MON')]")
	public WebElement MON_RadioBtn;
	@FindBy(xpath="//label[contains(text(),'TUE')]")
	public WebElement TUE_RadioBtn;
	@FindBy(xpath="//label[contains(text(),'WED')]")
	public WebElement WED_RadioBtn;
	
	@FindBy(xpath="//label[contains(text(),'THU')]")
	public WebElement THU_RadioBtn;
	
	@FindBy(xpath="//label[contains(text(),'FRI')]")
	public WebElement FRI_RadioBtn;
	
	@FindBy(xpath="//label[contains(text(),'SAT')]")
	public WebElement SAT_RadioBtn;
	
	@FindBy(xpath="//label[contains(text(),'SUN')]")
	public WebElement SUN_RadioBtn;
	
	
	@FindBy(xpath="//*[@name=\"centsKWH_0\"]")
	public WebElement HOURS_AMOUNT;
	
			@FindBy(xpath="//*[@name=\"txtFixedAmount_0\"]")
	public WebElement txtFixedAmount_0;		
			
			@FindBy(xpath="//*[@name=\"txtPerMinAmount_0\"]")
					public WebElement txtPerMinAmount_0;			
			
	
	
	
	
	@FindBy(xpath="//input[@name=\"centsKWH_0\"]")
	public WebElement new_RatePf_Slot1_Amount_Entry;
	
	@FindBy(xpath="//input[@name=\"centsKWH_1\"]")
	public WebElement new_RatePf_Slot2_Amount_Entry;
	
	@FindBy(xpath="//div[text()=\"Hours\"]//ancestor::legend/following-sibling::div/table/tbody/tr[2]/td[2]/div/div//input")
	public WebElement new_RatePf_Slot1_Hour_dropdown;
	
	@FindBy(xpath="//div[text()=\"Hours\"]//ancestor::legend/following-sibling::div/table/tbody/tr[3]/td[2]/div/div//input")
	public WebElement new_RatePf_Slot2_Hour_dropdown;
	
	@FindBy(xpath="//div[contains(text(),'Rate Profile Entry')]/ancestor::div[@role=\"toolbar\" and @aria-hidden=\"false\"]/following-sibling::div//a[@data-qtip=\"Save\"]")
	public WebElement new_RatePf_Save_btn;
	
	@FindBy(xpath="//a//span[text()=\"OK\"]")
	public WebElement add_popup_accept;
	
	@FindBy(xpath="//div[contains(text(),'Rate Profile Entry')]/ancestor::div[@role=\"toolbar\" and @aria-hidden=\"false\"]/following-sibling::div//a[@data-qtip=\"Reset\"]")
	public WebElement new_RatePf_Reset_btn;
	
	
	
	
	
	
	
	

	
}
