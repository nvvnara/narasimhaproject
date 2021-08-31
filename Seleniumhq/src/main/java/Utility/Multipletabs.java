package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multipletabs {
	WebDriver driver;
	@Test
	public void multitabs() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver(); 
		Thread.sleep(2000);
		driver.get("https://virginvoyages--qa.my.salesforce.com/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://www.firstmates.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(), ' Sign IN ')]")).click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys("narasimha");
	}

}
