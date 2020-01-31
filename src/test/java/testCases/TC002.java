package testCases;

import static org.testng.Assert.assertFalse;
import java.io.IOException;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Base.BasePage;

import extentReports.ExtReportDemo;


public class TC002 extends ExtReportDemo {

	public static WebDriver driver;
	

	@BeforeTest
	public void bf() {
		System.out.println("**Before Test2**");
	}

	@Test
	public void TC_0002() throws IOException, InterruptedException {
		
		test = extent.createTest("TC_0002");

		driver = BasePage.Initialize();
		//WebDriverManager.chromedriver().arch64().setup();
		driver.navigate().to("https://www.linkedin.com/notifications/");
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Sign")).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
		// assertTrue(false);
		assertFalse(false);
	}

	@AfterTest
	public void AfterTest() {

		System.out.println("**After Test2**");
	}

	@AfterClass
	public void TearDown() 
	{ 
		System.out.println("**After Class2**");
		BasePage.TearDown();
	}

}
