package com.ebay.pom.pages;

import org.openqa.selenium.By;

import com.ebay.pom.basepage.BasePage;

public class Home extends BasePage{
	//elemements
	By signinlink=By.xpath(".//*[@id='gh-ug']/a");
	By registerlink=By.xpath(".//*[@id='gh-ug-flex']/a");

	//actions
	public void navigate(String appUrl){
		driver.navigate().to(appUrl);
	}

	public SignIn clickSignInLink(){
		driver.findElement(signinlink).click();
		return new SignIn();
	}

	public void clickRegisterLink(){
		driver.findElement(registerlink).click();
	}


}
