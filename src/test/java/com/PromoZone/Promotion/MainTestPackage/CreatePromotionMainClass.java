package com.PromoZone.Promotion.MainTestPackage;


import org.testng.annotations.*;
import com.PromoZone.Promotion.operations.AddContentActions;
import com.PromoZone.Promotion.operations.CreatePromotionActions;
import com.PromoZone.Promotion.operations.LoginPageActions;
import com.PromoZone.Utilities.DriverInitiation;

public class CreatePromotionMainClass {

	
	
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
		CreatePromotionActions createPromotionActions = new CreatePromotionActions();
		createPromotionActions.DirectToCreatePromotionScreen();
	}
		catch(Exception e)
		{
			System.out.println(e);
			throw(e);
		}
	}
	
	
	@Test(dependsOnMethods = "DirectToCreatePromotionScreen")
	@Parameters("CouponType")
	public void CreatePromotion(String CouponType) throws Exception{
		
		CreatePromotionActions createPromotionActions = new CreatePromotionActions();
		
		if(CouponType.equalsIgnoreCase("Fixed"))
		{
		try {
		createPromotionActions.FixedCouponPromotion();
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
				createPromotionActions.PercentageCouponPromotion();
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
				createPromotionActions.FreeBieCouponPromotion();
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
				createPromotionActions.AdvertiseTypePromotion();
			}
			catch(Exception e)
			{
				System.out.println(e);
				throw(e);
			}
		}
		else {
			//If no Promotion Type passed throw exception
			System.out.println("Promotion Type is not correct");
			throw new Exception("Promotion Type is not correct");
			
		}
	}
	
	@Test(dependsOnMethods = "CreatePromotion")
	@Parameters("CouponType")
	public void AddContent(String CouponType) throws Exception{
		if((CouponType.equalsIgnoreCase("Fixed"))||(CouponType.equalsIgnoreCase("Percentage"))||(CouponType.equalsIgnoreCase("FreeBie"))||(CouponType.equalsIgnoreCase("Advertisement")))
		{
		try {
		AddContentActions addContentActions = new AddContentActions();
		addContentActions.AddContent(CouponType);
	}
	catch(Exception e)
	{
		System.out.println(e);
		throw(e);
	}
		}
		else {
			System.out.println("Content Image Couldn't be uploaded");
		}
		}
	

	/*
	@AfterClass
	public void DriverClose() throws Exception
	{	
		DriverInitiation.getDriver().close();
		//DriverInitiation.getDriver().quit();
	}
*/
}
