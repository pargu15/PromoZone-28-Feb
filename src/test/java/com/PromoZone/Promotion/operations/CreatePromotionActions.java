package com.PromoZone.Promotion.operations;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.PromoZone.Promotion.objectRepository.CreatePromotionRepository;
import com.PromoZone.Utilities.CommonFunctions;
import com.PromoZone.Utilities.DriverInitiation;

public class CreatePromotionActions {
	
	CreatePromotionRepository createPromotionRepository = PageFactory.initElements(DriverInitiation.getDriver(),CreatePromotionRepository.class);
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm");
	LocalDateTime localDateTime = LocalDateTime.now();
	
	Logger logger = Logger.getLogger("devpinoyLogger"); // To generate the log file
	private final static Logger logger1 = Logger.getLogger(CreatePromotionActions.class); 
	
	
	public void DirectToCreatePromotionScreen() throws Exception
	{
		try {
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oPromotionDropDown);
		logger.debug("Direct to Promotion Screen");
		createPromotionRepository.oPromotionDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oCreatePromotionBtn);
		createPromotionRepository.oCreatePromotionBtn.click();
		System.out.println("User directed to Create Promtion Screen");
		}
		catch(Exception e)
		{
			System.out.println(e);
		//	throw(e);
			logger1.error(e);
		}
		
	}
	
	public void FixedCouponPromotion() throws Exception
	
	{
	try
	{
		
		createPromotionRepository.oPromotionName.sendKeys("Fixed Coupon"+ " " + dtf.format(localDateTime)); 
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
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oPromotionStatusPopup);
		createPromotionRepository.oPromotionStatusPopup.click();
		System.out.println("Fixed Coupon Promotion Created");
	}
	catch(Exception e)
	{
		System.out.println(e);
		throw(e);
	}
		}
	
	public void PercentageCouponPromotion() throws Exception
	
	{
	try
	{
		createPromotionRepository.oPromotionName.sendKeys("Percentage Discount" + " " + dtf.format(localDateTime));
		createPromotionRepository.oPromotionDescription.sendKeys("Percentage Discount Coupon Description");
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
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oPromotionStatusPopup);
		createPromotionRepository.oPromotionStatusPopup.click();
		System.out.println("Percentage Coupon Promotion Created");
	}
	catch(Exception e)
	{
		System.out.println(e);
		throw(e);
	}
	}
	public void FreeBieCouponPromotion() throws Exception
	
	{
	try
	{
		createPromotionRepository.oPromotionName.sendKeys("FreeBie Coupon" + " " + dtf.format(localDateTime));
		createPromotionRepository.oPromotionDescription.sendKeys("Freebie Coupon Description");
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
		createPromotionRepository.oFreeBieMessage.sendKeys("Sample Freebie Message");
		createPromotionRepository.oSubmitBtn.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oPromotionStatusPopup);
		createPromotionRepository.oPromotionStatusPopup.click();
		System.out.println("FreeBie Coupon Promotion Created");
	
	}
	catch(Exception e)
	{
		System.out.println(e);
		throw(e);
	}
	
	}
	
	public void AdvertiseTypePromotion() throws Exception
	
	{
		
	
	try
	{
		createPromotionRepository.oPromotionName.sendKeys("Advertisement" + " " + dtf.format(localDateTime));
		createPromotionRepository.oPromotionDescription.sendKeys("Freebie Coupon Description");
		createPromotionRepository.oAdvertiser.sendKeys("Pinelabs");
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oAdvertiserSelection);
		createPromotionRepository.oAdvertiserSelection.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oChannelTypeDropDown);
		createPromotionRepository.oChannelTypeDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oChannelSelection);
     	createPromotionRepository.oChannelSelection.click();
		createPromotionRepository.oPromotionTypeDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oPromotionSelection);
		createPromotionRepository.oAdvertisementSelection.click();
		createPromotionRepository.oCategoryDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oCategorySelection);
		createPromotionRepository.oCategorySelection.click();
		createPromotionRepository.oSubmitBtn.click();
		CommonFunctions.WaitforElementToBeVisible(createPromotionRepository.oPromotionStatusPopup);
		createPromotionRepository.oPromotionStatusPopup.click();
		System.out.println("Advertisement Created");
	}
	catch(Exception e)
	{
		System.out.println(e);
		throw(e);
	}
	
	}
	
}
