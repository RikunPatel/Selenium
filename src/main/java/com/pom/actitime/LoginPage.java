package com.pom.actitime;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.generics.actitime.AutoConstant;
import com.generics.actitime.ExcelLibrary;



public class LoginPage implements AutoConstant
{
	@FindBy(id="username")
	private WebElement userTextfield;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws InterruptedException, IOException
	{
		userTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(sheet_name, 1, 1));
		keepmeloggedinCheckbox.click();
		loginButton.click();
		Thread.sleep(3000);		
	}

	public void forgotpasswordMethod()
	{
		forgotyourpasswordLink.click();
	}
	
	public void actitimeincMethod()
	{
		actitimeincLink.click();
	}
}
