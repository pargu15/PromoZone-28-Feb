package com.PromoZone.Promotion.operations;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import com.PromoZone.Promotion.objectRepository.CreatePromotionRepository;
import com.PromoZone.Utilities.CommonFunctions;
import com.PromoZone.Utilities.DriverInitiation;
import com.PromoZone.Utilities.ExcelReadEvent;
import com.PromoZone.Utilities.ExcelTypes;

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
		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		excelReadEvent.readFromExcelxlsx(0, 1, ExcelTypes.Excel1);

		createPromotionRepository.oPromotionName.sendKeys(excelReadEvent.getPromotionName() + " " + dtf.format(localDateTime));
		createPromotionRepository.oPromotionDescription.sendKeys(excelReadEvent.getPromotionDescription());
		createPromotionRepository.oAdvertiser.sendKeys(excelReadEvent.getAdvertisers());
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
		createPromotionRepository.oConstatntValue.sendKeys(excelReadEvent.getConstanValue());
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
		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		excelReadEvent.readFromExcelxlsx(0, 2, ExcelTypes.Excel1);
		createPromotionRepository.oPromotionName.sendKeys(excelReadEvent.getPromotionName() + " " + dtf.format(localDateTime));
		createPromotionRepository.oPromotionDescription.sendKeys(excelReadEvent.getPromotionDescription());
		createPromotionRepository.oAdvertiser.sendKeys(excelReadEvent.getAdvertisers());
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
		createPromotionRepository.oPercentageValue.sendKeys(excelReadEvent.getConstanValue());
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
		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		excelReadEvent.readFromExcelxlsx(0, 3, ExcelTypes.Excel1);
		
		createPromotionRepository.oPromotionName.sendKeys(excelReadEvent.getPromotionName() + " " + dtf.format(localDateTime));
		createPromotionRepository.oPromotionDescription.sendKeys(excelReadEvent.getPromotionDescription());
		createPromotionRepository.oAdvertiser.sendKeys(excelReadEvent.getAdvertisers());
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
		createPromotionRepository.oFreeBieMessage.sendKeys(excelReadEvent.getConstanValue());
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
	
	public void AdvertisementPromotion() throws Exception
	
	{
		
	
	try
	{
		ExcelReadEvent excelReadEvent = new ExcelReadEvent();
		excelReadEvent.readFromExcelxlsx(0, 4, ExcelTypes.Excel1);
		createPromotionRepository.oPromotionName.sendKeys(excelReadEvent.getPromotionName() + " " + dtf.format(localDateTime));
		createPromotionRepository.oPromotionDescription.sendKeys(excelReadEvent.getPromotionDescription());
		createPromotionRepository.oAdvertiser.sendKeys(excelReadEvent.getAdvertisers());
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
