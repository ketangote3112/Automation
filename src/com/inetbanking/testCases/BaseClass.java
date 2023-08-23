package com.inetbanking.testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL="https://demo.guru99.com/V4/";
	public String username="mngr522631";
	public String password="mngr522631";
	public static WebDriver driver;

	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F://eciplise_workshop_2023//MiniProject1//Drivers//chromedriver.exe");
	    driver=new ChromeDriver();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
