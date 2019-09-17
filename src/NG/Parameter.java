package NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter
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
	
	@Parameters({"order" , "order1"})
	@Test
	public void search(String order,String order1)
	{
     
     WebElement sr=driver.findElement(By.xpath("//input[@id='search_query_top']"));
      sr.sendKeys(order); 
      sr.sendKeys(order1);

    
	}
}
