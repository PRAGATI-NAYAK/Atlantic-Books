package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.AppUI;

public class Computers {
	public WebDriver driver;
	 AppUI app = new AppUI();

		public Computers(WebDriver driver) {
			this.driver = driver;
		}

		public WebElement getSort() {
			return driver.findElement(app.sort);
		}
		public WebElement viewBook() {
			return driver.findElement(app.book);
		}
		
}
