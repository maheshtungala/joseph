package alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertExample {
public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("http://apps.qaplanet.in/qahrm");
		
		d.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		d.findElement(By.name("Submit")).click();
		
		Alert al = d.switchTo().alert();
		
		String message = al.getText();
		System.out.println("The message on the alert is ---> " +message);
		
		Thread.sleep(3000);
		al.accept();
		
		System.out.println(d.getCurrentUrl());
		
		Thread.sleep(3000);
	    d.close();

	}

}
