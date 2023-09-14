package Day2Pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
	@Test
	public void xyz() {
		System.out.println("xyz");
	}
	
	@BeforeTest
	public void A123() {
		System.out.println("BeforeTest..............");
	}
	
	@AfterSuite
	public void B2534() {
		System.out.println("After Suite................");
	}

}
