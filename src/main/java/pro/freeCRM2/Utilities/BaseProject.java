package pro.freeCRM2.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseProject {
	public static Properties prop;
	public static WebDriver driver;
	
	
	
	
	public BaseProject() {
		
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\ahsan\\eclipse-workspace\\pro.freeCRM2\\src\\main\\java\\pro\\freeCRM2\\Confiq\\file.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
			
		}
		
	}
	
	public static void initialize() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahsan\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		} else if(browserName.equals("firefox")) {
			System.setProperty("driver.chrome.driver", "C:\\Users\\ahsan\\Documents\\Drivers\\geckodriver-v0.20.1-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}

}
