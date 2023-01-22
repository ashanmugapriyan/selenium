package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnToLocateElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shanmuga");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		
		WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd = new Select(Industry);
		dd.selectByValue("IND_FINANCE");
		
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		//driver.close();

	}

}
