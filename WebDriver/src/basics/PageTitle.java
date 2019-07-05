package basics;
import org.openqa.selenium.chrome.ChromeDriver;
public class PageTitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    /*    String expTitle = "Google";
          String actTitle = driver.getTitle();
        
        //compare the titles...
        
        if(actTitle.equals(expTitle)) {  */
        
        if(driver.getTitle().equals("Google")) {
        	System.out.println("TC passed!");
        }else {
        	System.out.println("TC failed!");
        }
        driver.close();
	}

}
