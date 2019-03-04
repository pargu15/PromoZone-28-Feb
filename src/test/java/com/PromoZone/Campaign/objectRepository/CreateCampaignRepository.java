package com.PromoZone.Campaign.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCampaignRepository {

	@FindBy(xpath = "//*[@id=\"sidebar-menu\"]/div/ul/li[6]/a")
	public WebElement oCampaignDropDown;
	
	@FindBy(xpath = "//*[@id=\"sidebar-menu\"]/div/ul/li[6]/ul/li[2]/a")
	public WebElement oCreateCampaignBtn;

	@FindBy(id = "campaignName")
	public WebElement oCampaignName;
	
	@FindBy(id = "campaign.description")
	public WebElement oCampaigndescription;
	
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[1]/div[3]/div/div/button")
	public WebElement oPromotionSelectionDropdown;
	
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[1]/div[3]/div/div/div/ul/li[2]/a")
	public WebElement oPromotionSelection;
	
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[1]/div[5]/div/div/button")
	public WebElement oSponsor;
	
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[1]/div[5]/div/div/div/ul/li[4]/a")
	public WebElement oSponsorSelection;
	
	@FindBy(xpath = "//*[@id=\"div_startDateOfCampaign\"]/span")
	public WebElement oStartDateCalendar;
	
	@FindBy(xpath = "//*[@id=\"div_startDateOfCampaign\"]/span")
	public WebElement oStartDateSelection;
	
	@FindBy(xpath = "//*[@id=\"div_endDateOfCampaign\"]/span")
	public WebElement oEndDateCalendar;

	@FindBy(xpath = "//*[@id=\"step-1\"]/div/div[2]/h4")
	public WebElement oEndDateSelection;
	
	@FindBy(id = "campaignNoOfRepeatsId")
	public WebElement oCampaignNoOfRepeats;
	
	@FindBy(xpath = "//*[@id=\"campaign_maxBidAmount\"]")
	public WebElement oPayPerPromotion;

	@FindBy(xpath = "//*[@id=\"maxConversionBidAmount\"]")
	public WebElement oPayPerConversion ;

	@FindBy(xpath = "//*[@id=\"maxDailyBudget\"]")
	public WebElement oPerDayBudget;

	@FindBy(xpath = "//*[@id=\"maxBudget\"]")
	public WebElement oTotalBudget;

	@FindBy(id = "mulitpleRedemption")
	public WebElement oMulitpleRedemptionCheckBox;
	
	@FindBy(id = "noofmulitpleRedemption")
	public WebElement oNumberOfMultipleRedemption;

	@FindBy(id = "maxDailyRedemptionCountPerCoupon")
	public WebElement oMaxDailyRedemptionPerCoupon;
	
	@FindBy(xpath = "//*[@id=\"step-1\"]/div/button")
	public WebElement oNextBtn;
	
	@FindBy(xpath = "//*[@id=\"award_accordion\"]/div[1]/div[1]/h4/a")
	public WebElement oPrintAreaText;
	
	
}
