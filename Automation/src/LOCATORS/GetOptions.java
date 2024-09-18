package LOCATORS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		// identify MULTISELECT DROPDOWN
		
				WebElement MultiSelectDropdown = driver.findElement(By.id("day"));
				WebElement MultiSelectDropdown2 = driver.findElement(By.id("month"));

				
				// Create object of select class
				Select s= new Select(MultiSelectDropdown);
				Select s2= new Select(MultiSelectDropdown2);
				
				List<WebElement> allOptions = s.getOptions();
				List<WebElement> allOptions2 = s2.getOptions();
				
				for(WebElement options : allOptions) 
				{
					System.out.println(options.getText());
				}
				
				for(WebElement options : allOptions2) 
				{
					System.out.println(options.getText());
				}
				
				
				
	}
				
				
				
				
		

}
