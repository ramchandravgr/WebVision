package wv.testcases;

import org.testng.annotations.Test;

import wv.applicationbehaviours.Charger_Page;
import wv.applicationbehaviours.WV_Home_Page;
import wv.commonutilities.CommonUtilities;

public class TC_05_Create_Charger extends CommonUtilities  {

		@Test
		public static void TC_05_Create_Charger() {
			WV_Home_Page hp = new WV_Home_Page();
			Charger_Page func = new Charger_Page();
			hp.navigateTo_Charger_Status_Summary();
			func.Charger_Creation();
			/////<class name="wv.testcases.TC_04_Create_Station"></class>
			//<class name="wv.testcases.TC_05_Create_Charger"></class>
		}
}
