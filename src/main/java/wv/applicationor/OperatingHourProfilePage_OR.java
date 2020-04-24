package wv.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatingHourProfilePage_OR {
	@FindBy(xpath="//p[text()=\"Evolution\"]")
	public WebElement evolution_Menu;
	
	@FindBy(xpath="//p[contains(text(),'Operating Hour Profile Group Summary')]")
	public WebElement Operating_Hour_Profile_Group_Summary;
	

	@FindBy(xpath="//a[@aria-selected=\"true\"]//child::span[text()=\"Operating Hour Profile Group Summary\"]")
	public WebElement oper_Hr_Pf_Summary_tab_enabled;
		
	@FindBy(xpath="//a[@data-qtip=\"New\"]//descendant::i")
	public WebElement qwert;
	
	@FindBy(xpath="//div[text()=\"Operating Hour Profile Group Summary\"]/parent::div/following-sibling::a[@data-qtip=\"New\"]//descendant::i")
	public WebElement OHP_newbutton;
	
	@FindBy(xpath="//input[@name=\"operatingOwner\"]")
	public WebElement OHP_Owner;
	
	@FindBy(xpath="//li[contains(text(),'VijayAutomation')]")
	public WebElement OHP_Owner_VijayAutomation;
	
	@FindBy(xpath="//input[@name=\"profileGroupName\"]")
	public WebElement OHP_profileGroupName;
	
	@FindBy(xpath="//div[text()=\"Days\"]//ancestor::legend/following-sibling::div/table/tbody/tr[1]/td[1]/div/div/div/span")
	public WebElement OHP_Days_WebTable_Mon;
	
	@FindBy(xpath="//div[text()=\"Days\"]//ancestor::legend/following-sibling::div/table/tbody/tr[1]/td[2]/div/div/div/span")
	public WebElement OHP_Days_WebTable_Tue;
	
	@FindBy(xpath="//div[text()=\"Days\"]//ancestor::legend/following-sibling::div/table/tbody/tr[1]/td[3]/div/div/div/span")
	public WebElement OHP_Days_WebTable_Wed;
	
	@FindBy(xpath="//div[text()=\"Days\"]//ancestor::legend/following-sibling::div/table/tbody/tr[2]/td[1]/div/div/div/span")
	public WebElement OHP_Days_WebTable_Thu;
	
	@FindBy(xpath="//div[text()=\"Days\"]//ancestor::legend/following-sibling::div/table/tbody/tr[2]/td[2]/div/div/div/span")
	public WebElement OHP_Days_WebTable_Fri;
	
	@FindBy(xpath="//div[text()=\"Days\"]//ancestor::legend/following-sibling::div/table/tbody/tr[2]/td[3]/div/div/div/span")
	public WebElement OHP_Days_WebTable_Sat;
	
	@FindBy(xpath="//div[text()=\"Days\"]//ancestor::legend/following-sibling::div/table/tbody/tr[3]/td[1]/div/div/div/span")
	public WebElement OHP_Days_WebTable_Sun;
	
	@FindBy(xpath="//input[@name=\"operatingChargerAccess_0\"]")
	public WebElement OHP_Access;
	
	@FindBy(xpath="//li[contains(text(),'Public')]")
	public WebElement OHP_Access_selectdropdown;
	
	@FindBy(xpath="//input[@name=\"operatingChargerAccess_1\"]")
	public WebElement new_Oper_Hr_Pf_Slot2_Access_dropdown;
	
	@FindBy(xpath="//div[text()=\"Hours\"]//ancestor::legend/following-sibling::div/table/tbody/tr[2]/td[2]/div/div//input")
	public WebElement new_Oper_Hr_Pf_Slot1_Hour_dropdown;
	
	@FindBy(xpath="//div[text()=\"Hours\"]//ancestor::legend/following-sibling::div/table/tbody/tr[3]/td[2]/div/div//input")
	public WebElement new_Oper_Hr_Pf_Slot2_Hour_dropdown;
	
	@FindBy(xpath="//div[contains(text(),'Operating Hour Profile Group Entry')]/ancestor::div[@role=\"toolbar\" and @aria-hidden=\"false\"]/following-sibling::div//a[@data-qtip=\"Save\"]")
	public WebElement OHP_Save_btn;
	
	@FindBy(xpath="//a//span[text()=\"OK\"]")
	public WebElement OHP_add_popup_accept;
	
	@FindBy(xpath="//div[contains(text(),'Operating Hour Profile Group Entry')]/ancestor::div[@role=\"toolbar\" and @aria-hidden=\"false\"]/following-sibling::div//a[@data-qtip=\"Reset\"]")
	public WebElement new_Oper_Hr_Pf_Reset_btn;
	
}
