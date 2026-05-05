package prudential;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("Hi");

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//Set<String> windows = driver.getWindowHandles();

		//System.out.println(windows);
		WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username.sendKeys("Admin");
		
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 
		 
		WebElement txtuser=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Login']")));
		 
		txtuser.click();
		 
		

		// driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		// driver.findElement(By.xpath("//div[@class='oxd-grid-4
		// orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")).sendKeys("Rohan");
		// System.out.println(driver.getPageSource());

		// String windowid=driver.getWindowHandle();

		// System.out.println(windowid);

	}

}
