package elementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        //click the gmail link...
       // driver.findElement(By.linkText("Gmail")).click();
        
        //use partialLinkText...
       driver.findElement(By.partialLinkText("ma")).click();
	}

}
