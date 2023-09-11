package seleniumbasic;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
	WebDriver driver;    //public variable
	
	public void launchbrowser() {
		System.setProperty("webdriver.chromedriver","C:\\Eclipse-Workspace\\SeleinumDomain\\chromedriver-win64\\chromedriver.exe");
	     driver = new ChromeDriver();     // it is used to open the browser
	    driver.get("https://www.ebay.com/");       //it used to load website
	  //  driver.quit();                             // it will close the web browser once it open
		
	}
	public void searchProduct() throws InterruptedException
	{
		//Thread.sleep(2000);   // This line is to 1st to open a browser and it will take some time to load next
	//  driver.findElement(By.id("gh-ac")).sendKeys("iphone 14 pro"+Keys.ENTER);  //For findelement using id as in inspect page for searchbar, and sendkeys to type in search bar  
	//	driver.findElement(By.id("gh-btn")).click();  // For the searchbar has search button so to Byid as search buttonid no.s and say to click
    	driver.findElement(By.name("_nkw")).sendKeys("iphone 14 pro"+Keys.ENTER);
	//	Thread.sleep(2000);
	   // ((WebElement) driver.findElements(By.linkText("Daily Deals"))).click(); //After search click as any option, as inspect->in <a> tag name and say click  	
	}
	public void navigate() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.navigate().to("https://myshopprime.com/dheebin/eS4wnaU");   //it will go a next new link we given and it will open the page
		Thread.sleep(2000);
	    
		   WebElement tt = driver.findElement(By.className("bg-white flex-grow h-full border border-solid border-gray-300 rounded mr-1 text-xs px-2 flex flex-row items-center justify-start text-gray-500 visited:text-gray-500"));
	       tt.sendKeys("Laptop"+Keys.ENTER);
		    tt.clear();
		    tt.sendKeys("iphone 14 pro");
		//driver.navigate().back();  // it will come back to its original page
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public void closeBrower()
	{
		driver.quit();    //t0 close the browser
	}
	public void getMethods()
	{
		String url = driver.getCurrentUrl();
		//String PageSource = driver.getPageSource();
		String windowHandle = driver.getWindowHandle();
		Set window = driver.getWindowHandles();
		String title = driver.getTitle();
		System.out.println("url is "+url);
	//	System.out.println("PageSource"+PageSource);
		System.out.println("Window HAndle is "+windowHandle);   //unic id
		System.out.println("window  is "+window);  
		System.out.println("Title is "+title);
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    HelloWorld obj = new HelloWorld();
	    obj.launchbrowser();
	    obj.searchProduct();
	    obj.navigate();
	   
	    obj.getMethods();
	    obj.closeBrower();
	    //d.manage().window().maximize();
	    //Dimension dim = new Dimension(300,600);
	    //d.manage().window().setSize(dim);
	  //WebElement ele = d.findElement(ByClassName("yt-spec-touch-feedback-shape__fill\"));
	 //   d.getCurrentUrl();
	   // 
	   // =====================================================================================================
       
	    
	    
	}

}
