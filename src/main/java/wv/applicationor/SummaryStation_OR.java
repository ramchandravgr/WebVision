package wv.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryStation_OR {
	
	
	@FindBy(xpath="//p[text()=\"Evolution\"]")
	public WebElement evolution_Menu;

	
	@FindBy(xpath="//p[contains(text(),'Station Summary')]")
	public WebElement StationSummary_tab_enabled;

	
	//@FindBy(xpath="//*[@class=\"fa fa-file-o glow\"]")
	@FindBy(xpath="//a[@data-qtip=\"New\"]//descendant::i")
	public static WebElement New_Station;
	
	@FindBy(xpath="//*[@name=\"ownerStationSummary\"]")
	public static WebElement ownerStationSummary;

	@FindBy(xpath="//li[contains (text(),'VijayAutomation')]")
			public static WebElement Evolution_South;
	
	@FindBy(xpath="//*[@name=\"station\"]")
	public static WebElement station;
	
	@FindBy(xpath="//*[@name=\"description\"]")
	public static WebElement description;
	
	@FindBy(xpath="//*[@name=\"timeZone\"]")
	public static WebElement timeZone;
	
	@FindBy(xpath="//li[contains (text(),'America/New_York')]")
	public static WebElement America_New_York;
	
	@FindBy(xpath="//*[@name=\"lat\"]")
	public static WebElement lat;
	
	@FindBy(xpath="//*[@name=\"lon\"]")
	public static WebElement log;
	
	@FindBy(xpath="//*[@name=\"address1\"]")
	public static WebElement address1;
	
	@FindBy(xpath="//*[@name=\"address2\"]")
	public static WebElement address2;
	
	@FindBy(xpath="//*[@name=\"city\"]")
	public static WebElement city;
	
	@FindBy(xpath="//*[@name=\"state\"]")
	public static WebElement state;
	
	@FindBy(xpath="//*[@name=\"zipcode\"]")
	public static WebElement zipcode;
	
	@FindBy(xpath="//*[@name=\"website\"]")
	public static WebElement website;
	
	@FindBy(xpath="//label[contains (text(),'Gym')]")
	public static WebElement Gym;
	
	@FindBy(xpath="//*[@class=\"fa fa-floppy-o glow\"]")
	public static WebElement Save_Button;
	
	@FindBy(xpath="//span[contains (text(),'OK')]")
	public static WebElement OK_Button;
	
	@FindBy(xpath="//*[@class=\"fa fa-filter glow\"]")
	public static WebElement filter_Button;
	
	@FindBy(xpath="//*[@name=\"name\"]")
	public static WebElement namefilter;
	
	//@FindBy(xpath="//*[@class=\"fa fa-floppy-o glow\"]")
	
	@FindBy(xpath="//html/body/div[4]/div/div[2]/div/div/div/div/div[4]/div[3]/div/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/a[1]/span/span/span[2]/i")
	public static WebElement savefilterbutton;
	
	//@FindBy(xpath="//b[contains (text(),'fake.getStationname')]")
	//public static WebElement popupverification;
	
	@FindBy(xpath="//div[@class=\"x-component x-window-text x-box-item x-component-default\"]/b")
	public static WebElement popupverification;
	
	
	//Select to date
	//*[@name="showEndDatefielddurationfield-1669EffectiveRange"]
	//*[@class="fa fa-calendar"]
	
	
	
	
	
	
	
	
	
	
}
