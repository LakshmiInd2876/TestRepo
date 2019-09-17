package NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assertverify 
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
	
	@Test
	public void contactclick()
	{
     
    WebElement str= driver.findElement(By.id("contact-link"));
    String cont=str.getText();
    System.out.println( str.getText());
    //normal assert will not proceed further if the test fails.
    //Assert.assertEquals(cont, "Contact us");
    //in verify method only boolean will expect.
    
    //if test cases fails also tpo continue with testcase we will go for softassert.
    SoftAssert a1=new SoftAssert();
    a1.assertEquals(cont, "lak");
    
    //Reporter.log(cont,true);
    str.click();
    a1.assertAll();
    //Assert.fail();
    
	}
	
	
	

}
