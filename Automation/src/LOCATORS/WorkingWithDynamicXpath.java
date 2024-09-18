package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDynamicXpath {
	
	public static void main(String[] args) throws InterruptedException {
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		WebElement search=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		search.sendKeys("Iphone15",Keys.ENTER);
		;
		
	}

}
