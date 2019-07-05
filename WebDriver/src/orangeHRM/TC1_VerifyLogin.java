package orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC1_VerifyLogin {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();	
    driver.get("http://apps.qaplanet.in/qahrm");
    
    //login ...
    driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
    driver.findElement(By.name("txtPassword")).sendKeys("lab1");
    driver.findElement(By.name("Submit")).click();
    
    //verify the pageTitle...
    if(driver.getTitle().equals("OrangeHRM")) {
    	System.out.println("TC passed!");
    }else {
    	System.out.println("TC failed!");
    }
    
    //click the logout link...
    driver.findElement(By.linkText("Logout")).click();
    
    //close the browser ..
    driver.close();
	}

}
