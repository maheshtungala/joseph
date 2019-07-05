package collections;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Mahesh/Downloads/cssform.html");
        
		List<WebElement> li = driver.findElements(By.tagName("input"));
		
		Iterator it = li.iterator();
		while(it.hasNext()) {
			WebElement w = (WebElement) it.next();
			w.sendKeys("mahesh");
		}
		
	}

}
