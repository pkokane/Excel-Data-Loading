package com.test.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class FrameTest {

	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("");
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		
		ArrayList<Object[]> TestData=testutil.getDataFromExcel();
		return TestData.iterator();
		
	}
	
	
	
	@Test(dataProvider="getTestData")
	public void halfEbaySendKeys(String firstname,String lastname,String email) {
		
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstname);
		
		driver.manage().timeouts().implicitlyWait(30000,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastname);
		
		driver.manage().timeouts().implicitlyWait(30000,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		
		driver.manage().timeouts().implicitlyWait(30000,TimeUnit.SECONDS);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	
}
