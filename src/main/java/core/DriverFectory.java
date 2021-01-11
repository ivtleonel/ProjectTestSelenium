package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverFectory {
	protected static WebDriver driver;
	
	public DriverFectory(WebDriver driver) {
		this.driver = driver;
	}

	public static WebDriver getDriver() {
		
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
        driver.get("http://sampleapp.tricentis.com/101/app.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		return driver;
    }

	public static void killDriver() {
		if (driver !=null) {
			driver.quit();
			driver = null;
     }

	}
}