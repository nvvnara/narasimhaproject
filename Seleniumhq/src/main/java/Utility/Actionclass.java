package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclass {
WebDriver driver;

@Test
	public void RightClick() throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver(); 
		Thread.sleep(2000);
		driver.get("https://courses.letskodeit.com/practice");
		Actions act = new Actions(driver);
		//WebElement elem = driver.findElement(By.id("hide-textbox"));
		WebElement elem = driver.findElement(By.xpath("//*[@id=\"open-tab-example-div\"]/fieldset/legend"));
		act.doubleClick(elem).perform();
		
		Thread.sleep(30000);
		
		

	}

}
