package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithTagName {

	
	public static void main (String[] args) {
		
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window
		driver.manage().window().maximize();
		
		// to launch the application
				
		driver.get("https://demowebshop.tricentis.com/");
		// identify the search text field
		
		WebElement searchTextField = driver.findElement(By.tagName("input"));
		
		searchTextField.sendKeys("books");
	}
}
