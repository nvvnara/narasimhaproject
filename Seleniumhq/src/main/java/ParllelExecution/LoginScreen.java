package ParllelExecution;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginScreen extends BaseTest {

	@Test
	public void OpenSalesForceApplication() {
		
		String title=driver.getTitle();
		
		System.out.println(title);
		Assert.assertTrue(driver.getTitle().contains("Login | Salesforce"));
	}

}
