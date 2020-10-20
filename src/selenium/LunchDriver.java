package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LunchDriver {
	
	
	public static WebDriver driver ;

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.gecko.driver", "E:\\SeleniumTeaching\\Softwares\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		
		//driver = new FirefoxDriver();
		
		
	    System.setProperty("webdriver.chrome.driver", "E:\\SeleniumTeaching\\Softwares\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
	}

}
