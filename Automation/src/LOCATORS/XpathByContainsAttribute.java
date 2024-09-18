package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsAttribute {
	public static void main(String[] args) throws InterruptedException {
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window
		driver.manage().window().maximize();
		
		//to launch the application
		driver.get("https://www.facebook.com");
		WebElement loginButton= driver.findElement(By.xpath("//a[contains(@class,'_4jy0 _6lti')]"));
		loginButton.click();
		//Thread.sleep(2000);
		//WebElement GenderButton= driver.findElement(By.xpath("//label[text()='Male']"));
		//GenderButton.click();
	
}}
