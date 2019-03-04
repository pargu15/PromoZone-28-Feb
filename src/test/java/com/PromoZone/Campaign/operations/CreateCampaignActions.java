package com.PromoZone.Campaign.operations;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import com.PromoZone.Campaign.objectRepository.CreateCampaignRepository;
import com.PromoZone.Utilities.CommonFunctions;
import com.PromoZone.Utilities.DriverInitiation;

public class CreateCampaignActions {
	
	CreateCampaignRepository createCampaignRepository = PageFactory.initElements(DriverInitiation.getDriver(),CreateCampaignRepository.class);
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	LocalDateTime localDateTime = LocalDateTime.now();
	
	JavascriptExecutor jse = (JavascriptExecutor)DriverInitiation.getDriver();
	
	Logger logger = Logger.getLogger("devpinoyLogger"); // To generate the log file
	private final static Logger logger1 = Logger.getLogger(CreateCampaignActions.class); 
	
	
	public void DirectToCreateCampaignScreen() throws Exception
	{
		try {
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oCampaignDropDown);
		logger.debug("Direct to Campaign Screen");
		createCampaignRepository.oCampaignDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oCreateCampaignBtn);
		createCampaignRepository.oCreateCampaignBtn.click();
		System.out.println("User directed to Create Campaign Screen");
		}
		catch(Exception e)
		{
			System.out.println(e);
		//	throw(e);
			logger1.error(e);
		}
		
	}
	
	public void CreateFixedCouponCampaign() throws Exception
	
	{
	try
	{
		createCampaignRepository.oCampaignName.sendKeys("Fixed Coupon Campaign"+ " " + dtf.format(localDateTime)); 
		createCampaignRepository.oCampaigndescription.sendKeys("Fixed Coupon Campaign Description");
		createCampaignRepository.oPromotionSelectionDropdown.click();
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oPromotionSelection);
		createCampaignRepository.oPromotionSelection.click();
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oSponsor);
		createCampaignRepository.oSponsor.click();
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oSponsorSelection);
		createCampaignRepository.oSponsorSelection.click();
		jse.executeScript("window.scrollBy(0,250)", "");
		createCampaignRepository.oStartDateCalendar.click();
		createCampaignRepository.oStartDateSelection.click();
     	//createCampaignRepository.oStartDateSelection.sendKeys(dtf.format(localDateTime));
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oEndDateCalendar);
		createCampaignRepository.oEndDateCalendar.click();
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oEndDateSelection);
		createCampaignRepository.oEndDateSelection.click();
		createCampaignRepository.oCampaignNoOfRepeats.clear();
		createCampaignRepository.oCampaignNoOfRepeats.sendKeys("50");
		jse.executeScript("window.scrollBy(0,250)", "");
		createCampaignRepository.oPayPerPromotion.sendKeys("1");
		createCampaignRepository.oPayPerConversion.sendKeys("1");
		createCampaignRepository.oPerDayBudget.sendKeys("999999");
		createCampaignRepository.oTotalBudget.sendKeys("999999");
		jse.executeScript("window.scrollBy(0,250)", "");
		createCampaignRepository.oMulitpleRedemptionCheckBox.click();
		createCampaignRepository.oNumberOfMultipleRedemption.sendKeys("10");
		createCampaignRepository.oMaxDailyRedemptionPerCoupon.sendKeys("100");
		createCampaignRepository.oNextBtn.click();
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oPrintAreaText);
		System.out.println("User directed to Award Rule Screen Successfully");
		
	}
	catch(Exception e)
	{
		System.out.println(e);
		throw(e);
	}
		}	

public void CreatePercentageCouponCampaign() throws Exception
	
	{
	try
	{
		
	}
	catch(Exception e)
	{
		System.out.println(e);
		throw(e);
	}
		}	

public void CreateFreeBieCouponCampaign() throws Exception

{
try
{
	
}
catch(Exception e)
{
	System.out.println(e);
	throw(e);
}
	}

public void CreateAdvertisementCouponCampaign() throws Exception

{
try
{
	
}
catch(Exception e)
{
	System.out.println(e);
	throw(e);
}
	}
}
