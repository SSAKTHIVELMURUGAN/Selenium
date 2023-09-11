package seleniumbasic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Practice_Selenium {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","C:\\Eclipse-Workspace\\SeleinumDomain\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();     
	    driver.get("https://en-gb.facebook.com/"); 
	    
	  WebElement  ele =   driver.findElement(By.id("email"));  //id is used to find the block to enter email id
	  ele.sendKeys("21ecb23@karpagamtech.ac.in");    // it will enter the mailid
	  // name locators to enter a password is using here
	  driver.findElement(By.name("pass")).sendKeys("S.Sakthivel2003");  
	  driver.findElement(By.name("login")).click();  
	//  driver.findElement(By.linkText("Terms")).click();
	//  Thread.sleep(2000);
	//  driver.navigate().back();  
	 driver.findElement(By.linkText("Sign Up")).click();
	//  driver.findElement(By.partialLinkText("Ad")).click();
//////////////////////////    xpath      //////////////////////
	  //xpath 2 type 
	  // 1. absolute ==> using attributes  //*[@id="u_0_b_Ir"]
	  // 2.Relative ==> based on position
	//bv  driver.findElement(By.xpath("//input*[@id='u_0_b_Ir']")).sendKeys("Sakthi");
	  
	}
}