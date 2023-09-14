package Day2;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void login() {
		
		System.out.println("Login............");
		Assert.assertTrue(false);
	}
	@Test(priority=1, dependsOnMethods= {"login"})
	public void search() {
		System.out.println("Search............");
	}
	@Test(priority=2, dependsOnMethods= {"login", "search"})
	public void advanceSearch() {
		System.out.println("Advance Search............");
	
	}
	@Test(dependsOnMethods= {"login"})
	public void logout() {
		System.out.println("Logout............");
	}
}
