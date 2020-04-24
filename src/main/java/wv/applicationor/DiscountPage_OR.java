package wv.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscountPage_OR {

	@FindBy(xpath="//p[text()=\"Evolution\"]")
	public WebElement evolution_Menu1;
	@FindBy(xpath="//p[contains(text(),'Discount Summary')]")
	public WebElement Discount_Summary;
	
	@FindBy(xpath="//div[text()=\"Discount Summary\"]/parent::div/following-sibling::a[@data-qtip=\"New\"]//descendant::i")
	//@FindBy(xpath="//a[@data-qtip=\"New\"]//descendant::i")
	public WebElement new_Discount_btn;
	
	@FindBy(xpath="(//div[contains(text(),'Discount Entry')])[2]")
	public WebElement new_Discount_Header;
	
	@FindBy(xpath="//input[@name=\"ownerCode\"]")
	public WebElement new_Discount_Owner_Dropdown;
	
	@FindBy(xpath="//li[contains (text(),'VijayAutomation')]")
	public static WebElement Discount_Evolution_South;
	
	@FindBy(xpath="//div[contains(text(),'Discount Entry')]/ancestor::div[@role=\"toolbar\" and @aria-hidden=\"false\"]/following-sibling::div//span[text()=\"Name:\"]/ancestor::label/following-sibling::div//input")
	public WebElement new_Discount_Name;
	
	@FindBy(xpath="//input[@name=\"type\"]")
	public WebElement new_Discount_Type;
	//li[contains(text(),'Rate')]
	@FindBy(xpath="//li[contains(text(),'Rate')]")
	public WebElement select_Discount_Type;
	
	@FindBy(xpath="//input[@name=\"amount\"]")
	public WebElement new_Discount_Amount;
	
	@FindBy(xpath="//input[@name=\"users\"]")
	public WebElement new_Discount_Users;
	
	@FindBy(xpath="//li[contains(text(),'All EV Users')]")
	public WebElement select_Users_Type;
	
	@FindBy(xpath="//input[@name=\"status\"]")
	public WebElement new_Discount_Status;
	
	@FindBy(xpath="//li[contains(text(),'Active')]")
	public WebElement select_status_Type;
	
	@FindBy(xpath="(//div[contains(text(),'Discount Entry')]/ancestor::div[@role=\"toolbar\" and @aria-hidden=\"false\"]/following-sibling::div//fieldset/legend//div/b[contains(text(),'Configure Stations and Chargers')]/ancestor::legend/following-sibling::div//table)[1]/tbody/tr/td/div/div")
	public WebElement new_Discount_Charger_Check_Box;
	
	
	
	@FindBy(xpath="//div[contains(text(),'Discount Entry')]/ancestor::div[@role=\"toolbar\" and @aria-hidden=\"false\"]/following-sibling::div//a[@data-qtip=\"Save\"]")
	public WebElement new_Discount_Save_btn;
	
	@FindBy(xpath="//div[contains(text(),'Discount Entry')]/ancestor::div[@role=\"toolbar\" and @aria-hidden=\"false\"]/following-sibling::div//a[@data-qtip=\"Reset\"]")
	public WebElement new_Discount_Reset_btn;
	
	@FindBy(xpath="//a//span[text()=\"OK\"]")
	public WebElement new_Discount_add_popup_accept;
	

	
	
}
