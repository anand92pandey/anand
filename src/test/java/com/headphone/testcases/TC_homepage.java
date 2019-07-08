package com.headphone.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.headphone.pageObject.Homepage;

public class TC_homepage extends TestBaseclass{
	
	@Test
	public void search()
	{
		driver.get(baseurl);
		//System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		Homepage hp=new Homepage(driver);
		hp.searchproduct(searchpro);
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"search\"]/span/h1/div/div[1]/div/div/span[3]")).getText());
		
		if(driver.findElement(By.xpath("//*[@id=\"search\"]/span/h1/div/div[1]/div/div/span[3]")).getText().equals("\"Headphones\""))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}

}
