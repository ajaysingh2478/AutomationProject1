package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetTitle 
{
	public static void main(String[] args) throws InterruptedException
	{
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://omayo.blogspot.com/");
	///driver.get("https://www.flipkart.com");
	//String title= driver.getTitle();
    /// System.out.println(" Title is: "+ title);

	
	driver.findElement(By.linkText("Open a popup window")).click();
	
	// driver.close();
	Thread.sleep(2000);
	
	
	driver.quit();
	
	}
	

}
