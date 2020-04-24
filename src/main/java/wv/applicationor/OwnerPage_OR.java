package wv.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OwnerPage_OR {

	
	@FindBy(xpath="//a[@aria-selected=\"true\"]//child::span[text()=\"Owner Summary\"]")
	public WebElement owner_Summary_tab_enabled;
		
	
	public WebElement new_Owner;
	
	@FindBy(xpath="//span[text()=\"Owner Full Name:\"]//ancestor::label//following-sibling::div[1]//input")
	public WebElement new_Owner_FullName;
	
	@FindBy(xpath="//span[text()=\"Owner Short Name:\"]//ancestor::label//following-sibling::div[1]//input")
	public WebElement new_Owner_ShortName;
	
	@FindBy(xpath="//span[text()=\"Company Code:\"]//ancestor::label//following-sibling::div[1]//input")
	public WebElement new_Owner_CompanyCode;
	
	@FindBy(xpath="(//span[text()=\"Phone:\"]//ancestor::label//following-sibling::div[1]//input)[1]")
	public WebElement new_Owner_Phone;
	
	@FindBy(xpath="(//span[text()=\"Email:\"]//ancestor::label//following-sibling::div[1]//input)[1]")
	public WebElement new_Owner_Email;
	
	@FindBy(xpath="//span[text()=\"No of Users:\"]//ancestor::label//following-sibling::div[1]//input")
	public WebElement new_Owner_NoofUsers;
	
	@FindBy(xpath="//span[text()=\"First Name:\"]//ancestor::label//following-sibling::div[1]//input")
	public WebElement new_Owner_PriContact_FirstName;
	
	@FindBy(xpath="//span[text()=\"Last Name:\"]//ancestor::label//following-sibling::div[1]//input")
	public WebElement new_Owner_PriContact_LastName;
	
	@FindBy(xpath="(//span[text()=\"Phone:\"]//ancestor::label//following-sibling::div[1]//input)[2]")
	public WebElement new_Owner_PriContact_Phone;
	
	@FindBy(xpath="(//span[text()=\"Email:\"]//ancestor::label//following-sibling::div[1]//input)[2]")
	public WebElement new_Owner_PriContact_Email;
	
	@FindBy(xpath="//span[text()=\"Role:\"]//ancestor::label//following-sibling::div[1]//input/parent::div//following-sibling::div")
	public WebElement new_Owner_PriContact_Role_dropdown;
	
	@FindBy(xpath="//div/ul/li[text()=\"Admin\"]")
	public WebElement new_Owner_PriContact_Role_dropdown_select;
	
	@FindBy(xpath="//a[@data-qtip=\"Save\"]")
	public WebElement new_Owner_Save_btn;
	
	@FindBy(xpath="//a[@data-qtip=\"Reset\"]")
	public WebElement new_Owner_Reset_btn;
	
	//@FindBy(xpath="//a/span[text()=\"OK\"]")
	//public WebElement owner_add_popup_accept;
	
	@FindBy(xpath="//a//span[text()=\"OK\"]")
	public WebElement owner_add_popup_accept;
	
	
	
	
	@FindBy(xpath="//div/i//following-sibling::b")
	public WebElement owner_validation;
	
	
}
