package elementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TagName {
public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        int linkCount = driver.findElements(By.tagName("a")).size();
        System.out.println("The number of links in the google home"
        		                               + " page is "+ linkCount);
	    driver.close();
   }

}
