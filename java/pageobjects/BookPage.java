package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import uistore.ApplicationUI;

public class BookPage {


	public WebDriver driver;
	 ApplicationUI apps = new ApplicationUI();

		public BookPage(WebDriver driver) {
			this.driver = driver;
		}

		public WebElement addCart() {
			return driver.findElement(apps.cart);
		}
       
		public WebElement checkCart() {
			return driver.findElement(apps.checkcart);
		}
		public WebElement viewCart() {
			return driver.findElement(apps.viewcart);
		}
		
		

}
