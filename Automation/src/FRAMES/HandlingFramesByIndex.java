package FRAMES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;

public class HandlingFramesByIndex {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.dream11.com/");
			
			//way 1
			
			//driver.switchTo().frame(0);
			
			// way2
			//driver.switchTo().frame("send-sms-iframe");
			
			//driver.findElement(( By.id("regEmail"))).sendKeys("9315429247");
			
			//way3
			 WebElement frame=driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']"));
			 driver.switchTo().frame(frame);
				driver.findElement(( By.id("regEmail"))).sendKeys("9315429247");
	
	}

}
