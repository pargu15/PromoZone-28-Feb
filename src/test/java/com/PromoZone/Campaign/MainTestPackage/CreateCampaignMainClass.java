package com.PromoZone.Campaign.MainTestPackage;


import org.testng.annotations.*;

import com.PromoZone.Campaign.operations.CreateCampaignActions;
import com.PromoZone.Promotion.operations.LoginPageActions;
import com.PromoZone.Utilities.DriverInitiation;

public class CreateCampaignMainClass {
	
	@BeforeClass
	public static void InitiateDriver() throws Exception {
		try {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\resources\\chromedriver.exe");
		DriverInitiation.getDriver().get("https://192.168.100.62/promozone/login");
		LoginPageActions loginActions = new LoginPageActions();
		loginActions.LoginIntoApp();	
	}
		catch(Exception e)
		{
			System.out.println(e);
			throw(e);
		}
	}
	
	@Test(priority=1)
	public void DirectToCreatePromotionScreen() throws Exception{
		try {
			CreateCampaignActions createCampaignActions = new CreateCampaignActions();
			createCampaignActions.DirectToCreateCampaignScreen();
	}
		catch(Exception e)
		{
			System.out.println(e);
			throw(e);
		}
	}
	
	
	@AfterClass
	public void DriverClose() throws Exception
	{	
		DriverInitiation.getDriver().close();
		DriverInitiation.getDriver().quit();
	}

}
