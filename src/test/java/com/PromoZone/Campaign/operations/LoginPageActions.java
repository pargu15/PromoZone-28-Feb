package com.PromoZone.Campaign.operations;


import org.openqa.selenium.support.PageFactory;

import com.PromoZone.Promotion.objectRepository.LoginPageRepository;
import com.PromoZone.Utilities.CommonFunctions;
import com.PromoZone.Utilities.DriverInitiation;



public class LoginPageActions {
	

	LoginPageRepository loginRepository =PageFactory.initElements(DriverInitiation.getDriver(), LoginPageRepository.class);

	CommonFunctions commonFunctions = new CommonFunctions();
	public void LoginIntoApp() throws Exception{
		loginRepository.oUserName.sendKeys("promo.admin2");
		loginRepository.oPassword.sendKeys("Pine@12345");
		loginRepository.oLoginBtn.click();
		commonFunctions.WaitforElementToBeVisible(loginRepository.oWelcomeText);
		System.out.println("Login Successful Test");
	}
	
	
}
