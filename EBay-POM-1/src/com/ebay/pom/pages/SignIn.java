package com.ebay.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ebay.pom.basepage.BasePage;

public class SignIn extends BasePage{	
	//page elements
	By email=By.xpath("//div/span/input[@placeholder='Email or username']");
	By pwd=By.xpath("//div/span/input[@placeholder='Password']");
	By SignIn=By.xpath(".//*[@id='sgnBt']");
	
		
	//actions
	
	public void setemail(String inputvalue){
		driver.findElement(email).sendKeys("");	
	}
	public void setpwd(String inputvalue){
		driver.findElement(pwd).sendKeys("");
	}
	public void signinclick(){
		driver.findElement(SignIn).click();
	}

}
