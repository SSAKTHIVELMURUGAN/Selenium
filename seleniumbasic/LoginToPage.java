package seleniumbasic;

import java.sql.Driver
;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class LoginToPage {
   
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Eclipse-Workspace\\SeleinumDomain\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://coe1.annauniv.edu/home/");
	//	Thread.sleep(10000);
		driver.findElement(By.id("register_no")).sendKeys("721221106084");
		Thread.sleep(4000);
		driver.findElement(By.name("dob")).sendKeys("23-05-2003");
		Thread.sleep(4000);
		 // Manually enter the CAPTCHA value from the website in the console
        System.out.print("Please enter the CAPTCHA value from the website: ");
        Scanner scanner = new Scanner(System.in);
        String captchaValue = scanner.nextLine();
        
        // Enter the CAPTCHA value into the input field
        WebElement captchaInput = driver.findElement(By.name("security_code_student")); // Replace with the actual name of the CAPTCHA input field
        captchaInput.sendKeys(captchaValue);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/div[4]/div/div[2]/form/div/div[4]/input")).click();
		
	}

}
