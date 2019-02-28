package com.PromoZone.Promotion.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePromotionRepository {

	@FindBy(xpath = "//*[@id=\"sidebar-menu\"]/div/ul/li[5]/a")
	public WebElement oPromotionDropDown;
	
	@FindBy(xpath = "//*[@id=\"sidebar-menu\"]/div/ul/li[5]/ul/li[2]/a")
	public WebElement oCreatePromotionBtn;
	
	@FindBy(id = "first-name")
	public WebElement oPromotionName;
	
	@FindBy(id = "promotion.description")
	public WebElement oPromotionDescription;
	
	@FindBy(xpath = "//*[@id=\"user-create\"]/div[3]/div/div/span/input[2]")
	public WebElement oAdvertiser;
	
	@FindBy(xpath = "//*[@id=\"user-create\"]/div[3]/div/div/span/div/div/div[2]/strong")
	public WebElement oAdvertiserSelection;
	

	@FindBy(xpath = "//*[@id=\"user-create\"]/div[4]/div/div/button")
	public WebElement oChannelTypeDropDown;
	
	@FindBy(xpath = "//*[@id=\"user-create\"]/div[4]/div/div/div/ul/li[2]/a")
	public WebElement oChannelSelection;
	
	
	@FindBy(xpath = "//*[@id=\"user-create\"]/div[5]/div/div/button")
	public WebElement oPromotionTypeDropDown;
	
	@FindBy(xpath = "//*[@id=\"user-create\"]/div[5]/div/div/div/ul/li[3]/a")
	public WebElement oPromotionSelection;
	
	@FindBy(xpath = "//*[@id=\"user-create\"]/div[6]/div/div/button")
	public WebElement oCategoryDropDown;
	
	@FindBy(xpath = "//*[@id=\"user-create\"]/div[6]/div/div/div/ul/li[7]/a")
	public WebElement oCategorySelection;
	
	
	@FindBy(id = "restrictReprintId")
	public WebElement oRestrictReprint;
	
	@FindBy(id = "constatnt")
	public WebElement oConstatntFactorSelection;

	@FindBy(id = "promotion.value")
	public WebElement oConstatntValue;

	@FindBy(id = "percentage")
	public WebElement oPercentageSelection;

	@FindBy(id = "percentageValue")
	public WebElement oPercentageValue;

	@FindBy(id = "freeBie")
	public WebElement oFreeBieSelection;
	
	@FindBy(xpath = "//*[@id=\"user-create\"]/div[23]/div/a")
	public WebElement oCancelBtn;
	
	@FindBy(xpath = "//*[@id=\"user-create\"]/div[23]/div/button[1]")
	public WebElement oResetBtn;
	
	@FindBy(xpath = "//*[@id=\"user-create\"]/div[23]/div/button[2]")
	public WebElement oSubmitBtn;

	
}
