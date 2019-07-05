package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        
        Thread.sleep(3000);
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        driver.findElement(By.linkText("Gmail")).click();
        
        Thread.sleep(3000);
        driver.navigate().back();
        
        Thread.sleep(3000);
        driver.navigate().forward();
        
        Thread.sleep(3000);
        driver.navigate().refresh();
        
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        
        Thread.sleep(3000);
        driver.close();
	}

}
