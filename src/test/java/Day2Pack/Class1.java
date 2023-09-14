package Day2Pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@Test
	public void abc() {
		System.out.println("abc");
	}
	

	@AfterTest
	public void A123() {
		System.out.println("AfterTest..............");
	}
	@BeforeSuite
	public void B234() {
		System.out.println("Before Suite................");
	}
}
