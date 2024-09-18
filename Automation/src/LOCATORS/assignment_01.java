package LOCATORS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class assignment_01 {
	
public static void main(String[] args) throws InterruptedException, IOException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com");
		Thread.sleep(3000);
		
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']"));
		search.click();
		
		Thread.sleep(2000);
		
		search.sendKeys("Biryani");
		
		Thread.sleep(2000);
		
		WebElement searchButton = driver.findElement(By.xpath("//img[@src='https://b.zmtcdn.com/data/dish_images/d19a31d42d5913ff129cafd7cec772f81639737697.png']"));
		searchButton.click();
		
		//explicit type casting
		
		TakesScreenshot t= (TakesScreenshot)driver;
		
		// use getScreenshotAs()method
		
	File src= t.getScreenshotAs(OutputType.FILE);
		
		//create a new file
		
	File dest= new File("./screenshots/Zomato.png");
		
		//copy the screenshot from src to dest
		
		Files.copy(src, dest);
		
		
		
	}

}
