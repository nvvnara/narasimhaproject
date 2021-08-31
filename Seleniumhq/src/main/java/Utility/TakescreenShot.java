package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakescreenShot {
	
	public static String getScreenshot(WebDriver driver) {
		
		TakesScreenshot shot = ((TakesScreenshot)driver);  
		File ScrFile = shot.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+"/Resources/"+System.currentTimeMillis()+".png";
		File destination = new File(path);
		
		//FileUtils.copyFile(ScrFile, new File(".\\Resources\\narasimha.jpg"));
		
			
			try {
				FileUtils.copyFile(ScrFile, destination);
			} catch (IOException e) {
				System.out.println("capture"+e.getMessage());
				e.printStackTrace();
			}
			return path;
		
		
	}

}
