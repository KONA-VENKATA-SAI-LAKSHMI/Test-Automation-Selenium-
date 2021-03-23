package testNGassignment;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Office {
	@Test(priority=2, dependsOnGroups="School")
	public void Desk()
	{
		System.out.println("Desk");
	}
	@BeforeTest
	public void Holidays()
	{
		System.out.println("Holidays");
	}
	@AfterClass
	public void table()
	{
		System.out.println("table");
	}
	@BeforeClass
	public void Manager()
	{
		System.out.println("Manager");
	}
	@AfterSuite
	public void Salaries()
	{
		System.out.println("Salaries");
	}
	@AfterSuite
	public void consultant()
	{
		System.out.println("Consultant");
	}
	@Test(enabled=false)
	public void Staff()
	{
		System.out.println("Staff");
	}
}
