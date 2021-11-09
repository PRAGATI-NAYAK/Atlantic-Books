
package com.mindtree.runner;


import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.apache.log4j.Logger;
////import org.apache.log4j.PropertyConfigurator;

import com.mindtree.pageobject.HomePage;
import com.mindtree.utility.DataDriven;
import com.mindtree.utility.ExtentReportsClass;
import com.mindtree.utility.ReadPropertyFile;
import com.mindtree.pageobject.*;




public class AtlanticApplication {
 //   static Logger log = Logger.getLogger(AtlanticApplication.class);

//	WebDriver driver;
//	private static Logger log = LogManager.getLogger(AtlanticApplication.class.getName());
//	//ReadPropertyFile read=new ReadPropertyFile();
//	driver=read.getBrowser();
//	driver.get(read.getUrl());
//	WebDriverWait wait=new WebDriverWait(driver,50);	
	

	WebDriver driver;
	 static Logger log = LogManager.getLogger(AtlanticApplication.class.getName());
	@Test(priority=3)
	public void testcase1() throws IOException, InterruptedException{
        ReadPropertyFile read=new ReadPropertyFile();
		driver=read.getBrowser();
		driver.get(read.getUrl());
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//driver = initialiseDriver();

		WebDriverWait wait=new WebDriverWait(driver,5000);
		HomePage home = new HomePage(driver);
		Actions a = new Actions(driver);
		Computers compute = new Computers(driver);
		CartPage check =new CartPage(driver);
		BookPage books = new BookPage(driver);
		
		//PropertyConfigurator.configure("log4j.properties");
		ExtentReportsClass er = new ExtentReportsClass(driver);
		er.start("At Home Page");
	
		log.info("navigated to home page");
		
		WebElement category = home.getCategory();
		a.moveToElement(category).build().perform();
        log.info("navigated to Categories");
		WebElement comp = home.getComputers();
		a.moveToElement(comp).click().build().perform();
		er.start("At Computers Category Page");
        log.info("navigated to Computers Category Page");
		WebElement sort = compute.getSort();
		sort.click();
		int i=0;
		while(i!=5) {
		sort.sendKeys(Keys.DOWN);
		i++;
		}
		sort.click();
       log.info("Got the Recommended books");
		WebElement book = compute.viewBook();
		
		wait.until(ExpectedConditions.elementToBeClickable(book));
		book.click();
		er.start("Got the first recommended book");
		log.info("got the first recommended book");
		WebElement cart = books.addCart();
        cart.click();
        log.info("adding the book to cart");
        Thread.sleep(6000L);

		WebElement checkcart = books.checkCart();
		checkcart.click();
		log.info("checking the cart");

		WebElement viewcart = books.viewCart();

		viewcart.click();
		er.start("At Cart Page");
        log.info("view the cart info");
	
		WebElement proceed = check.checkOut();
		proceed.click();
		er.start("At Checkout Page");
        log.info("proceed to checkout");
        er.end();
    }
    
    @Test(dataProvider="getData",priority=1)
	public void testcase2(String username,String password) throws IOException {
	
		//driver = initialiseDriver();
    	  ReadPropertyFile read=new ReadPropertyFile();
  		driver=read.getBrowser();
  		driver.get(read.getUrl());

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	//	WebDriverWait wait=new WebDriverWait(driver,50);
	   HomePage home = new HomePage(driver);
	   //PropertyConfigurator.configure("log4j.properties");
	   ExtentReportsClass er = new ExtentReportsClass(driver);
		er.start("At Home Page");
	
	   log.info("navigated to home page");
	   WebElement title=home.getTitle();
	   Assert.assertEquals(title.getText(),"Book Deals of the Day");
	   log.info("Successfully validated Text");
	   
	   WebElement sign=home.getSignin();
	   sign.click();
	   
	   er.start("Sign in");
	   
	   WebElement email=home.getEmail();
	   email.sendKeys(username);
	   log.info(" entered email id");
	   
	   WebElement pass=home.getPassword();
	   pass.sendKeys(password);
	   log.info("entered password");
	   
	  // WebElement captcha=home.getCaptcha();
	   //captcha.sendKeys(Captcha);
	   
	  // WebElement close=home.Close();
	   //close.click();
	  
	   WebElement submit=home.getSubmit();
	   submit.click();
	   er.end();
	   
	}
    @Test(priority=2)
    public void testcase3() throws IOException {
    	
    //	driver=initialiseDriver();
    	  ReadPropertyFile read=new ReadPropertyFile();
  		driver=read.getBrowser();
  		driver.get(read.getUrl());

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,5000);
		HomePage home = new HomePage(driver);
		ExtentReportsClass er = new ExtentReportsClass(driver);
		er.start("Search exam books");
		DataDriven data = new DataDriven();
		SearchResultPage result=new SearchResultPage(driver);
		ArrayList<String> arr = data.getData("Test1");
    	for (int i = 1; i < arr.size(); i++) {
			home.getSearch().sendKeys(arr.get(i));
			home.getSearch().sendKeys(Keys.ENTER);
			log.info("Searching for the book " + i);
			WebElement addtocart=result.addToCart();
			wait.until(ExpectedConditions.elementToBeClickable(addtocart));
		    addtocart.click();

    	
    	}
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		er.end();

    	
    	
    }
	
	
	@DataProvider
	public Object[][] getData() {
		
		
		Object[][] data=new Object[2][2];
		data[0][0]="Pragati.Nayak@mindtree.com";
		data[0][1]="123456";
		//data[0][2]="ABCDEFG";
		data[1][0]="Rakshitha.KM@mindtree.com";
		data[1][1]="789012";
		//data[1][2]="HIJKLM";
		return data;
	}
    
    
	@AfterMethod
	public void teardown() {
		driver.quit();
		driver=null;
	}
	
	

}
