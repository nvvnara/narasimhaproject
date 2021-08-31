package ParllelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovidertest {
	WebDriver driver;
	@DataProvider(name="LoggerData")
	public Object[][] getdData(){
		
		Object[][] data= {{"nara1@yopmail.com","Test1"},{"nara2@yopmail.com","Test2"},{"nara3@yopmail.com","Test3"}};
		return data;
		
	}
	@Test(dataProvider="LoggerData")
	public void vvlog(String name, String pwd) {
		System.out.println(name+" "+pwd);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://virginvoyages--qa.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
}
