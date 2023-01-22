package week2day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.collections.Lists;

public class LearnDropdown {
			public static void main(String[] args) throws InterruptedException {
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://www.leafground.com/select.xhtml");
				
				WebElement DropDown = driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[1]/div/div/select"));
				Select select = new Select(DropDown);
				select.selectByIndex(2);
				Thread.sleep(60);	
			
				select.selectByVisibleText("Cypress");
				
				List<WebElement> listofoptions = select.getOptions();
				int size = listofoptions.size();
				System.out.println("numberof elements"+size);
				driver.quit();
				
				
			}
}
