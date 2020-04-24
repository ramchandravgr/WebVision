package wv.testcases;

import org.testng.annotations.Test;

import wv.applicationbehaviours.Rate_Profile_Page;
import wv.commonutilities.CommonUtilities;

public class TC_07_Rate_Profile extends CommonUtilities  {

		@Test
		public static void Rate_Profile() {
			Rate_Profile_Page func = new Rate_Profile_Page();
			func.RateProfilePage();
			
		}
}
// <class name="wv.testcases.TC_04_Create_Station"></class>
//<class name="wv.testcases.TC_05_Create_Charger"></class>
//<class name="wv.testcases.TC_06_Discount_Summary"></class>