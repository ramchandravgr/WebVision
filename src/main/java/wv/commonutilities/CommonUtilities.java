package wv.commonutilities;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.tool.Extension.Param;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import wv.excelplugin.ExcelParser;
import wv.reporting.Reporting;

public class CommonUtilities extends Reporting {

	
	public static WebDriver driver;
	
	/**
	 * @author RC 95
	 * @param browsertype,url
	 * @return boolean
	 * @description This method helps the user to launch the browsers like
	 *              chrome,ff
	 */
	public static boolean launchApplication(String browsertype, String url)
	{
		boolean status=true;
		try
		{
			if(browsertype.isEmpty() || browsertype==null)
				throw new Exception("Browser type cannot be empty");
			else
				System.out.println("Browser type given is valid");
			
			if(url.isEmpty()  || url==null)
				throw new Exception("URL cannot be empty/URL should start with https");
			else
				System.out.println("URL given is valid");
			
			System.out.println("Application is Launching....");
			
			switch(browsertype.toLowerCase()) {
			
			case "chrome" : 				
				
				// setting system property for Chrome browser
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("useAutomationExtension", false);
				options.addArguments("--ignore-certificate-errors");
				//DesiredCapabilities capability = DesiredCapabilities.chrome();
				// To Accept SSL certificate
				//capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				driver = new ChromeDriver(options);
				break;
			
			case "firefox" : 
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				driver = new FirefoxDriver();
				break;
				
			default:
				throw new Exception("Browser type given is not supported");
			
			}
			
			driver.get(url);
			driver.manage().window().maximize();
			System.out.println("Application is Launched successfully!");
			logStatus("Pass","Application is Launched successfully!");
				
		}
		catch(Exception e)
		{
			System.out.println("Application failed to launch");
			logStatus("Fail","Application failed to launch");
			status=false ;
		}
		
		return status ;
		
	}
	
	/**
	 * @author RC 95
	 * @param element
	 * @return extractedXPATH
	 * @description This method helps the user to convert the extracted xpath to
	 *              identifiable xpath
	 */
	public static String getXpath(WebElement element) {
		String actualXPATH = element.toString();

		String extractedXPATH = actualXPATH.substring(actualXPATH.lastIndexOf(":") + 1).replace("]", "").trim();

		return extractedXPATH;
	}

	/**
	 * @author RC 95
	 * @param elementName
	 * @param pagename
	 * @param element
	 * @param duration
	 * @return boolean
	 * @description This method helps to wait for the visibility of the element
	 *              using explicit wait
	 */
	public static boolean waitForVisbilityOfElement(String elementName, String pagename, WebElement element,
			int duration) {
		boolean status = false;
		try {
			// get the xpath of webelement

			String actualXPATH = element.toString();

			String extractedXPATH = actualXPATH.substring(actualXPATH.lastIndexOf(":") + 1).replace("]", "").trim();
			WebDriverWait wait = new WebDriverWait(driver, duration);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(extractedXPATH)));
			System.out.println("Element " + elementName + " is identified on the page " + pagename);
		} catch (Exception e) {
			System.out.println("Element " + elementName + " not identified in " + duration + " sec");
			status = false;
		}

		return status;

	}

	/**
	 * @author RC 95
	 * @param elementName
	 * @param pagename
	 * @param element
	 * @param duration
	 * @return boolean
	 * @description This method helps to wait for the element to be clickable using
	 *              explicit wait
	 */
	public static boolean waitForElementToBeClickable(String elementName, String pagename, WebElement element,
			int duration) {
		boolean status = false;
		try {
			// get the xpath of webelement

			WebDriverWait wait = new WebDriverWait(driver, duration);

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(getXpath(element))));
			System.out.println("Element " + elementName + " is identified on the page " + pagename);
		} catch (Exception e) {
			System.out.println("Element " + elementName + " not identified in " + duration + " sec");
			status = false;
		}

		return status;
	}

	/**
	 * @author RC 95
	 * @param elementName
	 * @param pagename
	 * @param element
	 * @param duration
	 * @return boolean
	 * @description This method helps to wait for the presence of element using
	 *              explicit wait
	 */
	public static boolean waitForPresenceOfElement(String elementName, String pagename, WebElement element,
			int duration) {
		boolean status = false;
		try {
			// get the xpath of webelement

			WebDriverWait wait = new WebDriverWait(driver, duration);

			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(getXpath(element))));
			System.out.println("Element " + elementName + " is identified on the page " + pagename);
		} catch (Exception e) {
			System.out.println("Element " + elementName + " not identified in " + duration + " sec");
			status = false;
		}

		return status;
	}

	/**
	 * @author RC 95
	 * @param elementName
	 * @param pagename
	 * @param element
	 * @param timeoutduration
	 * @param pollingduration
	 * @return boolean
	 * @description This method helps to wait for the element to be clickable using
	 *              fluent wait
	 */
	public static boolean fluentWaitElementToBeClickable(String elementName, String pagename, WebElement element,
			int timeoutduration, int pollingduration) {
		boolean status = true;
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			wait.withTimeout(timeoutduration, TimeUnit.SECONDS);
			wait.pollingEvery(pollingduration, TimeUnit.SECONDS);
			wait.ignoring(Exception.class);
			wait.until(ExpectedConditions.elementToBeClickable(element));

			System.out.println("Element " + elementName + " is identified on the page " + pagename);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = false;
		}
		return status;
	}

	/**
	 * @author RC 95
	 * @param elementName
	 * @param pageName
	 * @param element
	 * @param string 
	 * @return void
	 * @description this methods helps to click the element
	 */

	// click element method
	public static void elementClick(String elementName, String pageName, WebElement element) {

		boolean status = true;
		try {
			
		// check for elementName
			
			if (elementName.isEmpty() || elementName == null) {
				throw new Exception("Element Name cannot be blank or null");
			} else {
				System.out.println("Element Name received successfully");
			}

			// check for pageName
			if (pageName.isEmpty() || pageName == null) {
				throw new Exception("Page name cannot be blank or null");
			} else {
				System.out.println("Page Name received successfully");
			}

			// check for element
			if (element == null) {
				throw new Exception("Element identifier cannot be null");
			} else {
				System.out.println("Element identifier received successfully");
			}

			element.click();
			System.out.println("Element " + elementName + " in the page " + pageName + " is clicked successfully");
		} catch (Exception e) {

			status = false;
			System.out.println("Element " + elementName + " in the page " + pageName + " with identifier "+element+" could not be clicked successfully");

		}

	}

	/**
	 * @author RC 95
	 * @param browsertype chrome
	 * @param url
	 * @return void
	 * @description this methods helps to send data to the element
	 */

	// send data generic method

	public static void sendData(String elementName, String pageName, WebElement element, String data) {

		boolean status = true;

		try {
			// check for elementName
			if (elementName.isEmpty() || elementName == null) {
				throw new Exception("Element Name cannot be blank or null");
			} else {
				System.out.println("Element Name received successfully");
			}

			// check for pageName
			if (pageName.isEmpty() || pageName == null) {
				throw new Exception("Page name cannot be blank or null");
			} else {
				System.out.println("Page Name received successfully");
			}

			// check for element
			if (element == null) {
				throw new Exception("Element cannot be null");
			} else {
				System.out.println("Element received successfully");
			}

			// check for data
			if (data.isEmpty() || data == null) {
				throw new Exception("Element cannot be null");
			} else {
				System.out.println("Data received successfully");
			}
			element.click();
			element.clear();
			element.sendKeys(data);
			System.out.println(
					"Data " + data + " sent to element " + elementName + " in the page " + pageName + " successfully");
		} catch (Exception e) {
			status = false;
			System.out.println("Sending data to " + element + " element is not successfull");

		}

	}

	/**
	 * @author RC 95
	 * @param browsertype chrome
	 * @param url
	 * @return void
	 * @description this methods helps to hover and click the element
	 */

	// hover and click method

	public static void elementHoverAndClick(String elementName, String pageName, WebElement element) {

		boolean status = true;
		try {
			// check for elementName
			if (elementName.isEmpty() || elementName == null) {
				throw new Exception("element name cannot be blank or null");
			} else {
				System.out.println("element Name received successfully");
			}

			// check for pageName
			if (pageName.isEmpty() || pageName == null) {
				throw new Exception("page name cannot be blank or null");
			} else {
				System.out.println("page Name received successfully");
			}

			// check for element
			if (element == null) {
				throw new Exception("element cannot be null");
			} else {
				System.out.println("element received successfully");
			}
			Actions act = new Actions(driver);
			act.moveToElement(element).click(element).build().perform();
			;
			// element.click();
			System.out.println(
					"element " + elementName + " in the page " + pageName + " hover and  clicked successfully");
		} catch (Exception e) {

			status = false;
			System.out.println("click is not successfull");

		}

	}

	/**
	 * @author RC 95
	 * @param browsertype chrome
	 * @param url
	 * @return void
	 * @description this methods helps to click the element through JavaScript
	 */

	// JS click method
	public static void JSClickElement(String elementName, String pageName, WebElement element) {

		boolean status = true;
		try {
			// check for elementName
			if (elementName.isEmpty() || elementName == null) {
				throw new Exception("element name cannot be blank or null");
			} else {
				System.out.println("element Name received successfully");
			}

			// check for pageName
			if (pageName.isEmpty() || pageName == null) {
				throw new Exception("page name cannot be blank or null");
			} else {
				System.out.println("page Name received successfully");
			}

			// check for element
			if (element == null) {
				throw new Exception("element cannot be null");
			} else {
				System.out.println("element received successfully");
			}

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
			System.out.println("element " + elementName + " in the page " + pageName + " JS click  successfull");
		} catch (Exception e) {

			status = false;
			System.out.println("jsclick for element " + elementName + " in the page " + pageName + "not successfull");

		}

	}

	/**
	 * @author RC 95
	 * @param browsertype chrome
	 * @param url
	 * @return attributeValue of string type
	 * @description this methods helps to click the element through JavaScript
	 */

	// get Attribute method
	public static String getElementAttributeValue(String elementName, String pageName, WebElement element,
			String attributeName) {

		String attributeValue = null;
		try {
			// check for elementName
			if (elementName.isEmpty() || elementName == null) {
				throw new Exception("element name cannot be blank or null");
			} else {
				System.out.println("element Name received successfully");
			}

			// check for pageName
			if (pageName.isEmpty() || pageName == null) {
				throw new Exception("Page name cannot be blank or null");
			} else {
				System.out.println("Page Name received successfully");
			}

			// check for element
			if (element == null) {
				throw new Exception("Element cannot be null");
			} else {
				System.out.println("Element identifier received successfully");
			}
			// getting text from element
			attributeValue = element.getAttribute(attributeName);

			System.out.println("Getting Attribute value from element " + elementName + " in the page " + pageName
					+ "is successfull");
		} catch (Exception e) {

			System.out.println("Getting Attribute from element " + elementName + " in the page " + pageName
					+ "is not successfull");

		}
		return attributeValue;
		

	}

	/**
	 * @author: RC 95
	 * @param browsertype
	 * @return boolean
	 * @description This method helps the user to display the elementName,pageName,
	 *              element.
	 **/

	public static boolean isDisplayed(String elementName, String PageName, WebElement element) {
		boolean status = true;
		try {
			if (elementName == null || elementName.isEmpty()) {
				throw new Exception("elementName cannot be  empty");
			} else {
				System.out.println("elementName received successfully");
			}
			if (PageName == null || PageName.isEmpty()) {
				throw new Exception("PageName cannot be empty or null");
			} else {
				System.out.println("PageName received successfully");
			}
			if (element == null) {
				throw new Exception("element cannot be empty");
			} else {
				System.out.println("element received successfully");
			}
			if (element.isDisplayed()) {
				System.out.println("Webelement " + elementName + " is Displayed on the "+PageName+" page" );
				status = true;
			}
		} catch (Exception ex) {
			System.out.print("Exception occured while finding the "+element+" element\n");
			status = false;
		}
		return status;
	}

	/**
	 * @author: RC 95
	 * @param elementName,pageName,element
	 * @return boolean
	 * @description This method helps the user to Enabled the elementName,pageName,
	 *              element.
	 **/

	public static boolean isEnabled(String elementName, String pageName, WebElement element) {
		boolean status = true;
		try {

			// check for input paramters of element name.

			if (elementName.isEmpty() || elementName == null) {
				throw new Exception("Element Name cannot be null or empty");
			} else {
				System.out.println("Element name is verified sucessfully");
			}

			if (pageName == null || pageName.isEmpty()) {
				throw new Exception("PageName cannot be empty or null");
			} else {
				System.out.println("PageName is received successfully");
			}
			if (element == null) {
				throw new Exception("element cannot be null");
			} else {
				System.out.println("element is received successfully");
			}

			if (element.isEnabled()) {
				System.out.println("Webelement " + elementName + "is enabled on " + pageName + "is enabled on "
						+ element + " is enabled on successfully");
				status = true;
			}
		} catch (Exception ex) {
			System.out.println("Exception occured while finding the element");
			status = false;
		}
		return status;

	}

	/**
	 * @author: RC 95
	 * @param : elementName,pageName,element
	 * @return boolean
	 * @description This method helps the user to select the elementName,pageName,
	 *              element.
	 **/
	public static boolean isSelected(String elementName, String PageName, WebElement element) {
		boolean status = true;
		try {
			// check the input parameters of elementName
			if (elementName == null || elementName.isEmpty()) {
				throw new Exception("elementName cannot be  empty");
			} else {
				System.out.println("elementName received successfully");
			}
			// check the input parameters of PageName
			if (PageName == null || PageName.isEmpty()) {
				throw new Exception("PageName cannot be empty or null");
			} else {
				System.out.println("PageName received successfully");
			}
			// check the input parameters of elements
			if (element == null) {
				throw new Exception("element cannot be empty");
			} else {
				System.out.println("element received successfully");
			}
			if (element.isSelected()) {
				System.out.println("Webelement " + elementName + "is Selected " + PageName + "is selected " + element
						+ " is selected successfully");
				status = true;
			}
		}
		// for any invalid input parameters raise an exception

		catch (Exception ex) {
			System.out.print("Exception occured while finding the element");
			status = false;
		}
		return status;
	}

	/**
	 * @author: RC 95
	 * @param elementname,PageName,element
	 * @return boolean
	 * @description This method helps the user to value from the drop down list.
	 **/

	public static String getElementText(String elementName, String pageName, WebElement element) {
		String data = "";
		try {
			if (elementName == null || elementName.isEmpty()) {
				throw new Exception("Element Name cannot be  empty");
			} else {
				System.out.println("Element Name received successfully");
			} // check the input parameters of PageName
			if (pageName == null || pageName.isEmpty()) {
				throw new Exception("PageName cannot be empty or null");
			} else {
				System.out.println("PageName received successfully");
			}
			if (element == null) {
				throw new Exception("element cannot be empty");
			} else {
				System.out.println("element received successfully");
			}

			data = element.getText();

			System.out.println("Webelement " + elementName + "is Selected " + pageName + "is selected " + element
					+ " is selected successfully");

		}
		// for any invalid input parameters raise an exception

		catch (Exception ex) {
			System.out.print("Exception occured while finding the element");

		}
		return data;
	}

	/**
	 * @author: RC 95
	 * @param elementname,PageName,element,Value
	 * @return boolean
	 * @description This method helps the user to value from the drop down list.
	 **/

	public boolean selectDropDownByValue(String elementName, String PageName, WebElement element, String Value) {

		try {
			if (elementName == null || elementName.isEmpty()) {
				throw new Exception("elementName cannot be  empty");
			} else {
				System.out.println("elementName received successfully");
			}
			if (PageName == null || PageName.isEmpty()) {
				throw new Exception("PageName cannot be empty or null");
			} else {
				System.out.println("PageName received successfully");
			}
			if (element == null) {
				throw new Exception("element cannot be empty");
			} else {
				System.out.println("element received successfully");
			}
			Select dropdown = new Select(element);
			dropdown.selectByValue(Value);
			return true;
		} catch (Exception e) {
			System.out.println(" Values is not available in the dropdown list...!!");
			return false;
		}
	}

	/////

	public boolean selectDropDownByIndex(String elementName, String PageName, WebElement element, int Index) {

		try {
			if (elementName == null || elementName.isEmpty()) {
				throw new Exception("elementName cannot be  empty");
			} else {
				System.out.println("elementName received successfully");
			}
			if (PageName == null || PageName.isEmpty()) {
				throw new Exception("PageName cannot be empty or null");
			} else {
				System.out.println("PageName received successfully");
			}
			if (element == null) {
				throw new Exception("element cannot be empty");
			} else {
				System.out.println("element received successfully");
			}
			Select dropdown = new Select(element);
			dropdown.selectByIndex(Index);
			return true;
		} catch (Exception e) {
			System.out.println(" Values is not available in the dropdown list...!!");
			return false;
		}
	}

	/////

	protected boolean isTextPresent(String text){
	    try{
	        boolean b = driver.getPageSource().contains("fake.getStationname");
	        return b;
	    }
	    catch(Exception e){
	        return false;
	    }
	  }
	////////////////////////////////////Get Text/////////////////
	
	public static String getText(String locatorkey) throws Exception{
		 try {
			 return driver.findElement(By.xpath(getLocator(locatorkey))).getText();
		 }catch(Exception e) {
			 e.printStackTrace();
			 return"";
			 
		 }
		
	}
	

	private static String getLocator(String locatorkey) {
		// TODO Auto-generated method stub
		return null;
	}

	///////////////////////////////////
	public boolean selectDropdownByVisisbleText(String elementName, String PageName, WebElement element, String Text) {

		try {
			if (elementName == null || elementName.isEmpty()) {
				throw new Exception("ElementName cannot be  empty");
			} else {
				System.out.println("ElementName received successfully");
			}
			if (PageName == null || PageName.isEmpty()) {
				throw new Exception("PageName cannot be empty or null");
			} else {
				System.out.println("PageName received successfully");
			}
			if (element == null) {
				throw new Exception("Element cannot be empty");
			} else {
				System.out.println("Element received successfully");
			}
			Select dropdown = new Select(element);
			dropdown.selectByVisibleText(Text);
			return true;
		} catch (Exception e) {
			System.out.println(" Values is not available in the dropdown list...!!");
			return false;
		}
	}
	
	
}
