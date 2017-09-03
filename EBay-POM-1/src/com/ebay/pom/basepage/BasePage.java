package com.ebay.pom.basepage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import junit.framework.Assert;

public class BasePage {
	public static WebDriver driver=null;
	public static Properties prop=null;

	public BasePage(){
		if(driver==null){
			if(prop==null){
				prop=new Properties();
				try {
					FileInputStream configFile= new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
					prop.load(configFile);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			System.out.println(prop.getProperty("browser"));
			if(prop.getProperty("browser").equals("FF")){
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\BrowserDrivers\\geckodriver_v0_15_0.exe");
				driver=new FirefoxDriver();		
			}else if(prop.getProperty("browser").equals("IE")){
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\BrowserDrivers\\IEDriverServer_3_3.exe");				
				driver=new InternetExplorerDriver();
			}else if(prop.getProperty("browser").equals("Chrome")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe");
				driver=new ChromeDriver();
			}else{
				Assert.fail();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		}
	}
}
