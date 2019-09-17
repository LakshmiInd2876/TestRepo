package NG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2
{
	
		public WebDriver driver;
		
		@BeforeTest(alwaysRun=true)
		public void openbrowser()
		{
			
			System.setProperty("webdriver.chrome.driver", "./Browserutils/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
		}
		
		@Test(groups="url",priority=1)
		
		public void Title()
		{
	     String title=driver.getTitle();
	    // System.out.println(title);
	     Reporter.log(title,true);
	     //Assert.fail();
		}
		
		@Test(groups="url")
		public void getURL()
		{
	     String url=driver.getCurrentUrl();
	     System.out.println(url);
	     Reporter.log(url,true);
		}
		
		//@Test(dependsOnMethods="Title",priority=2)
		//@Test(enabled=false)
		@Test(groups="contact")
		public void contact()
		{
	      WebElement cont=driver.findElement(By.xpath("//div[@id='contact-link']"));
	      cont.click();
	      String contact=driver.findElement(By.xpath("//a[text()='Contact us']")).getText();
	      
	      System.out.println(contact);
	      Reporter.log(contact,true);
	    
	     
		}
		
		/*
		@AfterTest
		 public void closebrowser()
		 {
			driver.close();
		 }*/


	}


