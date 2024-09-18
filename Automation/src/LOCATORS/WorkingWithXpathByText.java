package LOCATORS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByText {
	
	public static void main(String[] args) throws InterruptedException {
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		driver.manage().window().maximize();
		
		//to launch the application
		driver.get("https://www.facebook.com");
		WebElement loginButton= driver.findElement(By.xpath("//a[text()='Create new account']"));
		loginButton.click();
//		Thread.sleep(2000);
		WebElement GenderButton= driver.findElement(By.xpath("//label[text()='Male']"));
		GenderButton.click();
		
		
	}
}
