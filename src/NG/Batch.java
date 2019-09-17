package NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.

//@Ignore

public class Batch 
{
	public WebDriver driver;
	
	@BeforeTest
	public void openbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "./Browserutils/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indegene.com");
	}
	
	@Test(priority=0)
	
	public void Title()
	{
     String title=driver.getTitle();
    // System.out.println(title);
     Reporter.log(title,true);
     //Assert.fail();
	}

}
