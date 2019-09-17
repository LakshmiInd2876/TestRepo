package NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Search 
{
	public WebDriver driver;
	
	@BeforeTest
	public void openbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "./Browserutils/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}
	
	//To run the a method multiple times like replacement of for loop
	@Test(invocationCount=3)
	public void search()
	{
     
     WebElement sr=driver.findElement(By.xpath("//input[@id='search_query_top']"));
     sr.sendKeys("Dress");
    
	}

}
