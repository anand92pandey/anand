package com.headphone.pageObject;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver ldriver;
	
	public Homepage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	@CacheLookup
	WebElement searchbox;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-logo\"]/a/span[1]")
	@CacheLookup
	WebElement logo;
	
	@FindBys(@FindBy(xpath="//span[contains(text(),'Best Seller')]"))
	@CacheLookup
	public List<WebElement> propertyList1;
	
	
	public void searchproduct(String search)
	
	{
	searchbox.sendKeys(search);
	searchbox.sendKeys(Keys.ENTER);
	}
	
	public void getbestseller() throws Exception
	{
		//propertyList1.size();
		
		for(int i=0;i<=propertyList1.size()-1;i++) 
		{
			Thread.sleep(5000);
			
			System.out.println(propertyList1.get(i).getText());
			
		}
	}
	
	
	
	
}
