package testNGassignment;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Banking {
  

	    @AfterTest
	    public void cash()
	    {
		    System.out.println("cash");
	    }
	    @Test(enabled=false)
		public void Clerk()
		{
			System.out.println("Clerk");
		}
		@BeforeSuite
		public void money()
		{
			System.out.println("money");
		}
		@AfterSuite
		public void Credit()
		{
			System.out.println("Credit");
		}	
		@AfterTest
		public void Debit()
		{
			System.out.println("Debit");
		}
		
		@BeforeTest
		public void Cashier()
		{
			System.out.println("Cashier");
		}

}
