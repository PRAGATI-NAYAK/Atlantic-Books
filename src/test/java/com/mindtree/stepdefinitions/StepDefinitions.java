package com.mindtree.stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import utility.ReadPropertyFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageobjects.AboutPage;
import pageobjects.Home;

public class StepDefinitions {
WebDriver driver;


@Given("^chrome browser starts$")
public void chrome_browser_starts() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 System.out.println("1");
 ReadPropertyFile read=new ReadPropertyFile();
driver=read.getBrowser();
}

@Given("^navigates to \"([^\"]*)\"$")
public void navigates_to(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("2");

	 ReadPropertyFile read=new ReadPropertyFile();
driver.get(read.getUrl());
}

@When("^clicked on link About Us$")
public void clicked_on_link_About_Us() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("3");
	 Home home= new Home(driver);
	 home.getAbout().click();
}

@Then("^it should display About Us Page$")
public void it_should_display_About_Us_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	 System.out.println("4");
	 AboutPage  ap = new AboutPage(driver);
	 if(ap.aboutPage().getText().equalsIgnoreCase("ABOUT US"))
		 System.out.println("Correct");
  	 driver.quit();
}


}
