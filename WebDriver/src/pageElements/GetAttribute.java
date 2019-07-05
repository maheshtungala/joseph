package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String label = driver.findElement(By.name("btnK")).getAttribute("value");
        System.out.println("The label on the Google Search button is " + label);
        driver.close();

	}

}
