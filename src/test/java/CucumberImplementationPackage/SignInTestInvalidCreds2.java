package CucumberImplementationPackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
//import junit.framework.Assert;
import pageObjectPackage.AfterLoginLandingPage;
import pageObjectPackage.SignInSignUpPage;
import pageObjectPackage.WebshopHomePage;
import cucumber.api.java.*;


public class SignInTestInvalidCreds2 extends BaseClass {
	
	 Logger stdLog = LogManager.getLogger(SignInTestInvalidCreds2.class);
	 	
	 @Given("^F001 S001 User is on Home Page$")
	public void user_is_on_Home_Page1() throws InterruptedException{
		 stdLog.info("Im in scenario 2");
		Thread.sleep(5000);
		BaseClass.openURL(driver,baseURL);
		Thread.sleep(5000);
		stdLog.info("Opened Base URL");
		}
	
	@When("^F001 S001 User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page1(){
		WebshopHomePage wshpObj=PageFactory.initElements(driver, WebshopHomePage.class);
		wshpObj.clickLoginLink();
		stdLog.info("Navigated to SignInSignUp Page");
		}
	
	@When("^F001 S001 User enters invalid UserName and Password$")
	public void user_enters_invalid_UserName_and_Password() throws Throwable {
		SignInSignUpPage signInSignUpPageObj=PageFactory.initElements(driver, SignInSignUpPage.class);
		signInSignUpPageObj.enterCredsSubmit("seleniumtest@gmil.com", "passw0rd");
		stdLog.info("Entered UserName and Password");
		}

	//@SuppressWarnings("deprecation")
	@Then("^F001 S001 Invalid Message displayed$")
	public void invalid_message_displayed() throws Throwable {
		SignInSignUpPage signInSignUpPageObj=PageFactory.initElements(driver, SignInSignUpPage.class);
		String assertVal=signInSignUpPageObj.checkInvalidLoginTxt();
		if (assertVal.contains("No customer account found")){
			stdLog.info("Login with Invalid unscucessful");
		}
		BaseClass.tearDown(driver);
	}
	
		
}
