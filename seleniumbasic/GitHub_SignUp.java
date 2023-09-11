package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub_SignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Eclipse-Workspace\\SeleinumDomain\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		driver.findElement(By.linkText("Create an account")).click();
		Thread.sleep(20000);
		driver.findElement(By.name("user[email]")).sendKeys("21ecb23@karpagamtech.ac.in"); 
		Thread.sleep(2000);
		driver.findElement(By.className("js-continue-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("S.Sakthivel2003");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/main/div[2]/text-suggester/div[1]/form/div[2]/div[2]/button")).click();
	//	driver.findElement(By.linkText("Continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("user[login]")).sendKeys("avhjvusvmfv");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"username-container\"]/div[2]/button")).click();
	//	driver.findElement(By.linkText("Continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("opt_in")).sendKeys("y");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"opt-in-container\"]/div[2]/button")).click();
	//	driver.findElement(By.linkText("Continue")).click();
	}

}
