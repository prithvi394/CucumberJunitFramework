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


public class SignInTest extends BaseClass {
	
	 Logger stdLog = LogManager.getLogger(SignInTest.class);
	 
	
	
	@Given("^F002 S001 User is on Home Page$")
	public void user_is_on_Home_Page(){
		BaseClass.openURL(driver,baseURL);
		stdLog.info("Opened Base URL");
		}
	
	@When("^F002 S001 User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page(){
		WebshopHomePage wshpObj=PageFactory.initElements(driver, WebshopHomePage.class);
		wshpObj.clickLoginLink();
		stdLog.info("Navigated to SignInSignUp Page");
		}
	
	@When("^F002 S001 User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		SignInSignUpPage signInSignUpPageObj=PageFactory.initElements(driver, SignInSignUpPage.class);
		signInSignUpPageObj.enterCredsSubmit("seleniumtest@gmail.com", "passw0rd");
		stdLog.info("Entered UserName and Password");
		}

	//@SuppressWarnings("deprecation")
	@Then("^F002 S001 Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		AfterLoginLandingPage AfterLoginLandingPageobj=PageFactory.initElements(driver, AfterLoginLandingPage.class);
		String assertVal=AfterLoginLandingPageobj.assertLogin();
		if (assertVal.equals("seleniumtest@gmail.com")){
			stdLog.info("AssertSuccess");
		}
		else{
			stdLog.info("AssertFailure");
		}
		
		BaseClass.LogOut(driver);
		BaseClass.tearDown(driver);
	}
	
	
	/*@After public void drivertearDown() throws InterruptedException{ 
		System.out.println(" After Class 1");
	   } */
	
}
