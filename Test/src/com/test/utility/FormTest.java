package com.test.utility;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class FormTest  {

	
	WebDriver driver;
	String downloadPath="C:\\Users\\SONY\\Downloads";
	static FileDownload filedownload;
	//filedownload= new FileDownload();
	/*
	 * public boolean isFileDownloaded(String downloadPath, String fileName) {
	 * boolean flag = false; File dir = new File(downloadPath); File[] dir_contents
	 * = dir.listFiles();
	 * 
	 * for (int i = 0; i < dir_contents.length; i++) { if
	 * (dir_contents[i].getName().equals(fileName)) return flag=true; }
	 * 
	 * return flag; }
	 */
	
	
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-form/");
	}
	
	
	
	
	/**
	 * @throws InterruptedException
	 */
	@Test()
	public void FormPageTest() throws InterruptedException {
		
		
		driver.findElement(By.xpath("//*[@name=\"firstname\"]")).clear();
		driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Jaya");
		
		
		
		driver.findElement(By.xpath("//*[@name=\"lastname\"]")).clear();
		driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("Verma");
		
		
		
		driver.findElement(By.id("sex-1")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("exp-1")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("datepicker")).sendKeys("11/20/2019");
		Thread.sleep(2000);
		
		driver.findElement(By.id("profession-0")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("photo")).sendKeys("D:\\Eclipse\\Test123.txt");
		Thread.sleep(5000);
	
		
		
		String Link =driver.findElement(By.linkText("Selenium Automation Hybrid Framework")).getText();
		Thread.sleep(2000);
		assertEquals(Link,"Selenium Automation Hybrid Framework");
		driver.findElement(By.linkText("Selenium Automation Hybrid Framework")).click();
		Thread.sleep(10000);
	
			try {
				Assert.assertTrue(filedownload.isFileDownloaded(downloadPath, "OnlineStore.zip"), "Failed to download Expected document");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		Select select1 =new Select(driver.findElement(By.id("continents")));
		select1.selectByIndex(1);
		Thread.sleep(2000);
		
		
		Select select2 =new Select(driver.findElement(By.id("selenium_commands")));
		select2.selectByIndex(2);
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	
}
