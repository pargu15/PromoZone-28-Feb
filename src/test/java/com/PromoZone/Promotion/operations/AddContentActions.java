package com.PromoZone.Promotion.operations;

import org.openqa.selenium.support.PageFactory;

import com.PromoZone.Promotion.objectRepository.AddContentRepository;
import com.PromoZone.Utilities.CommonFunctions;
import com.PromoZone.Utilities.DriverInitiation;

public class AddContentActions {
	
	AddContentRepository addContentRepository = PageFactory.initElements(DriverInitiation.getDriver(),AddContentRepository.class);
	
	public void AddContent() throws Exception{
		CommonFunctions.WaitforElementToBeVisible(addContentRepository.oAddContentBtn);
		addContentRepository.oAddContentBtn.click();
	}

}
