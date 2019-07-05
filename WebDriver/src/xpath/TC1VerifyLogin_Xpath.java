package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1VerifyLogin_Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
	    driver.get("http://apps.qaplanet.in/qahrm");
	    
	    //login ...
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qaplanet1");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lab1");
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    
	    //verify the pageTitle...
	    if(driver.getTitle().equals("OrangeHRM")) {
	    	System.out.println("TC passed!");
	    }else {
	    	System.out.println("TC failed!");
	    }
	    
	    //click the logout link...
	    driver.findElement(By.xpath("//ul[@id='option-menu']/li[3]/a")).click();
	    
	    //close the browser ..
	    driver.close();

	}

}
