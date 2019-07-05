package elementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClassNameLocator {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        //enter the text selenium into the searchbox...
        driver.findElement(By.className("gLFyf")).sendKeys("selenium");
	}

}
