package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import uistore.ApplicationUI;

public class AboutPage {
	public WebDriver driver;
	 ApplicationUI apps = new ApplicationUI();

		public AboutPage(WebDriver driver) {
			this.driver = driver;
		}

		public WebElement aboutPage() {
			return driver.findElement(apps.pgtitle);
		}
      
}
