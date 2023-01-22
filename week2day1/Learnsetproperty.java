package week2day1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Learnsetproperty {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Windows\\System32\\MicrosoftWebDriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.google.com/");
		
		
	}

}
