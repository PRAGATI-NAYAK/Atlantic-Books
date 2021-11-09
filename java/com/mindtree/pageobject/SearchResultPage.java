package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.AppUI;

public class SearchResultPage {
	public WebDriver driver;
	 AppUI app = new AppUI();

		public SearchResultPage(WebDriver driver) {
			this.driver = driver;
		}
	   public WebElement addToCart() {
		   return driver.findElement(app.addtocart);
	   }
}
