package WebDriverMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithSwitchTo {

public static void main(String[] args) throws InterruptedException{
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	WebElement element = driver.switchTo().activeElement();
	Thread.sleep(2000);
	element.sendKeys("chole bhature", Keys.ENTER);
}
	
}
