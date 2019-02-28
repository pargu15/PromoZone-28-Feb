package com.PromoZone.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
	
	public static void WaitforElementToBeVisible(final WebElement webElement) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(DriverInitiation.getDriver(),10);
		wait.until(ExpectedConditions.visibilityOf(webElement));
		
	}
}
