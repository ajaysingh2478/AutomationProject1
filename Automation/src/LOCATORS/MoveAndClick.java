package LOCATORS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveAndClick {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.get("https://www.myntra.com/men-tshirts");
				
				WebElement men= driver.findElement(By.xpath("Men"));
				
				Actions a= new Actions(driver);
				a.moveToElement(men).perform();
				
				
				// click on tshirts
				
				driver.findElement(By.linkText(null));
				
				
				
				
				
				
				
				
				
	
	}
}
