package com.generics.actitime;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pom.actitime.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}	
	
	@BeforeMethod
	public void logintoapp() throws InterruptedException, IOException
	{
		LoginPage login=new LoginPage(driver);
		login.loginMethod();
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
