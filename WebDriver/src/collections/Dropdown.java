package collections;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		List<WebElement> al = driver.findElements(By.name("country"));

		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			WebElement w = (WebElement)itr.next();
			System.out.println(w.getText());
		}
		
		driver.close();
	}

}
