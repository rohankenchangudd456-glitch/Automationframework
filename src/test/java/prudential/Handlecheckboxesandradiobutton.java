package prudential;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlecheckboxesandradiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		WebElement alet = driver.findElement(By.xpath("//button[@id='alertBtn']"));
		alet.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

		WebElement alt = driver.findElement(By.xpath("//button[@id='confirmBtn']"));
		alt.click();

		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
		
		WebElement alt1=driver.findElement(By.xpath("//button[@id='promptBtn']"));
		alt1.click();
		Thread.sleep(5000);
		
		alt1.clear();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("Rohan");
		alert1.accept();
		
		
//String at=driver.switchTo().alert().accept();

	}

}
