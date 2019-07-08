package com.headphone.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.headphone.pageObject.Homepage;

public class TC2_Addtocart extends TestBaseclass {

	@Test
	public void clickonbestseller() throws Exception
	{
		driver.get(baseurl);
		Homepage bs=new Homepage(driver);
		bs.searchproduct(searchpro);
		bs.getbestseller();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[11]/div/div/div/div[2]/div[1]")).click();
		
		
	}
}
