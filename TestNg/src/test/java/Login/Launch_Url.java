package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Url {

	 static WebDriver driver;
	 @Test
	    public void setup() 
	    {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(); 
	        driver.get(" https://www.equalsense.ai/altadmin/Dashboard");
	        driver.manage().window().maximize();
	        
	    }
	
	
}
