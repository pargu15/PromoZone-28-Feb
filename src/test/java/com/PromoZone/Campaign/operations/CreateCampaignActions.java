package com.PromoZone.Campaign.operations;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import com.PromoZone.Campaign.objectRepository.CreateCampaignRepository;
import com.PromoZone.Utilities.CommonFunctions;
import com.PromoZone.Utilities.DriverInitiation;

public class CreateCampaignActions {
	
	CreateCampaignRepository createCampaignRepository = PageFactory.initElements(DriverInitiation.getDriver(),CreateCampaignRepository.class);
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm");
	LocalDateTime localDateTime = LocalDateTime.now();
	
	Logger logger = Logger.getLogger("devpinoyLogger"); // To generate the log file
	private final static Logger logger1 = Logger.getLogger(CreateCampaignActions.class); 
	
	
	public void DirectToCreateCampaignScreen() throws Exception
	{
		try {
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oPromotionDropDown);
		logger.debug("Direct to Campaign Screen");
		createCampaignRepository.oPromotionDropDown.click();
		CommonFunctions.WaitforElementToBeVisible(createCampaignRepository.oCreatePromotionBtn);
		createCampaignRepository.oCreatePromotionBtn.click();
		System.out.println("User directed to Create Campaign Screen");
		}
		catch(Exception e)
		{
			System.out.println(e);
		//	throw(e);
			logger1.error(e);
		}
		
	}
	
}
