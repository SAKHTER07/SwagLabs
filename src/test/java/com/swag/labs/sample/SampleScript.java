package com.swag.labs.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleScript {
	public WebDriver driver;
	public String baseURL = "https://www.saucedemo.com/";
	// public String baseURL = "https://juliemr.github.io/protractor-demo/";

	/**
	 *********************************************************************************************************   
                             Test Name: Validate the item purchase
	 *********************************************************************************************************
	 **/
	@Test
	public void setUp() {
		try {
			Thread.sleep(1000);
			System.out.println(">>>>> Test Name: Validate the item purchase <<<<<");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();		
			Thread.sleep(1000);
			driver.get(baseURL);
			System.out.println("Validate the page title is: " +driver.getTitle());

			Assert.assertEquals(driver.getTitle(), "Swag Labs");
			Thread.sleep(1000);
			WebElement username = driver.findElement(By.name("user-name"));
			username.sendKeys("standard_user");
			Thread.sleep(1000);
			WebElement passwd = driver.findElement(By.name("password"));
			passwd.sendKeys("secret_sauce");
			Thread.sleep(1000);
			WebElement loginBtn = driver.findElement(By.name("login-button"));
			loginBtn.click();
			Thread.sleep(2000);
			WebElement productsPageLabel = driver.findElement(By.xpath("//*[contains(text(),'Products')]"));
			Assert.assertTrue(productsPageLabel.isDisplayed(), "Unable to navigate to the Products page");
			Thread.sleep(1000);
			WebElement addToCartBikeLight = driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
			addToCartBikeLight.click();
			Thread.sleep(1000);
			WebElement cartIcon = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
			cartIcon.click();
			Thread.sleep(1000);
			WebElement cartPageTitle = driver.findElement(By.xpath("//*[contains(text(),'Your Cart')]"));
			System.out.println("Validate that the page title is:===>> " + cartPageTitle.getText());
			Thread.sleep(1000);
			Assert.assertEquals(cartPageTitle.getText(), "Your Cart");
			Thread.sleep(1000);
			WebElement itemQuantity = driver.findElement(By.xpath("//div[@class='cart_quantity']"));
			System.out.println("Validate that the item quantity is:===>> " + itemQuantity.getText());
			Thread.sleep(1000);
			Assert.assertEquals(itemQuantity.getText(), "1");
			Thread.sleep(1000);
			WebElement itemDescription = driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs Bike Light')]"));
			System.out.println("Validate that the item description is:===>> " + itemDescription.getText());
			Thread.sleep(1000);
			Assert.assertEquals(itemDescription.getText(), "Sauce Labs Bike Light");
			Thread.sleep(1000);
			WebElement removeHyperlink = driver.findElement(By.name("remove-sauce-labs-bike-light"));
			System.out.println("Validate that the remove hyperlink  is:===>> " + removeHyperlink.getText());
			Thread.sleep(1000);
			Assert.assertTrue(removeHyperlink.isDisplayed(), "Unable to find the remove hyperlink");
			Thread.sleep(1000);
			WebElement checkoutHyperlink = driver.findElement(By.name("checkout"));
			System.out.println("Validate that the Checkout hyperlink  is:===>> " + checkoutHyperlink.getText());
			Thread.sleep(1000);
			Assert.assertTrue(checkoutHyperlink.isDisplayed(), "Unable to find the Checkout hyperlink");
			Thread.sleep(1000);
			WebElement continueShoppingHyperlink = driver.findElement(By.name("continue-shopping"));
			System.out.println("Validate that the Continue Shopping hyperlink  is:===>> " + continueShoppingHyperlink.getText());
			Thread.sleep(1000);
			Assert.assertTrue(continueShoppingHyperlink.isDisplayed(), "Unable to find the Continue Shopping hyperlink");
			Thread.sleep(1000);
			checkoutHyperlink.click();
			Thread.sleep(1000);
			WebElement firstName = driver.findElement(By.id("first-name"));
			firstName.sendKeys("Jojo");
			Thread.sleep(1000);
			WebElement lastName = driver.findElement(By.id("last-name"));
			lastName.sendKeys("Bean");
			Thread.sleep(1000);
			WebElement postalCode = driver.findElement(By.id("postal-code"));
			postalCode.sendKeys("21225");
			Thread.sleep(1000);
			WebElement continueBtn = driver.findElement(By.name("continue"));
			continueBtn.click();
			Thread.sleep(1000);
			WebElement paymentInformationLabel = driver.findElement(By.xpath("//*[contains(text(),'Payment Information')]"));
			System.out.println("Validate that the Payment Information label is:===>> " + paymentInformationLabel.getText());
			Thread.sleep(1000);
			WebElement shippingInformationLabel = driver.findElement(By.xpath("//*[contains(text(),'Shipping Information')]"));
			System.out.println("Validate that the Shipping Information label is:===>> " + shippingInformationLabel.getText());
			Thread.sleep(1000);
			WebElement priceTotalLabel = driver.findElement(By.xpath("//*[contains(text(),'Price Total')]"));
			System.out.println("Validate that the price Total label is:===>> " + priceTotalLabel.getText());
			Thread.sleep(1000);
			WebElement finishBtn = driver.findElement(By.name("finish"));
			finishBtn.click();
			Thread.sleep(1000);
			WebElement confirmationMessage = driver.findElement(By.xpath("//*[contains(text(),'Thank you for your order!')]"));
			System.out.println("Validate that the Payment Information label is:===>> " + confirmationMessage.getText());
			Assert.assertTrue(confirmationMessage.isDisplayed(), "Unable to display the confirmation message");
			Thread.sleep(1000);
			WebElement backHomeHyperlink = driver.findElement(By.name("back-to-products"));
			backHomeHyperlink.click();
			Thread.sleep(1000);
			
			Assert.assertTrue(productsPageLabel.isDisplayed(), "Unable to navigate to the Products page");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("[Not able to purchage an item "+e.getMessage());
		}
	} 


}
