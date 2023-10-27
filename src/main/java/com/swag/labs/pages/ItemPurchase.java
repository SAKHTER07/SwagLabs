package com.swag.labs.pages;
/**
 * *********************************************************************************
 * @author sakhter
 * Class Name: MercuryToursRegisterPage 
 * Description: This class will store all the locator and methods of MercuryToursRegisterPage 
 * Reviewer Name:
 * Comments:
 * **********************************************************************************
 **/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swag.labs.util.Utility;

public class ItemPurchase {
	public WebDriver driver;
	public ItemPurchase(WebDriver driver) {
		this.driver = driver;  
	}
	/**
	 *********************************************************************************************************   
			               WebElements - Test Name: Swag Labs item purchase
	 *********************************************************************************************************
	 **/
	@FindBy(name="add-to-cart-sauce-labs-bike-light") WebElement addToCartBikeLightHyperlink;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") WebElement cartIconHyperlink;
	@FindBy(xpath="//*[contains(text(),'Your Cart')]") WebElement cartPageTitle;
	@FindBy(xpath="//div[@class='cart_quantity']") WebElement itemQuantity;
	@FindBy(xpath="//*[contains(text(),'Sauce Labs Bike Light')]") WebElement itemDescription;
	@FindBy(name="checkout") WebElement checkoutHyperlink;
	@FindBy(name="firstName") WebElement firstNameInput;
	@FindBy(name="lastName") WebElement lastNameInput;
	@FindBy(name="postalCode") WebElement postalCodeInput;
	@FindBy(name="continue") WebElement continueHyperlink;
	@FindBy(xpath="//*[contains(text(),'Payment Information')]") WebElement paymentInformationLabel;
	@FindBy(xpath="//*[contains(text(),'Shipping Information')]") WebElement shippingInformationLabel;
	@FindBy(xpath="//*[contains(text(),'Price Total')]") WebElement priceTotalLabel;
	@FindBy(name="finish") WebElement finishHyperlink;
	@FindBy(xpath="//*[contains(text(),'Thank you for your order!')]") WebElement confirmationMessage;
	@FindBy(name="back-to-products") WebElement backHomeHyperlink;
	@FindBy(xpath="//*[contains(text(),'Products')]") WebElement productsPageTitle;

	/**
	 *********************************************************************************************************   
			               Methods - Test Name: Swag Labs item purchase
	 *********************************************************************************************************
	 **/
	@Test  
	public void itemPurchaseElementsAndMethods(String fName, String lName, String pCode) {
		try {
			Thread.sleep(2000); // Wait statement    
			System.out.println(">>>>> Test Name: Swag Labs item purchase <<<<<");
			// Click the "Add To cart" hyperlink "Sauce Labs Bike Light"
			addToCartBikeLightHyperlink.click(); 
			Thread.sleep(2000); // Wait statement 
			cartIconHyperlink.click(); // Click the cart icon
			Thread.sleep(2000); // Wait statement
			System.out.println("Validate that the page title is:===>> " + cartPageTitle.getText());
			Thread.sleep(1000);
			Assert.assertEquals(cartPageTitle.getText(), "Your Cart");
			Thread.sleep(1000);
			System.out.println("Validate that the item quantity is:===>> " + itemQuantity.getText());
			Thread.sleep(1000);
			Assert.assertEquals(itemQuantity.getText(), "1");
			Thread.sleep(1000);
			System.out.println("Validate that the item description is:===>> " + itemDescription.getText());
			Thread.sleep(1000);
			Assert.assertEquals(itemDescription.getText(), "Sauce Labs Bike Light");
			Thread.sleep(1000);
			// Will capture the screenshot
			Utility.captureScreenshot(driver, "Validating Cart page title, item quantity, and item description"); 
			checkoutHyperlink.click();// Click the "Checkout" hyperlink
			
			firstNameInput.sendKeys(fName); // Enter user first name
			Thread.sleep(2000); // Wait statement 
			lastNameInput.sendKeys(lName); // Enter user last name
			Thread.sleep(2000); // Wait statement
			postalCodeInput.sendKeys(pCode); // Enter postal code
			Thread.sleep(2000); // Wait statement
			continueHyperlink.click(); // Click the "Continue" hyperlink    
			Thread.sleep(2000); // Wait statement
			
			
			System.out.println("Validate that the Payment Information label is:===>> " + paymentInformationLabel.getText());
			Thread.sleep(1000);
			Assert.assertEquals(paymentInformationLabel.getText(), "Payment Information");
			System.out.println("Validate that the Shipping Information label is:===>> " + shippingInformationLabel.getText());
			Thread.sleep(1000);
			Assert.assertEquals(shippingInformationLabel.getText(), "Shipping Information");
			System.out.println("Validate that the price Total label is:===>> " + priceTotalLabel.getText());
			Thread.sleep(1000);
			Assert.assertEquals(priceTotalLabel.getText(), "Price Total");
			
			// Will capture the screenshot
			Utility.captureScreenshot(driver, "Validating paymenth information, shipping information, and price total"); 
			Thread.sleep(1000);
			finishHyperlink.click();
			Thread.sleep(1000);
			
			System.out.println("Validate that the Payment Information label is:===>> " + confirmationMessage.getText());
			Assert.assertTrue(confirmationMessage.isDisplayed(), "Unable to display the confirmation message");
			Thread.sleep(1000);
			// Will capture the screenshot
			Utility.captureScreenshot(driver, "Validating purchase confirmation message"); 
			backHomeHyperlink.click();
			Thread.sleep(1000);
			
			Assert.assertTrue(productsPageTitle.isDisplayed(), "Unable to navigate to the Products page");
			Thread.sleep(1000); // wait statement

		} catch (InterruptedException e) {
			System.out.println("Not able to purchase items "+e.getMessage());
		}       
	}
	/**
	 * ******************************************************************************************************************************************
	 *                                        >>>>>>>>>>>> End of the file <<<<<<<<<<<<
	 * ******************************************************************************************************************************************
	 */
}

