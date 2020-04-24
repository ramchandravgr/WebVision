package wv.testcases;

import org.testng.annotations.Test;

import wv.applicationbehaviours.Summary_Station;
import wv.commonutilities.CommonUtilities;

public class TC_04_Create_Station extends CommonUtilities  {

		@Test
		public static void TC_04_Create_Station() {
			Summary_Station func = new Summary_Station();
			func.Station_Creation();
		}
}
