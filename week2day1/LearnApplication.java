package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnApplication {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.close();
		
	}

}
 