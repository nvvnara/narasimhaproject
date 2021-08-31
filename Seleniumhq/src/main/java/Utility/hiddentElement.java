package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hiddentElement {
	
     WebDriver driver;
     @Test
	public void hidden() throws InterruptedException{
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver(); 
		Thread.sleep(2000);
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("hide-textbox")).click();
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('displayed-text').value='narasimha'");

	}

}
