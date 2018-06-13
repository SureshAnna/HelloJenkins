package com.jenkins.HelloJenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
	 WebDriver driver;
		
		@BeforeMethod
		public void LunchBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh\\workSpace4Automation\\BasicPractice\\chromedriver.exe");
		  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";

		 driver.get(URL);

		 
		}
		
		@Test
		
		public void InitBrowser(){
			
			WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

			WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

			Actions builder = new Actions(driver);

			Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();

			dragAndDrop.perform();
			System.out.println("performed ");
			
			
			
		}
		
		@AfterMethod
	public void CloseBrowser(){
			driver.close();
		}
		

}
