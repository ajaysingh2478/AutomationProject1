package LOCATORS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class ASSIGNMENT3 {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.shoppersstack.com");
		
		WebElement product=driver.findElement(By.xpath("//span[text()='Women Printed Viscose Rayon Straight K...']"));

		product.click();
		
		Thread.sleep(2000);
		
		WebElement checkDelivery=driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']"));

		checkDelivery.click();
		
		checkDelivery.sendKeys("110012");
		Thread.sleep(3000);
		
		WebElement checkDeliveryButton=driver.findElement(By.name("Check"));

		checkDeliveryButton.click();
		
		
		
		
		
		
		
	}
}
