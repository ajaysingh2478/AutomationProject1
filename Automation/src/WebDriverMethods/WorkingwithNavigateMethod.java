package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithNavigateMethod {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// open zomato application
		
		driver.get("https://www.zomato.com");
		Thread.sleep(2000);
		// Open Swiggy Application
		
		driver.get("https://www.swiggy.com");
		Thread.sleep(2000);
		
		// to go back
		driver.navigate().back();
		Thread.sleep(2000);
		// to go forward
		driver.navigate().forward();
		Thread.sleep(2000);
		// to refresh the browser
		driver.navigate().refresh();
	}

}
