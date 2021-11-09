package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import uistore.ApplicationUI;

public class Home {
	public WebDriver driver;
 ApplicationUI apps = new ApplicationUI();

	public Home(WebDriver driver) {
		this.driver = driver;
	}
   public WebElement getSearch() {
	   return driver.findElement(apps.search);
   }
	public WebElement getCategory() {
		return driver.findElement(apps.category);
	}

	public WebElement getComputers() {
		return driver.findElement(apps.comp);
	}
	
	public WebElement getSignin() {
		return driver.findElement(apps.signin);
	}
	public WebElement getEmail() {
		return driver.findElement(apps.email);
	}
	public WebElement getPassword() {
		return driver.findElement(apps.pass);
	}
	public WebElement getSubmit() {
		return driver.findElement(apps.submit);
	}
/*	public WebElement Close() {
		return driver.findElement(app.close);
	}*/
	public WebElement getAbout() {
		return driver.findElement(apps.about);
	}
	public WebElement getPublish() {
		return driver.findElement(apps.publish);
	}
	public WebElement getPrint() {
		return driver.findElement(apps.print);
	}
	public WebElement getTitle() {
		return driver.findElement(apps.title);
	}
	public WebElement getCaptcha() {
		return driver.findElement(apps.captcha);
	}
	
}
