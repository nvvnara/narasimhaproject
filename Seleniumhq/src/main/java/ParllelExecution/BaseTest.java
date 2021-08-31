package ParllelExecution;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Utility.TakescreenShot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	WebDriver driver;

	@BeforeMethod
	public void ExtentReports() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter(new File(".\\Resources\\narasimha"));
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Industries");
		spark.config().setReportName("Industries");
		extent.attachReporter(spark);

	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {

			String temp = TakescreenShot.getScreenshot(driver);
			test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
		}

		extent.flush();
	}

	@BeforeClass
	@Parameters("browser")
	public void LaunchTheApp(String browserName) {

		/*
		 * WebDriverManager.chromedriver().browserVersion(null).setup(); driver = new
		 * ChromeDriver(); driver.get("https://virginvoyages--qa.my.salesforce.com/");
		 */

		/*
		 * if (browserName.equalsIgnoreCase("firefox")) {
		 * 
		 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver();
		 * 
		 * } else
		 */if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} /*
			 * else if (browserName.equalsIgnoreCase("IE")) { WebDriverManager.iedriver();
			 * driver = new InternetExplorerDriver(); }
			 */
		
		driver.manage().window().maximize();
		driver.get("https://virginvoyages--qa.my.salesforce.com/");
		
	}

	/*
	 * 
	 * @AfterMethod public void QuitTheaBrowser() throws IOException {
	 * 
	 * TakesScreenshot shot = ((TakesScreenshot)driver); File ScrFile =
	 * shot.getScreenshotAs(OutputType.FILE);
	 * 
	 * FileUtils.copyFile(ScrFile, new File(".\\Resources\\narasimha.jpg")); }
	 */

}
