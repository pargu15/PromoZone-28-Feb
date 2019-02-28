package com.PromoZone.Promotion.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageRepository {
	
	@FindBy(id = "username")
	public WebElement oUserName;
	@FindBy(id = "password")
	public WebElement oPassword;
	@FindBy(xpath = "/html/body/section/div[1]/div/div/div[2]/form/div[3]/input")
	public WebElement oLoginBtn;
	@FindBy(xpath = "/html/body/div/div/div[1]/div/div[3]/div[2]/span")
	public WebElement oWelcomeText;
	
	
	
}