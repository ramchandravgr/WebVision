package wv.applicationor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Charger_Group_Config_OR {

	
	
	@FindBy(xpath="//div[text()=\"Charger Group Configuration\"]/parent::div/following-sibling::a[@data-qtip=\"New\"]//descendant::i")
	public WebElement new_CGC_btn;
	
	@FindBy(xpath="//*[@name=\"groupName\"\"]")
	public WebElement GROUPNAME;
	
	@FindBy(xpath="//li[contains (text(),'Configure Keys')]")
	public static WebElement Configure_Keys;	
	
	
	
}
