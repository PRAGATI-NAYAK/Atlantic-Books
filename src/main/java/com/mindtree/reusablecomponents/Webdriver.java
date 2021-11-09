package com.mindtree.reusablecomponents;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
////import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;



public class Webdriver {
	//public static WebDriver driver;
	
	
//		public WebDriver initialiseDriver() throws IOException {
//			Properties prop = new Properties();
//			FileInputStream fis = new FileInputStream(
//					"C:\\Users\\admin\\eclipse-workspace\\AtlanticBooks\\testdata\\config.properties");
//			prop.load(fis);
//			String browserName = prop.getProperty("browser");
//			if (browserName.equals("chrome")) {
//
//				System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeDriver"));
//				driver = new ChromeDriver();
//
//				driver.get("https://atlanticbooks.com/");
//
//			} else if (browserName.equals("firefox")) {
//				System.setProperty("webdriver.gecko.driver", prop.getProperty("FirefoxDriver"));
//				driver = new FirefoxDriver();
//
//				driver.get("https://atlanticbooks.com/");
//			} else if (browserName.equals("edge")) {
//				System.setProperty("webdriver.edge.driver", prop.getProperty("EdgeDriver"));
//				driver = new EdgeDriver();
//
//				driver.get("https://atlanticbooks.com/");
//			}
//
//			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//			return driver;
//		}
		
		
		/*public void getScreenshot(String result) throws IOException {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File("C://Users//admin//eclipse-workspace//AtlanticBooks//test//"+result+"screenshot.png"));
			
		}*/
		
	
}
