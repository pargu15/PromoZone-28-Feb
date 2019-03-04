package com.PromoZone.Campaign.operations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.PromoZone.Campaign.objectRepository.CreateCampaignRepository;
import com.PromoZone.Utilities.CommonFunctions;
import com.PromoZone.Utilities.DriverInitiation;

public class CreateCampaignActions {
	
	CreateCampaignRepository createCampaignRepository = PageFactory.initElements(DriverInitiation.getDriver(),CreateCampaignRepository.class);
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	LocalDateTime localDateTime = LocalDateTime.now();
	LocalDateTime localDateTime2 = LocalDateTime.now().plusDays(7);
	DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm");
	
	
	JavascriptExecutor jse = (JavascriptExecutor)DriverInitiation.getDriver();
	
	Logger logger = Logger.getLogger("devpinoyLogger"); // To generate the log file
	private final static Logger logger1 = Logger.getLogger(CreateCampaignActions.class); 
	
	Actions builder = new Actions(DriverInitiation.getDriver());
	
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
			logger1.error(e);
		}
	}
	
	public void CreateCampaign(String CouponType) throws Exception
	
	{
	try
	{
		if((CouponType.equalsIgnoreCase("Fixed"))||(CouponType.equalsIgnoreCase("Percentage"))||(CouponType.equalsIgnoreCase("Freebie"))) {
		createCampaignRepository.oCampaignName.sendKeys( CouponType + " " + "Coupon Campaign"+ " " + dtf2.format(localDateTime)); 
		
		}
		else {
			createCampaignRepository.oCampaignName.sendKeys( CouponType + " " + "Campaign"+ " " + dtf2.format(localDateTime));
			
		}
		createCampaignRepository.oCampaigndescription.sendKeys(CouponType + " " + "Description");
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
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oEndDateSelection);
		createCampaignRepository.oEndDateSelection.sendKeys(dtf.format(localDateTime2));;
		createCampaignRepository.oCampaignNoOfRepeats.clear();
		createCampaignRepository.oCampaignNoOfRepeats.sendKeys("50");
		jse.executeScript("window.scrollBy(0,250)", "");
		createCampaignRepository.oPayPerPromotion.sendKeys("1");
		if((CouponType.equalsIgnoreCase("Fixed"))||(CouponType.equalsIgnoreCase("Percentage"))||(CouponType.equalsIgnoreCase("Freebie"))) {
		createCampaignRepository.oPayPerConversion.sendKeys("1");
		}
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
	}
		}
	
	public void CreateAdvetisementCampaign() throws Exception
	
	{
	try
	{
		createCampaignRepository.oCampaignName.sendKeys("Advertisement Campaign"+ " " + dtf2.format(localDateTime)); 
		createCampaignRepository.oCampaigndescription.sendKeys("Advertisement Campaign Description");
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
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oEndDateSelection);
		createCampaignRepository.oEndDateSelection.sendKeys(dtf.format(localDateTime2));;
		createCampaignRepository.oCampaignNoOfRepeats.clear();
		createCampaignRepository.oCampaignNoOfRepeats.sendKeys("50");
		jse.executeScript("window.scrollBy(0,250)", "");
		createCampaignRepository.oPayPerPromotion.sendKeys("1");
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
	
	
	public void CampaignAwardRules(String CouponType) throws Exception
	{
	try
	{
		createCampaignRepository.oReceiptArea.click();
		createCampaignRepository.oReceiptAreaInclude.click();
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oAreaSelectionDropDown);
		createCampaignRepository.oAreaSelectionDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oBottomAreaSelection);
		createCampaignRepository.oBottomAreaSelection.click();
		createCampaignRepository.oAreaSelectionDropDown.click();
		//createCampaignRepository.oStoreSelectionDiv.click();
		createCampaignRepository.oTransactionBasedDiv.click();
		jse.executeScript("window.scrollBy(0,250)", "");
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oTransactionAmountDropdown);
		createCampaignRepository.oTransactionAmountDropdown.click();
		createCampaignRepository.oTransactionAmountGreaterThan.click();
		jse.executeScript("window.scrollBy(0,250)", "");
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oTransactionAmountInput);
		createCampaignRepository.oTransactionAmountInput.sendKeys("50");
		if((CouponType.equalsIgnoreCase("Fixed"))||(CouponType.equalsIgnoreCase("Percentage"))||(CouponType.equalsIgnoreCase("Freebie"))) {
			createCampaignRepository.oAwardNextBtn.click();
			System.out.println("User directed to Redeem Rule Screen Successfully");
			}
			else if(CouponType.equalsIgnoreCase("Advertisement")){
				createCampaignRepository.oAwardConfirmBtn.click();
				jse.executeScript("window.scrollBy(0,250)", "");
				System.out.println("User directed to Activate Campaign Screen Successfully");
				
			}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		}
	
	public void CampaignRewardRules() throws Exception
	{
	try
	{
		createCampaignRepository.oCouponValidity.click();
		createCampaignRepository.oCouponValiditySelection.click();
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oCouponValidityInput);
		createCampaignRepository.oCouponValidityInput.sendKeys("10");
		createCampaignRepository.oSubmitCampaign.click();
		System.out.println("User directed to Activate Rule Screen Successfully");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		}
	
	public void ActivateCampaign() throws Exception
	{
	try
	{
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oFinalSubmit);
		createCampaignRepository.oFinalSubmit.click();
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oClosePopup);
		createCampaignRepository.oClosePopup.click();
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oActivateCampaignBtn);
		createCampaignRepository.oActivateCampaignBtn.click();
		DriverInitiation.getDriver().get("https://192.168.100.62/promozone/");
		System.out.println("Campaign Activated Successfully");

	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		}
	
	}
