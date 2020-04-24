package wv.testcases;

import org.testng.annotations.Test;

import wv.applicationbehaviours.OperatingHourProfile_Page;
import wv.commonutilities.CommonUtilities;

public class TC_08_Operating_Hour_Profile_Group_Summary extends CommonUtilities  {

		@Test
		public static void Operating_Hour_Profile_Group_Summary() {
			OperatingHourProfile_Page func = new OperatingHourProfile_Page();
			func.OperatingHourProfilePage();
			
		}
}
// <class name="wv.testcases.TC_04_Create_Station"></class>
//<class name="wv.testcases.TC_05_Create_Charger"></class>
//<class name="wv.testcases.TC_06_Discount_Summary"></class>