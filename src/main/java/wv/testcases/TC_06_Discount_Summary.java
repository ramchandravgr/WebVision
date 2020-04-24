package wv.testcases;

import org.testng.annotations.Test;

import wv.applicationbehaviours.Charger_Page;
import wv.applicationbehaviours.Discount_Summary;
import wv.commonutilities.CommonUtilities;

public class TC_06_Discount_Summary extends CommonUtilities  {

		@Test
		public static void TC_06_Discount_Summary() {
			Discount_Summary func = new Discount_Summary();
			func.DiscountSummary();
			
		}
}
// <class name="wv.testcases.TC_04_Create_Station"></class>
//<class name="wv.testcases.TC_05_Create_Charger"></class>
//<class name="wv.testcases.TC_06_Discount_Summary"></class>
//<class name="wv.testcases.TC_05_Create_Charger"></class>
// <class name="wv.testcases.TC_07_Rate_Profile"></class>
//<class name="wv.testcases.TC_08_Operating_Hour_Profile_Group_Summary"></class>
//<class name="wv.testcases.TC_02_Homepage"></class>