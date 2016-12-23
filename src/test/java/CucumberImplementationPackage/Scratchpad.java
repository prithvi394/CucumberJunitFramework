package CucumberImplementationPackage;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePackage.BaseClass;

public class Scratchpad  {
	
	@Test
	public void test() throws InterruptedException{
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile myprofile = profile.getProfile("SeleniumTestProfile");
		myprofile.setPreference("dom.disable_beforeunload", true);
		WebDriver driver=new FirefoxDriver(myprofile);
		 driver.get("https://www.redbus.in/");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath(".//div[@class='icon-down icon ich dib']")).click();
	        driver.findElement(By.id("signInLink")).click();    
	        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        String str=driver.switchTo().frame(0).getPageSource();
	        System.out.println(str);
	       // driver.findElement(By.xpath("//span[@class='FR red-link signin-link']"));
	        //WebDriverWait wait = new WebDriverWait(driver, 30);
	        //wait.until(ExpectedConditions.elementToBeClickable(By.linkText("sign in")));
	        WebElement Element =driver.findElement(By.xpath("//span[contains(@class,'FR red-link signin-link']"));
	        System.out.println(Element.getAttribute("innerHTML"));
	        //driver.findElement(By.linkText("sign in")).click();
	       // WebDriverWait wait = new WebDriverWait(driver, 2);
	       // Alert alert = wait.until(ExpectedConditions.alertIsPresent()) ;
	        //alert.accept();   
	        //driver.findElement(By.linkText("sign in"));
	        /*if (driver instanceof JavascriptExecutor) {
	            ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'",Element);
	        }*/
	        //driver.findElement(By.linkText(".//*[@id='signInView']/div[2]/div/div[3]/div[8]/span[2]/a")).click();
	}
}
