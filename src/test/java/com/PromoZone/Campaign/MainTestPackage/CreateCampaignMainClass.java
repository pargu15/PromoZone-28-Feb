package com.PromoZone.Campaign.MainTestPackage;


import org.testng.annotations.*;

import com.PromoZone.Campaign.operations.CreateCampaignActions;
import com.PromoZone.Promotion.operations.CreatePromotionActions;
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
	public void DirectToCreateCampaignScreen() throws Exception{
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
	
	@Test(dependsOnMethods = "DirectToCreateCampaignScreen")
	@Parameters("CouponType")
	public void CreatePromotion(String CouponType) throws Exception{
		
		CreateCampaignActions createCampaignActions = new CreateCampaignActions();
		
		if(CouponType.equalsIgnoreCase("Fixed"))
		{
		try {
			createCampaignActions.CreateFixedCouponCampaign();
	}
		catch(Exception e)
		{
			System.out.println(e);
			throw(e);
		}
		}
		else if 
		(CouponType.equalsIgnoreCase("Percentage"))
		{
			try{
				createCampaignActions.CreatePercentageCouponCampaign();
			}
				catch(Exception e)
				{
					System.out.println(e);
					throw(e);
				}
			}
		else if(CouponType.equalsIgnoreCase("FreeBie"))
		{
			try{
				createCampaignActions.CreateFreeBieCouponCampaign();
			}
				catch(Exception e)
				{
					System.out.println(e);
					throw(e);
				}
			}
		else if(CouponType.equalsIgnoreCase("Advertisement"))
		{
			try {
				createCampaignActions.CreateAdvertisementCouponCampaign();
			}
			catch(Exception e)
			{
				System.out.println(e);
				throw(e);
			}
		}
		else {
			//If no Promotion Type passed throw exception
			System.out.println("Campaign Type is not correct");
			throw new Exception("Campaign Type is not correct");
			
		}
	}
	
	/*
	@AfterClass
	public void DriverClose() throws Exception
	{	
		DriverInitiation.getDriver().close();
		DriverInitiation.getDriver().quit();
	}
*/
}
