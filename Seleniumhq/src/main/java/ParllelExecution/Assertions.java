package ParllelExecution;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	@Test
	public void softAssertion() {
		

		 System.out.println("softAssert Method Was Started");
		 Assert.assertTrue(false);
		 System.out.println("softAssert Method Was Executed");
		 
	}

}
