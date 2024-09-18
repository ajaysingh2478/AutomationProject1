
package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassName {

	
public static void main(String[] args) {
		
		
		// to launch the browser
				WebDriver driver = new ChromeDriver();
				
				// to maximize the window
				driver.manage().window().maximize();
				
				//to launch the application
				driver.get("https://www.google.com/");
				WebElement searchGoogle = driver.findElement(By.className("gLFyf"));
				searchGoogle.sendKeys("phoebe Buffay",Keys.ENTER);
				WebElement searchGoogle1 = driver.findElement(By.className("lNPNe"));
				searchGoogle.sendKeys(Keys.ENTER);
				
				
				

}
				
}
