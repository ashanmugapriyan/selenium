package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/button.xhtml");
		
		WebElement getpositionbutton = driver.findElement(By.id("j_idt88:j_idt98"));
		Point xypoint = getpositionbutton.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();
		System.out.println("The Value of X is"+ xvalue 
				+ "The value of Y is" + yvalue);
		
		WebElement colorbutton = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		String color = colorbutton.getCssValue("background");
		System.out.println("The color is "+ color);
		
		WebElement sizebutton = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = sizebutton.getSize().getHeight();
		int width = sizebutton.getSize().getWidth();
		System.out.println("The height is"+ height + "The width is" + width);
		
		driver.close();
		
	}

}
