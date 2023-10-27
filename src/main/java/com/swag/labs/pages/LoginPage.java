package com.swag.labs.pages;	
/**
 * *********************************************************************************
 * @author sakhter
 * Test Name: Mercury Tours User Login
 * Description: This class will store all the locator and methods of MercuryToursLoginPage 
 * Reviewer Name:
 * Comments:
 * **********************************************************************************
 **/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swag.labs.util.Utility;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;  
	}
	/**
	 *********************************************************************************************************   
				   WebElements - Test Name: Swag Labs User Login
	 *********************************************************************************************************
	 **/
	@FindBy(name="user-name") WebElement userNameInput;
	@FindBy(name="password") WebElement passwordInput;
	@FindBy(name="login-button") WebElement loginBtn;
	@FindBy(xpath="//*[contains(text(),'Products')]") WebElement productsPageTitle;
	/**
	 *********************************************************************************************************   
				   Methods - Test Name: Swag Labs User Login
	 *********************************************************************************************************
	 **/
	@Test  
	public void swagLabsLoginPageElementsAndMethods(String uName, String uPass) {
		try {
			Thread.sleep(2000); // Wait statement    
			System.out.println(">>>>> Test Name: Swag Labs User Login <<<<<");
			userNameInput.sendKeys(uName); // Enter valid user name 
			Thread.sleep(2000); // Wait statement 
			passwordInput.sendKeys(uPass); // Enter valid password  
			Thread.sleep(2000); // Wait statement
			loginBtn.click(); // Click the submit button       
			Thread.sleep(2000); // Wait statement

			Utility.captureScreenshot(driver, "Test Name: Swag Labs User Login"); // Will capture the screenshot
			// Print the confirmation message
			System.out.println("Validate that page lable is: "+productsPageTitle.getText());
			// Validate the page label after the user log into the system
			Assert.assertEquals(productsPageTitle.getText(), "Products");
			Thread.sleep(1000); // wait statement

		} catch (InterruptedException e) {
			System.out.println("Not able to Login "+e.getMessage());
		}       
	}
	/**
	 * ******************************************************************************************************************************************
	 *                                        >>>>>>>>>>>> End of the file <<<<<<<<<<<<
	 * ******************************************************************************************************************************************
	 */
}

