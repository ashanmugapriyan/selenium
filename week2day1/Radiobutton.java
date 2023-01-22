package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		
		WebElement option20 = driver.findElement(By.xpath("//*[@id=\'j_idt87:console2\']/tbody/tr/td[3]/div/div[2]"));
		WebElement option40 = driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[2]/label"));
		
		
		boolean option1 = option20.isSelected();
		boolean option2 = option40.isSelected();
	
		System.out.println(option1);
		System.out.println(option2);
		
		
		WebElement Browseroption = driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[4]/div/div[2]/span"));
		Browseroption.click();
	
	
	}

}
