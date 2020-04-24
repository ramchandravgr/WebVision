package wv.applicationbehaviours;



import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import wv.applicationor.OwnerPage_OR;
import wv.applicationor.SummaryStation_OR;
import wv.commonutilities.CommonUtilities;
import wv.commonutilities.FakerData;

public class Summary_Station extends CommonUtilities {


	public SummaryStation_OR SummaryStationOR;
	public Summary_Station() {
		if(SummaryStationOR==null) SummaryStationOR=PageFactory.initElements(driver,SummaryStation_OR.class);
	}
	FakerData fake = new FakerData();
	
	public void Station_Creation () {
		
		//boolean status = true ;
		try {
			System.out.println("vij");
			
				
				Thread.sleep(5000);
				elementClick("Evolution page", "Station Summary page", SummaryStationOR.evolution_Menu);
				Thread.sleep(3000);
				elementClick("Summary page", "Station Summary page", SummaryStationOR.StationSummary_tab_enabled);
				Thread.sleep(3000);
				elementClick("New", "Station Summary page", SummaryStationOR.New_Station);
				Thread.sleep(3000);
				elementClick("Owner", "Station Summary page", SummaryStationOR.ownerStationSummary);
				Thread.sleep(3000);
				elementClick("Evolution south", "Station Summary page", SummaryStationOR.Evolution_South);
	            String stationname = fake.getStationname();
	            System.out.println("Actaul Station name " + stationname);
				sendData("station", "Station Summary page", SummaryStationOR.station, fake.getStationname());
				sendData("Decription", "Station Summary page", SummaryStationOR.description, fake.getDescriptionname());
				elementClick("timezone", "Station Summary page", SummaryStationOR.timeZone);
				elementClick("America_New_York", "Station Summary page", SummaryStationOR.America_New_York);
				sendData("lat", "Station Summary page", SummaryStationOR.lat, fake.getlat());
				Thread.sleep(3000);
				sendData("log", "Station Summary page", SummaryStationOR.log, fake.getlag());
				sendData("address1", "Station Summary page", SummaryStationOR.address1, fake.getAddress_firstname());
				sendData("address2", "Station Summary page", SummaryStationOR.address2, fake.getAddress_lastname());
				Thread.sleep(2000);
				sendData("city", "Station Summary page", SummaryStationOR.city, fake.getCity());
				Thread.sleep(2000);
				sendData("state", "Station Summary page", SummaryStationOR.state, fake.getstate());
				sendData("zipcode", "Station Summary page", SummaryStationOR.zipcode, fake.getZipcode());
				sendData("website", "Station Summary page", SummaryStationOR.website, fake.getwebsite());
				elementClick("Gym", "Station Summary page", SummaryStationOR.Gym);
				Thread.sleep(5000);
				elementClick("Save_Button", "Station Summary page", SummaryStationOR.Save_Button);
				
				getText("SummaryStationOR.popupverification");
				System.out.println("Expected station name "+getText("SummaryStationOR.popupverification"));
				
				
				
				
				
				
				
				//Assert.assertTrue(stationname.equals((getText("fake.getStationname"))),"popoupmessage");
				
				
				
				
				Thread.sleep(3000);
				elementClick("OK_Button", "Station Summary page", SummaryStationOR.OK_Button);
				Thread.sleep(3000);
				//Search verification
				//assertEquals("timeToResponse Check ....","timeToResponse",driver.findElement(By.xpath("//a[@title='Title value of this attribute']//td")).getText());
				//Assert.assertTrue(statinname.equals((getText(""))),"Station created successfully");
				elementClick("filter", "Station Summary page", SummaryStationOR.filter_Button);
				Thread.sleep(3000);
				sendData("filtername", "Station Summary page", SummaryStationOR.namefilter, fake.getStationname());
				Thread.sleep(3000);
				elementClick("savefilter", "Station Summary page", SummaryStationOR.savefilterbutton);
				
				
				Thread.sleep(3000);
				//Assert.assertTrue(stationname.equals((getText("fake.getStationname"))),"Station created successfully");
				
				System.out.println("testautomation");
			}
			//}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}


	private void If(boolean contains) {
		// TODO Auto-generated method stub
		
	}

	
	}
	

	

		