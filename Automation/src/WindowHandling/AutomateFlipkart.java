package WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomateFlipkart {

public static void main(String[] args) {
		
		
		// to launch the browser
				WebDriver driver = new ChromeDriver();
				
				// to maximize the window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://www.flipkart.com/");
				
				//search iphone
				driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
				
				//click on first iphone
				driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Blue, 128 GB)']"));
				
				
				//String parentId = driver.getWindowHandle();
				// System.out.println("Parent id:"+parentId);
				
				Set<String> allId= driver.getWindowHandles();
				
				
				for(String id:allId)
				{
					driver.switchTo().window(id);
					if(driver.getTitle().equals("iPhone 14 Plus-Big Super Retina XDR display, All Day Battery"))
					{
						break;
						
					}
				}
				// click add to cart button
				driver.findElement(By.xpath("//button [@class='QqFHMw vslbG+ In9uk2']")).click();
				
				
				
}
				
}
