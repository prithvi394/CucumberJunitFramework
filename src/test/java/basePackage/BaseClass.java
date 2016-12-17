package basePackage;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class BaseClass {
	
  	 public WebDriver driver;
	 public String baseURL="http://demowebshop.tricentis.com/";
	 public static Logger baselog = LogManager.getLogger(BaseClass.class);
	 public ExtentReports report;
	 public ExtentTest logger;
	
	public BaseClass(){
		
		report=new ExtentReports("C:\\Users\\Prithviraj\\SeleniumExecutionResults\\ExtentReports\\JunitCucumberFramework.html",false);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Training\\Practice\\Chrome Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
	}
	

}
