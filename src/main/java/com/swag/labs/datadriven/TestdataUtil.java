package com.swag.labs.datadriven;

import java.util.ArrayList;

import com.swag.labs.util.ExcelReader;

/**
 * ****************************************************************************************************************************
 * @author sakhter
 * Class Name: TestdataUtil
 * Description: 
 * Reviewer Name:
 * Comments:
 * ****************************************************************************************************************************
 **/
public class TestdataUtil {

	static ExcelReader reader;
	/**
	 ****************************************************************************************************************************   
                                  Test Name: Swag Labs User Login
	 ****************************************************************************************************************************
	 **/
	public static ArrayList<Object[]> getLoginPage() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new ExcelReader("./TestData/testdata.xlsx");
		}catch (Exception e) {
			e.printStackTrace();	
		}
		for (int rowCnt = 2; rowCnt <= reader.getRowCount("LoginPage"); rowCnt++) {   	
			String userId = reader.getCellData("LoginPage", "UserId", rowCnt); 
			String userPasswd = reader.getCellData("LoginPage", "Passwd", rowCnt); 

			Object ob[] = {userId, userPasswd};
			myData.add(ob); 
		}
		return myData;
	}
	/**
	 ****************************************************************************************************************************   
                                  Test Name: Swag Labs User Login
	 ****************************************************************************************************************************
	 **/
	public static ArrayList<Object[]> getItemPurchase() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new ExcelReader("./TestData/testdata.xlsx");
		}catch (Exception e) {
			e.printStackTrace();	
		}
		for (int rowCnt = 2; rowCnt <= reader.getRowCount("getItemPurchase"); rowCnt++) {   	
			String userFirstName = reader.getCellData("getItemPurchase", "FirstName", rowCnt); 
			String userLastName = reader.getCellData("getItemPurchase", "LastName", rowCnt); 
			String userPostalCode = reader.getCellData("getItemPurchase", "PostalCode", rowCnt); 

			Object ob[] = {userFirstName, userLastName, userPostalCode};
			myData.add(ob); 
		}
		return myData;
	}
	/**
	 ****************************************************************************************************************************   
                                 >>>>>>>> End of the File <<<<<<<<
	 ****************************************************************************************************************************
	 **/
}