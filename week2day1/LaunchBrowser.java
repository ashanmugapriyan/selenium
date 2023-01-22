package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","");
		//WebDriverManager.chromedriver();
		
		
		ChromeDriver driver = new ChromeDriver();
		String driverpath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.out.println(driverpath);

	}

}
