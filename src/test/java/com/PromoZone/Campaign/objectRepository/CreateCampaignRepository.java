package com.PromoZone.Campaign.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCampaignRepository {

	@FindBy(xpath = "//*[@id=\"sidebar-menu\"]/div/ul/li[5]/a")
	public WebElement oPromotionDropDown;
	
	@FindBy(xpath = "//*[@id=\"sidebar-menu\"]/div/ul/li[5]/ul/li[2]/a")
	public WebElement oCreatePromotionBtn;
	
	
}
