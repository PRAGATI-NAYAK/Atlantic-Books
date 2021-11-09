package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.AppUI;

public class BookPage {


	public WebDriver driver;
	 AppUI app = new AppUI();

		public BookPage(WebDriver driver) {
			this.driver = driver;
		}

		public WebElement addCart() {
			return driver.findElement(app.cart);
		}
       
		public WebElement checkCart() {
			return driver.findElement(app.checkcart);
		}
		public WebElement viewCart() {
			return driver.findElement(app.viewcart);
		}
		
		

}
