package POPUP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlertPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		
		//click on alert box
		
		driver.findElement(By.id("buttonAlert2")).click();
		
		Thread.sleep(5000);
		
		// we have to switch the control from main page to alert popup
		
		Alert a= driver.switchTo().alert();
		
		a.accept();   // if you want to click on ok
		
		
		
		
		
	}

}
