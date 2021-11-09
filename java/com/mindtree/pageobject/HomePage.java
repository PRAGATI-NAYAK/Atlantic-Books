package com.mindtree.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.AppUI;

public class HomePage {
	public WebDriver driver;
 AppUI app = new AppUI();

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
   public WebElement getSearch() {
	   return driver.findElement(app.search);
   }
	public WebElement getCategory() {
		return driver.findElement(app.category);
	}

	public WebElement getComputers() {
		return driver.findElement(app.comp);
	}
	
	public WebElement getSignin() {
		return driver.findElement(app.signin);
	}
	public WebElement getEmail() {
		return driver.findElement(app.email);
	}
	public WebElement getPassword() {
		return driver.findElement(app.pass);
	}
	public WebElement getSubmit() {
		return driver.findElement(app.submit);
	}
/*	public WebElement Close() {
		return driver.findElement(app.close);
	}*/
	public WebElement getTitle() {
		return driver.findElement(app.title);
	}
	public WebElement getCaptcha() {
		return driver.findElement(app.captcha);
	}
	
}
