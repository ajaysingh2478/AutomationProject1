package POPUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFileUploadPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		Thread.sleep(2000);

		
		// if you are having type ="file" attribute then only your send keys method will work
		driver.findElement(By.id("fileInput")).sendKeys("E:\\Users\\admin\\Downloads\\DOC-20240712-WA0048..pdf");
		
	}

}
