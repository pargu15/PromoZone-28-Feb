package com.PromoZone.Utilities;

import org.openqa.selenium.WebElement;

public class ReturnElement {

	public WebElement element;
	public String name;

	public WebElement getElement() {
		return element;
	}

	public String getName() {
		return name;
	}

	public ReturnElement(WebElement element, String name) {
		this.element = element;
		this.name = name;

	}

}
