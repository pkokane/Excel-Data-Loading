package com.test.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class popuprediff {

	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	
	
	
	
	@Test()
	public void halfrediffSendKeys() throws InterruptedException {
		
		
		//driver.findElement(By.xpath("//*[@name=\"proceed\"]")).clear();
		driver.findElement(By.xpath("//*[@name=\"proceed\"]")).click();
		Thread.sleep(5000);
		
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	
}
