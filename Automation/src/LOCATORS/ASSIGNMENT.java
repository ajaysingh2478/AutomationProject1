package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSIGNMENT {
	public static void main(String[] args) throws InterruptedException {
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com");
		
		WebElement oneWay=driver.findElement(By.xpath("//input[@class='oneway-trip-btn']"));
		Thread.sleep(2000);
		oneWay.click();
		
		// enter from
		WebElement origin=driver.findElement(By.xpath("//input[@placeholder='Select Departure City' and @name='flightSearchFrom']"));
		Thread.sleep(2000);
		origin.sendKeys("Delhi");
		
		//enter to 
		WebElement destination=driver.findElement(By.xpath("//input[@placeholder='Select Arrival City' and @name='flightSearchTo']"));
		Thread.sleep(2000);
		destination.sendKeys("Goa");
		
		//select DepartureDate
		WebElement date=driver.findElement(By.xpath("//input[@name='depart']"));
		Thread.sleep(2000);
		date.click();
		
		//select the Date
		driver.findElement(By.xpath("(//h3[text()='Roadster'])[3]/ancestor::div[@class='product-productMetaInfo']/descendant::span[text()='545']"));
		
		
		
		
		//input[@name='depart']
		//input[@placeholder='Select Arrival City' and @name='flightSearchTo']
		
	}

}
