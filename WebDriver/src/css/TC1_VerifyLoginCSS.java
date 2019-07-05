package css;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_VerifyLoginCSS {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
	    driver.get("http://apps.qaplanet.in/qahrm");
	    
	    //login ...
	    driver.findElement(By.cssSelector("input[type=text]")).sendKeys("qaplanet1");
	    driver.findElement(By.cssSelector("input[type=password]")).sendKeys("lab1");
	    driver.findElement(By.cssSelector("input[value=Login]")).click();
	    
	    //verify the pageTitle...
	    if(driver.getTitle().equals("OrangeHRM")) {
	    	System.out.println("TC passed!");
	    }else {
	    	System.out.println("TC failed!");
	    }
	    
	    //click the logout link...
	    driver.findElement(By.cssSelector("ul[id=option-menu]>li:nth-child(3)>a")).click();
	    
	    //close the browser ..
	    driver.close();

	}

}
