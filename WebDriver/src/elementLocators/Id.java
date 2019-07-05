package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//enter the email into the email field...
		
		driver.findElement(By.id("email")).sendKeys("maheshtungala");

	}

}
