package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Facebook_Account_creation 
{
	public static void main(String[] args)
{

	// to launch the browser
	WebDriver driver = new ChromeDriver();
	
	// to maximize the window
	driver.manage().window().maximize();
	
	//to launch the application
	driver.get("https://www.facebook.com/");
	
	// identify create new account button by using name locator
	
	WebElement CreatenewAccountButton= driver.findElement(By.className("_6lti"));
	CreatenewAccountButton.click();
}
}

	
