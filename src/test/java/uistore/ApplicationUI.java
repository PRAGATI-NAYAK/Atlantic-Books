package uistore;

import org.openqa.selenium.By;

public class ApplicationUI {

	public By category = By.xpath("//div[@class='btn-megamenu']");
	public By comp = By.cssSelector("a[href*='https://atlanticbooks.com/computers']");
	public By sort = By.xpath("//select[@id='sorter']");
	public By book=By.xpath("(//img[@class='product-image-photo'])[1]");
	public By cart=By.xpath("//button[@class='action primary tocart']");
	public By checkcart=By.xpath("//div[@data-block='minicart']");
	public By viewcart=By.cssSelector("a.action.viewcart");
	public By proceed=By.xpath("//button[@class='action primary checkout']");
	public By signin=By.xpath("//a[contains(text(),'Sign In')]");
	public By email=By.xpath("//input[@id='email']");
	public By pass=By.xpath("//input[@id='pass']");
	public By submit=By.xpath("//button[@id='send2']");
	//public By close=By.xpath("//div[@id='social-login-popup']/span");
	public By title=By.xpath("//div[@class='title-home']");
	public By captcha=By.xpath("//input[@id='captcha_user_login']");
	public By search=By.xpath(("//input[@id='searchbox']"));
	//public By addtocart=By.cssSelector("button[containstitle='Add To Cart']");
   public By addtocart=By.xpath("//*[@id='maincontent']/div/div/div/div[1]/div[3]/div[2]/div[2]/ol/li[1]/div/div/div[2]/div[3]/form/button/span");	
  
   public By about = By.xpath("//span[contains(text(),'About Us')]");
   public By publish = By.xpath("//span[contains(text(),'Publish')]");
   public By print =By.xpath("//span[contains(text(),'Print')]");
   public By pgtitle=By.xpath("//h1[@class='page-title']");

}
