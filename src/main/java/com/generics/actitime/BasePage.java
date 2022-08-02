package com.generics.actitime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	public void gettitle(WebDriver driver)
	{
		System.out.println(driver.getTitle());
	}
	
	public void selectbyvisibletext(WebElement ele , String text)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	public void movetoelement(WebDriver driver , WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void robottab() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	
	public void alertok(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
}