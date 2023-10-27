package com.swag.labs.sample;
/**
 * ********************************************************************************************************************
 * @author sakhter
 * Test Name: Mercury Tours Flight Booking 
 * Description: 
 * Reviewer Name:
 * Comments:
 * ********************************************************************************************************************
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginValidation  {
	public WebDriver driver;
	public String baseURL = "https://demo.guru99.com/test/newtours/";

	/**
	 *********************************************************************************************************   
                                         Before Test: Validate the landing/home page
	 *********************************************************************************************************
	 **/
	@BeforeClass
	public void setUp() {
		try {
			Thread.sleep(1000);
			System.out.println(">>>>>>>> Before Test: Validate the landing/home page <<<<<<<<");
			// Setting up the webDriver and start the browser with the URL
			// WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(1000);
			driver.get(baseURL);
			Thread.sleep(1000);
			String pageTitle = driver.getTitle();
			System.out.println("Validate the page title is: " +pageTitle);
			Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
			Thread.sleep(1000);
			WebElement homeTab = driver.findElement(By.linkText("Home"));
			System.out.println("Validate that the home tab is: " + homeTab.getText());
			Thread.sleep(1000);
			Assert.assertTrue(homeTab.isDisplayed(), "Unable to find the home page");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("[Not able to navigate to the landing/home page "+e.getMessage());
		}
	} 
	/**
	 *********************************************************************************************************   
                                         Test: Validate User Registration
	 *********************************************************************************************************
	 **/
	@Test
	public void userRegisterTest() {
		try {
			Thread.sleep(1000); // wait statement
			System.out.println(">>>>>>>> Test: Validate User Registration <<<<<<<<");
			// Create object of WebDriverWait class
			// WebDriverWait waitRegisterHyperlink = new WebDriverWait(driver, 20);
			// Wait until element is visible
			// waitRegisterHyperlink.until(ExpectedConditions.elementToBeClickable(registerHyperlink));

			WebElement registerHyperlink = driver.findElement(By.linkText("REGISTER"));
			registerHyperlink.click(); // Click the Register hyperlink
			Thread.sleep(1000); // wait statement
			WebElement userFirstName = driver.findElement(By.name("firstName"));
			userFirstName.sendKeys("Jojo"); // Enter the user First name
			Thread.sleep(1000); // wait statement
			WebElement userLastName = driver.findElement(By.name("lastName"));
			userLastName.sendKeys("Bean");  // Enter the user Last name
			Thread.sleep(1000); // wait statement
			WebElement userPhone = driver.findElement(By.name("phone"));
			userPhone.sendKeys("333-222-1111"); // Enter the user phone number
			Thread.sleep(1000); // wait statement
			WebElement userEmail = driver.findElement(By.name("userName"));
			userEmail.sendKeys("jojo@gamil.com"); // Enter the user email address
			Thread.sleep(1000); // wait statement
			WebElement userAddress = driver.findElement(By.name("address1"));
			userAddress.sendKeys("123 Main St"); // Enter the user address
			Thread.sleep(1000); // wait statement
			WebElement userCity = driver.findElement(By.name("city"));
			userCity.sendKeys("Baltiomre"); // Enter the user city
			Thread.sleep(1000); // wait statement
			WebElement userState = driver.findElement(By.name("state"));
			userState.sendKeys("MD"); // Enter the user state
			Thread.sleep(1000); // wait statement
			WebElement userPostalCode = driver.findElement(By.name("postalCode"));
			userPostalCode.sendKeys("21244"); // Enter the user postal code
			Thread.sleep(1000); // wait statement
			WebElement userCountry = driver.findElement(By.name("country"));
			Select selectcountry = new Select (userCountry);
			selectcountry.selectByVisibleText("ALBANIA"); // Select the user country
			Thread.sleep(1000); // wait statement
			WebElement username = driver.findElement(By.name("email"));
			username.sendKeys("jojobean"); // Enter the user name
			Thread.sleep(1000); // wait statement
			WebElement userPassword = driver.findElement(By.name("password"));
			userPassword.sendKeys("Pass123"); // Enter the user password
			Thread.sleep(1000); // wait statement
			WebElement userConfirmPassword = driver.findElement(By.name("confirmPassword"));
			userConfirmPassword.sendKeys("Pass123"); // Enter the user confirm password
			Thread.sleep(1000); // wait statement
			// wait statement
			// Create object of WebDriverWait class
			// WebDriverWait waitSubmitBtn = new WebDriverWait(driver, 20);
			// Wait until element is visible
			// waitSubmitBtn.until(ExpectedConditions.elementToBeClickable(submitBtn));
			WebElement submitBtn = driver.findElement(By.name("submit"));
			submitBtn.click(); // Click the submit button
			Thread.sleep(1000); // wait statement
			WebElement registerConfirmationMessage = driver.findElement(By.xpath("//*[contains(text(),' Note: Your user name is jojobean.')]"));
			Assert.assertTrue(registerConfirmationMessage.isDisplayed(), "Unable to find the home page");
			Thread.sleep(1000); // wait statement
		} catch (Exception e) {
			System.out.println("[Not able to Register "+e.getMessage());
		}
	}
	/**
	 *********************************************************************************************************   
                                        After Test: Closing the browser
	 *********************************************************************************************************
	 **/
	@AfterClass
	public void closeBrowser() {
		try {
			Thread.sleep(1000);
			System.out.println(">>>>>>>> After Test: Closing the browser <<<<<<<<");
			// driver.quit();
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Not able to close the browser "+e.getMessage());
		}
	}
	/**
	 * ******************************************************************************************************************************************
	 *                                        >>>>>>>>>>>> End of the file <<<<<<<<<<<<
	 * ******************************************************************************************************************************************
	 */
}

