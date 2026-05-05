package prudential;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");
       WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
      System.out.println("Display status of logo is:"+ logo.isDisplayed());
      
      
 boolean     enabler =driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
 
System.out.println(enabler);
    }
}