package ParllelExecution;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGprac {
	@Test
	public void A2() {
		
		System.out.println("A2");
	}
	
	@Test
	public void A1() {
		System.out.println("A1");
	}

	@Test(priority=0)
	public void priority1() {
		System.out.println("priority1");
	}
	

	
	@Test(priority=0)
	public void priority0() {
		System.out.println("priority1");
	}
	
	/*
	 * @BeforeTest public void ttes() {
	 * 
	 * System.out.println("BeforeTest"); }
	 * 
	 * @BeforeMethod public void rfr() {
	 * 
	 * System.out.println("BeforeMethod"); }
	 */

}
