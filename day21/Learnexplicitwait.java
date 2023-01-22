package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnexplicitwait {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/waits.xhtml;jsessionid=node01m1hma7htk6ggkwvx63fr63pw59066.node0");
	
	
		//driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt95\']/span")).click();
		//driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt96\']/span")).click();
		
		
		
	}

}
