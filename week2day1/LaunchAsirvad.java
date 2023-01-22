package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAsirvad {

	public static void main(String[] args) {
		
			ChromeDriver driver = new ChromeDriver();
		driver.get("https://apps.asirvad.com/hrms_app/Login.aspx");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("335309");
		driver.findElement(By.id("password")).sendKeys("Shanmu1234");
		driver.findElement(By.className("submit")).click();
		driver.findElement(By.className("Employee Profile  ")).click();
		driver.findElement(By.className("Employee Profile View ")).click();
		driver.findElement(By.id("txt_empid")).sendKeys("335309");
		driver.findElement(By.className("btn_search")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		 
	}

}
