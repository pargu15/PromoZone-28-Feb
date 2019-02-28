package com.PromoZone.Promotion.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddContentRepository {
	
	@FindBy(xpath = "//*[@id=\"promoFormId\"]/div[16]/div/a[2]")
	public WebElement oAddContentBtn;
	
	@FindBy(xpath = "//*[@id=\"promoFormId\"]/div[16]/div/a[3]")
	public WebElement oActivatePromotionBtn;
	
	
}
