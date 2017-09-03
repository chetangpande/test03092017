package com.ebay.pom.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebay.pom.pages.Home;
import com.ebay.pom.pages.SignIn;

public class BuyProductTestCase {
	@Test
	public void BuyProductTC(){
		
		Home h1= new Home();		
		h1.navigate("https://www.ebay.com/");
		SignIn s1=h1.clickSignInLink();
		
		//SignIn s1= new SignIn();
		
		
		s1.setemail("abc");
		s1.setpwd("xyz");
		//s1.signinclick();
		
		
		
		
	}
	
	
	@DataProvider
	public Object[][] getData(){
		//apache poi utiltily functions
		Object[][] data=new Object[2][2];
		return data;
	}

}
