package integrationTests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.*;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;
import pageObjectPackage.WebshopHomePage;

public class SignInTest extends BaseClass {
	
	 Logger stdLog = LogManager.getLogger(SignInTest.class);
	
	@Before
	public void testDeclaration(){
		BaseClass.openURL(driver,baseURL);
		stdLog.info("Opened Base URL");
		 
	}
	
	@Test
	public void testStepsBaseClass(){
		
		WebshopHomePage wshpObj=PageFactory.initElements(driver, WebshopHomePage.class);
		wshpObj.clickLoginLink();
		
	}
	
	

}
