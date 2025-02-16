package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingTillParticularActions {

public static void main(String[] args){
	
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.zomato.com");
	
	//explicit typecasting
	
	JavascriptExecutor j= (JavascriptExecutor) driver;
	
	WebElement privacy= driver.findElement(By.xpath("//p[text()='Privacy']"));
	
	j.executeScript("arguments[0].scrollIntoView(false)",privacy);
	
}
	
}
