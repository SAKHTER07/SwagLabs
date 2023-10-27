package com.swag.labs.regression.suite;
/**
 * *********************************************************************
 * @author sakhter
 * Class Name: 
 * Description: 
 * Reviewer Name:
 * Comments:
 * *********************************************************************
 **/

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.swag.labs.base.BaseClass;
import com.swag.labs.pages.ItemPurchase;
import com.swag.labs.pages.LoginPage;


public class SwagLabsRegressionSuite extends BaseClass
{
	/**
	 *********************************************************************************************************   
                 Test Name: Swag Labs User Login
	 *********************************************************************************************************
	 **/
	@Test (priority=0, dataProvider="getLoginPage") 	
	public void swagLabsLoginPageValidation(String userId, String userPasswd) {		
		LoginPage swagLabsLoginPage = PageFactory.initElements(driver, LoginPage.class);
		swagLabsLoginPage.swagLabsLoginPageElementsAndMethods(userId, userPasswd); 		
		
	}
	/**
	 *********************************************************************************************************   
                 Test Name: Swag Labs User Registration
	 *********************************************************************************************************
	 **/
	@Test (priority=1, dataProvider="getItemPurchase") 	
	public void itemPurchaseValidation(String userFirstName, String userLastName, String userPostalCode) {		
		ItemPurchase itemPurchase = PageFactory.initElements(driver, ItemPurchase.class);
		itemPurchase.itemPurchaseElementsAndMethods(userFirstName, userLastName, userPostalCode); 		
		
	} 
	

	
	
	/**
	 *********************************************************************************************************   
                           >>>>>>>>>>>>>>>>>> End of the File <<<<<<<<<<<<<<<<<<<
	 *********************************************************************************************************
	 **/
}

