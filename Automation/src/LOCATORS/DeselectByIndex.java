package LOCATORS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		
		
		// identify multiselect dropdown
		
		WebElement MultiSelectDropdown = driver.findElement(By.id("select-multiple-native"));
		
		// Create object of select class
		Select s= new Select(MultiSelectDropdown);
		
		for(int i=0;i<5;i++)
		{
			s.selectByIndex(i);
			Thread.sleep(2000);
			
		}
		Thread.sleep(2000);
		s.deselectByIndex(1);
		
		s.deselectByValue("United Kingdom");
		
		s.deselectByVisibleText("United Arab Emirates");
		
		s.deselectAll();
		
	
	}
	}
