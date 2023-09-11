package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub_Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Eclipse-Workspace\\SeleinumDomain\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("cxbdxgnf");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("LVEiELth4@NbbbS");
		Thread.sleep(2000);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(8000);
		By imgSelector = By.cssSelector("img[alt=''][class='avatar circle']");
		WebElement imgElement = driver.findElement(imgSelector);
		imgElement.click();
		// You can perform actions on the imgElement as needed
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Your profile")).click();
		Thread.sleep(2000);
		WebElement imgElement1 = driver.findElement(imgSelector);
		imgElement1.click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[1]/div[2]/div[3]/deferred-side-panel/user-drawer-side-panel/div/modal-dialog/div[2]/nav/nav-list/ul/li[23]/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[1]/div[6]/main/div/form/input[2]")).click();
		// Call the main method of GitHub_SignUp
        GitHub_SignUp.main(new String[]{});
	}
}