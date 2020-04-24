package wv.applicationbehaviours;

import org.openqa.selenium.support.PageFactory;

import wv.applicationor.OwnerPage_OR;
import wv.commonutilities.CommonUtilities;
import wv.commonutilities.FakerData;

public class Owner_Page_func extends CommonUtilities {

	public OwnerPage_OR ownerPageOR;
	public Owner_Page_func() {
		if(ownerPageOR==null)ownerPageOR=PageFactory.initElements(driver, OwnerPage_OR.class);
	}
	
	FakerData fake = new FakerData();
	
	public void Owner_Creation () {
		
		boolean status = true ;
		
		try {
			status= isDisplayed("Owner Summary Tab", "Owner Summary", ownerPageOR.owner_Summary_tab_enabled);
		
			
			if(status)
			{
				System.out.println("Owner Summary Tab is selected/enabled");
								
				//select new button
				//waitForVisbilityOfElement("New Owner", "Owner Summary Page", ownerPageOR.new_Owner,60);
				Thread.sleep(3000);
				elementClick("New Owner", "Owner Summary page", ownerPageOR.new_Owner);
				//waitForElementToBeClickable("Reset Button", "Owner Summary Page", ownerPageOR.new_Owner_Reset_btn, 30);
				elementClick("Reset button", "Owner Summary Page", ownerPageOR.new_Owner_Reset_btn);
				sendData("Owner First Name", "Owner Summary Page", ownerPageOR.new_Owner_FullName, fake.getFirstname());
				sendData("Owner Short Name", "Owner Summary Page", ownerPageOR.new_Owner_ShortName, fake.getAddress_firstname());
				sendData("Owner Email", "Owner Summary Page", ownerPageOR.new_Owner_Email, fake.getEmail());
				sendData("Owner num of users", "Owner Summary Page", ownerPageOR.new_Owner_NoofUsers, "5");
				sendData("Owner phone", "Owner Summary Page", ownerPageOR.new_Owner_Phone, "2456123456");
				sendData("Owner company code", "Owner Summary Page", ownerPageOR.new_Owner_CompanyCode, fake.getCompanycode());
				sendData("Owner contact first name", "Owner Summary Page", ownerPageOR.new_Owner_PriContact_FirstName, fake.getFirstname());
				sendData("Owner contact first name", "Owner Summary Page", ownerPageOR.new_Owner_PriContact_LastName, fake.getLastname());
				sendData("Owner contact email", "Owner Summary Page", ownerPageOR.new_Owner_PriContact_Email, fake.getEmail());
				sendData("Owner contact phone", "Owner Summary Page", ownerPageOR.new_Owner_PriContact_Phone, "7894561230");
				elementClick("Role", "Owner Summary Page", ownerPageOR.new_Owner_PriContact_Role_dropdown);
				elementClick("Role select", "Owner Summary Page", ownerPageOR.new_Owner_PriContact_Role_dropdown_select);
				elementHoverAndClick("Save button", "Owner Summary Page", ownerPageOR.new_Owner_Save_btn);
				Thread.sleep(5000);
				elementHoverAndClick("Pop up accept", "Owner Summary Page", ownerPageOR.owner_add_popup_accept);
				
				Thread.sleep(60000);
				
			}
			
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
