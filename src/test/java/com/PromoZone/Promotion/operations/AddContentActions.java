package com.PromoZone.Promotion.operations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.PromoZone.Promotion.objectRepository.AddContentRepository;
import com.PromoZone.Utilities.CommonFunctions;
import com.PromoZone.Utilities.DriverInitiation;

public class AddContentActions {
	
	AddContentRepository addContentRepository = PageFactory.initElements(DriverInitiation.getDriver(),AddContentRepository.class);
	
	JavascriptExecutor jse = (JavascriptExecutor)DriverInitiation.getDriver();
	
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm");
	LocalDateTime localDateTime = LocalDateTime.now();
	
	Actions builder = new Actions(DriverInitiation.getDriver());
	
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
//		addContentRepository.oAddImageBtn.click();
		addContentRepository.oImageName.sendKeys("Promotion Image" + " " + dtf.format(localDateTime) );
		DriverInitiation.getDriver().switchTo().frame("promotiontxt___Frame");
		CommonFunctions.WaitforElementToBeVisible(addContentRepository.oAddImage);
		addContentRepository.oAddImage.click();
        builder.sendKeys(Keys.SPACE).build().perform();
		String Filepath = System.getProperty("user.dir") + "\\src\\Resources\\CouponImage.jpg";
		CommonFunctions.uploadFile(Filepath);
		Thread.sleep(4000);
		builder.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		DriverInitiation.getDriver().switchTo().parentFrame();
		CommonFunctions.WaitforElementToBeVisible(addContentRepository.oAddImageBtn);
		addContentRepository.oAddImageBtn.click();
		System.out.println("Image Added To Promotion Successfully");
		Thread.sleep(4000);
		}
		catch(Exception e)
		{
			System.out.println(e);
	
		}
	}

}
