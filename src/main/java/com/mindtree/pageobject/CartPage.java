package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.AppUI;

public class CartPage {
	public WebDriver driver;
	 AppUI app = new AppUI();

		public CartPage(WebDriver driver) {
			this.driver = driver;
		}

		public WebElement checkOut() {
			return driver.findElement(app.proceed);
		}
		
}
