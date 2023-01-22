package week2day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid="
				+ "node0xbirka6lzk2ifwfsgys0c52649125.node0");
		WebElement alertbox = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']/"
				+ "span[2]"));
		alertbox.click();
	
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
		confirmbox.click();
		
		Alert confirmalert = driver.switchTo().alert();
		Thread.sleep(600);
		confirmalert.dismiss();
		
		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt104\']/span[2]"));
		promptbox.click();
		
		Alert promptalertbox = driver.switchTo().alert();
		promptalertbox.sendKeys("hai");
		promptalertbox.accept();
		
		
		
		
	}

}
