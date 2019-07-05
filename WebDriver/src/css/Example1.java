package css;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("file:///D:/Mahesh/Downloads/cssform.html");
        
        //enter username,password and click on the login button
        driver.findElement(By.cssSelector("input.required")).sendKeys("mahesh");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[class=passfield]")).sendKeys("mahesh");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input:nth-child(3)")).click();
        
        
	}

}
