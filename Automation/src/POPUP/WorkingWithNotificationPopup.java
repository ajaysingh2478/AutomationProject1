package POPUP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class WorkingWithNotificationPopup {
	public static void main(String[] args) {
		
		
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
		
		
	}

}
