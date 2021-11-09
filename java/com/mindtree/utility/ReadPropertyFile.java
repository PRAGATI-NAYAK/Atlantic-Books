package com.mindtree.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertyFile {
static Properties prop;

public static WebDriver driver;
public ReadPropertyFile() throws IOException {
	prop=new Properties();
	FileInputStream fis=new FileInputStream("./testdata/config.properties");
	prop.load(fis);
		
}

public WebDriver getBrowser() {
	String browserName=prop.getProperty("browser");
if (browserName.equals("chrome")) {

	System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeDriver"));
	driver = new ChromeDriver();

	//driver.get("https://atlanticbooks.com/");

} else if (browserName.equals("firefox")) {
	System.setProperty("webdriver.gecko.driver", prop.getProperty("FirefoxDriver"));
	driver = new FirefoxDriver();

	//driver.get("https://atlanticbooks.com/");
} else if (browserName.equals("edge")) {
	System.setProperty("webdriver.edge.driver", prop.getProperty("EdgeDriver"));
	driver = new EdgeDriver();

	//driver.get("https://atlanticbooks.com/");
}

//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
return driver;
}
//public String getDriver() {
//	String driver=prop.getProperty("ChromeDriver");
//	if(driver!=null) {
//		return driver;
//	}
//}
public String getUrl() {
	String url=prop.getProperty("url");
	return url;
	
}
public String getExtentReportPath() {
	String extentReportPath=prop.getProperty("ExtentReportPath");
	
	return extentReportPath;
	

}
}
