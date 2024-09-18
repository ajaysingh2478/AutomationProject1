package POPUP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithConfirmationPopup {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		// click on confirmation box
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(5000);
	   // we have to switch the control from main page to alert popup
		Alert a= driver.switchTo().alert();
		  System.out.println(a.getText());
	      a.sendKeys("yes");
		  a.accept();   // if you want to click on ok
       // a.dismiss();   // if you want to cancel
}

		

}
