package com.PromoZone.Promotion.operations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.PromoZone.Promotion.objectRepository.AddContentRepository;
import com.PromoZone.Utilities.CommonFunctions;
import com.PromoZone.Utilities.DriverInitiation;

public class AddContentActions {
	
	AddContentRepository addContentRepository = PageFactory.initElements(DriverInitiation.getDriver(),AddContentRepository.class);
	
	JavascriptExecutor jse = (JavascriptExecutor)DriverInitiation.getDriver();
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm");
	LocalDateTime localDateTime = LocalDateTime.now();
	
	public void AddContent(String CouponType) throws Exception{
		Thread.sleep(2000);
		try {
			
		if((CouponType.equalsIgnoreCase("Fixed"))||(CouponType.equalsIgnoreCase("Percentage"))||(CouponType.equalsIgnoreCase("FreeBie")))
			{
		jse.executeScript("window.scrollBy(0,200)", "");
		CommonFunctions.WaitforElementToBeVisible(addContentRepository.oAddContentBtn);
		addContentRepository.oAddContentBtn.click();
		}
		else if(CouponType.equalsIgnoreCase("Advertisement")) {
		jse.executeScript("window.scrollBy(0,50)", "");
		CommonFunctions.WaitforElementToBeVisible(addContentRepository.oAddContentBtn2);
		addContentRepository.oAddContentBtn2.click();
			}
		else {
			//If no Promotion Type passed throw exception
			throw new Exception("Content Image Couldn't Be uploaded");
		}
		
		addContentRepository.oImageName.sendKeys("Promotion Image" + " " + dtf.format(localDateTime) );
		Thread.sleep(4000);
//		DriverInitiation.getDriver().switchTo().frame(DriverInitiation.getDriver().findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr[2]/td[3]/table[1]/tbody/tr/td[2]/div/img")));
//		CommonFunctions.WaitforElementToBeVisible(addContentRepository.oAddImage);
//		addContentRepository.oAddImage.click();
//		CommonFunctions.WaitforElementToBeVisible(addContentRepository.oChooseFileBtn);
	//	addContentRepository.oChooseFileBtn.click();
		String Filepath = System.getProperty("user.dir") + "\\src\\Resources\\CouponImage.jpg";
		CommonFunctions.uploadFile(Filepath);
		Thread.sleep(4000);
//		CommonFunctions.WaitforElementToBeVisible(addContentRepository.oOKBtn);
//		addContentRepository.oOKBtn.click();
		CommonFunctions.WaitforElementToBeVisible(addContentRepository.oAddImageBtn);
		addContentRepository.oAddImageBtn.click();
		System.out.println("Image Added To Promotion Successfully");

		}
		catch(Exception e)
		{
			System.out.println(e);
			throw(e);
		}
	}

}
