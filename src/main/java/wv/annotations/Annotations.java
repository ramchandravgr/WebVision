package wv.annotations;

import java.lang.reflect.Method;

import org.testng.annotations.*;

import com.github.javafaker.Faker;

import wv.commonutilities.CommonUtilities;
import wv.commonutilities.FakerData;
import wv.excelplugin.ExcelParser;
import wv.reporting.Reporting;

public class Annotations extends FakerData {

	@BeforeSuite
	public void intializeTestSuite() 
	{
		
		try {
			ExcelParser parser=new ExcelParser();	
			
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@BeforeMethod
	public void getTestCaseDetails(Method m)
	{
		System.out.println(m.getName());
		
		ExcelParser.crntTestCase=m.getName().trim();
		Reporting.intializeReport(ExcelParser.crntTestCase);
		Reporting.startReporting(ExcelParser.crntTestCase);
	}
	
	@AfterMethod
	public void publishReport()
	{
		Reporting.flushReport();
	}
	
	//@AfterSuite
	public void exit()
	{
		CommonUtilities.driver.quit();
	}
	
	
}