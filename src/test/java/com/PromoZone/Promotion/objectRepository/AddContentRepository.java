package com.PromoZone.Promotion.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddContentRepository {
	
	@FindBy(xpath = "//*[@id=\"promoFormId\"]/div[16]/div/a[2]")
	public WebElement oAddContentBtn;
	
	@FindBy(xpath = "//*[@id=\"promoFormId\"]/div[11]/div/a[2]")
	public WebElement oAddContentBtn2;
	
	@FindBy(xpath = "//*[@id=\"promoFormId\"]/div[16]/div/a[3]")
	public WebElement oActivatePromotionBtn;
	
	@FindBy(id = "image")
	public WebElement oImageName;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[1]/td/table/tbody/tr[2]/td[3]/table[1]/tbody/tr/td[2]/div/img")
	public WebElement oAddImage;
	
	@FindBy(id = "txtUploadFile	")
	public WebElement oChooseFileBtn;
	
	@FindBy(id = "btnOk")
	public WebElement oOKBtn;
	
	@FindBy(id = "addButton")
	public WebElement oAddImageBtn;
	
	
}
