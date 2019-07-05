package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tooltip {
public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//fetch the tooltip of the google searchbox...
		String tooltip1 = driver.findElement(By.name("q")).getAttribute("title");
		System.out.println("the tooltip of search box is ---->" +tooltip1);
	   
		//fetch the tooltip of the google apps link 
		String tooltip2 =  driver.findElement(By.className("gb_x")).getAttribute("title");
		System.out.println("the tooltip of google apps link is ---->" +tooltip2);
	}

}
