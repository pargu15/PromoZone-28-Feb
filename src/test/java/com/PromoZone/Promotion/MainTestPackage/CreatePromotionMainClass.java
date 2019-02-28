package com.PromoZone.Promotion.MainTestPackage;


import org.testng.annotations.*;

import com.PromoZone.Promotion.operations.AddContentActions;
import com.PromoZone.Promotion.operations.CreatePromotionActions;
import com.PromoZone.Promotion.operations.LoginPageActions;
import com.PromoZone.Utilities.DriverInitiation;

public class CreatePromotionMainClass {

	
	
	@BeforeClass
	public static void InitiateDriver() throws Exception {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\resources\\chromedriver.exe");
		DriverInitiation.getDriver().get("https://192.168.100.62/promozone/login");
		LoginPageActions loginActions = new LoginPageActions();
		loginActions.LoginIntoApp();
		
	}
	@Test(priority=1)
	public void DirectToCreatePromotionScreen() throws Exception{
		CreatePromotionActions createPromotionActions = new CreatePromotionActions();
		createPromotionActions.DirectToCreatePromotionScreen();
	}
	
	/*
	@Test(dependsOnMethods = "DirectToCreatePromotionScreen")
	//@Parameters("CouponType")
	public void CreateFixedPromotionScreen() throws Exception{
		
		CreatePromotionActions createPromotionActions = new CreatePromotionActions();
		createPromotionActions.FixedCouponPromotion();
	}
	
	@Test(dependsOnMethods = "DirectToCreatePromotionScreen")
	public void CreateFreeBiePromotionScreen() throws Exception{
		CreatePromotionActions createPromotionActions = new CreatePromotionActions();
		createPromotionActions.FreeBieCouponPromotion();
	}
	*/
	@Test(dependsOnMethods = "DirectToCreatePromotionScreen")
	public void CreatePercentageTypePromotionScreen() throws Exception{
		CreatePromotionActions createPromotionActions = new CreatePromotionActions();
		createPromotionActions.PercentageCouponPromotion();
	}
	
	

	//@Test(dependsOnMethods = {"CreateFixedPromotionScreen","CreatePercentageTypePromotionScreen","CreateFreeBiePromotionScreen"})
	@Test(dependsOnMethods = "CreatePercentageTypePromotionScreen")
	public void AddContent() throws Exception{
		AddContentActions addContentActions = new AddContentActions();
		addContentActions.AddContent();
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
