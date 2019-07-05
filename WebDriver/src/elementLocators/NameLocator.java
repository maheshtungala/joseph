package elementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//enter mail id into the email field
		driver.findElement(By.name("email")).sendKeys("maheshtungala");

	}

}
