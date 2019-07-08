package com.headphone.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TestBaseclass {

	public String baseurl="http:\\www.amazon.com";
	public String searchpro="Headphones";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	
	
}
