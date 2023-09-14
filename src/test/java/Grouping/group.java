package Grouping;

import org.testng.annotations.Test;

public class group {
	@Test(priority=1, groups= {"Regression"})
	public void signupemail() {
		System.out.println("Sign up using email..");
	}
	@Test(priority=2, groups= {"Regression", "Sanity"})
	public void signupfacebook() {
		System.out.println("Sign up using facebook..");
	}
	@Test(priority=3, groups= {"Sanity"})
	public void signuptwiter() {
		System.out.println("Sign up using twither..");
	}


}
