package Day2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	@BeforeMethod
	public void login() {
		
		System.out.println("Login............");
	}
	@Test(priority=1)
	public void search() {
		System.out.println("Search............");
	}
	@Test(priority=2)
	public void advanceSearch() {
		System.out.println("Advance Search............");
	
	}
	@AfterMethod
	public void logout() {
		System.out.println("Logout............");
	}
}
