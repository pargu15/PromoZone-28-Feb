package com.PromoZone.Promotion.operations;

import org.openqa.selenium.support.PageFactory;

import com.PromoZone.Promotion.objectRepository.CreatePromotionRepository;
import com.PromoZone.Utilities.CommonFunctions;
import com.PromoZone.Utilities.DriverInitiation;

public class CreatePromotionActions {
	
	CreatePromotionRepository createPromotionRepository = PageFactory.initElements(DriverInitiation.getDriver(),CreatePromotionRepository.class);
	
	public void DirectToCreatePromotionScreen() throws Exception
	{
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oPromotionDropDown);
		createPromotionRepository.oPromotionDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oCreatePromotionBtn);
		createPromotionRepository.oCreatePromotionBtn.click();
	}
	
	public void FixedCouponPromotion() throws Exception
	
	{
	try
	{
		
		createPromotionRepository.oPromotionName.sendKeys("Fixed Coupon Promotion1");
		createPromotionRepository.oPromotionDescription.sendKeys("Fixed Coupon Promotion Description");
		createPromotionRepository.oAdvertiser.sendKeys("Pinelabs");
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oAdvertiserSelection);
		createPromotionRepository.oAdvertiserSelection.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oChannelTypeDropDown);
		createPromotionRepository.oChannelTypeDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oChannelSelection);
     	createPromotionRepository.oChannelSelection.click();
		createPromotionRepository.oPromotionTypeDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oPromotionSelection);
		createPromotionRepository.oPromotionSelection.click();
		createPromotionRepository.oCategoryDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oCategorySelection);
		createPromotionRepository.oCategorySelection.click();
		createPromotionRepository.oConstatntFactorSelection.click();
		createPromotionRepository.oConstatntValue.sendKeys("15");
		createPromotionRepository.oSubmitBtn.click();
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		}
	
	public void PercentageCouponPromotion() throws Exception
	
	{
	try
	{
		createPromotionRepository.oPromotionName.sendKeys("Percentage Coupon Promotion");
		createPromotionRepository.oPromotionDescription.sendKeys("Fixed Coupon Promotion Description");
		createPromotionRepository.oAdvertiser.sendKeys("Pinelabs");
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oAdvertiserSelection);
		createPromotionRepository.oAdvertiserSelection.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oChannelTypeDropDown);
		createPromotionRepository.oChannelTypeDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oChannelSelection);
     	createPromotionRepository.oChannelSelection.click();
		createPromotionRepository.oPromotionTypeDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oPromotionSelection);
		createPromotionRepository.oPromotionSelection.click();
		createPromotionRepository.oCategoryDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oCategorySelection);
		createPromotionRepository.oCategorySelection.click();
		createPromotionRepository.oPercentageSelection.click();
		createPromotionRepository.oPercentageValue.sendKeys("20");
		createPromotionRepository.oSubmitBtn.click();
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	public void FreeBieCouponPromotion() throws Exception
	
	{
		
	
	try
	{
		createPromotionRepository.oPromotionName.sendKeys("FreeBie Coupon Promotion");
		createPromotionRepository.oPromotionDescription.sendKeys("Fixed Coupon Promotion Description");
		createPromotionRepository.oAdvertiser.sendKeys("Pinelabs");
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oAdvertiserSelection);
		createPromotionRepository.oAdvertiserSelection.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oChannelTypeDropDown);
		createPromotionRepository.oChannelTypeDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oChannelSelection);
     	createPromotionRepository.oChannelSelection.click();
		createPromotionRepository.oPromotionTypeDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oPromotionSelection);
		createPromotionRepository.oPromotionSelection.click();
		createPromotionRepository.oCategoryDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oCategorySelection);
		createPromotionRepository.oCategorySelection.click();
		createPromotionRepository.oFreeBieSelection.click();
		createPromotionRepository.oSubmitBtn.click();
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	}

}
