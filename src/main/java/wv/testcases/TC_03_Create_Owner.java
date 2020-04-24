package wv.testcases;

import org.testng.annotations.Test;

import wv.applicationbehaviours.Owner_Page_func;

import wv.commonutilities.CommonUtilities;

public class TC_03_Create_Owner extends CommonUtilities {

	@Test
	public static void TC_03_Create_Owner() {
		
		
		Owner_Page_func func = new Owner_Page_func();
		
		
		func.Owner_Creation();
		
		
	}
	
	
}
