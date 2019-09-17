package NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTests 
{
	
	@Test
	public void testcaseone()
	{
		WebDriver driver;
		System.out.println("Testcase one with Thread id:-" + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "./Browserutils/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@Test
	public void testcasetwo()
	{
		WebDriver driver1;
		System.out.println("Testcase two with Thread id:-" + Thread.currentThread().getId());
		System.setProperty("webdriver.gecko.driver", "./Browserutils/geckodriver.exe");
		driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("http://automationpractice.com/index.php");
	}
}
