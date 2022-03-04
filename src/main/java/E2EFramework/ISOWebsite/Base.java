package E2EFramework.ISOWebsite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	public WebDriver driver;
	
	public WebDriver invokeBrowser() throws IOException{
		
		FileInputStream fis = new FileInputStream("E:\\Workspace\\ISOWebsite\\src\\main\\java\\E2EFramework\\ISOWebsite\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browser =  prop.getProperty("browserName");
		  
		
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
			//ChromeOptions option = new ChromeOptions();
			//option.
			driver = new ChromeDriver();
			
		}
		else {
			driver = null;
		}
		
		return driver;
		
		
}

}
