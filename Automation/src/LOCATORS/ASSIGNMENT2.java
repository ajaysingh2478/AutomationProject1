package LOCATORS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ASSIGNMENT2 {
	
	public static void main(String[] args) throws InterruptedException {
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com");
		
		WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
//		Thread.sleep(2000);
		search.click();
		
		WebElement search1=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
//		Thread.sleep(2000);
		search1.sendKeys("iphone",Keys.ENTER);
		

		List<WebElement> iphoneList=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
//		Thread.sleep(2000);
		for(int i=0;i<iphoneList.size();i++)
		{
			System.out.println(iphoneList.get(i).getText());
			System.out.println("-----------------------------------------------------");
		}
		
		
		//div[@class='KzDlHZ']
		//button[@class='_2iLD__']
		
		
		
		
	}

}
