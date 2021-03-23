package testNGassignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class School {
	@BeforeTest
	public void Bell()
	{
		System.out.println("Bell");
	}
	@BeforeTest
		public void student()
	{
		System.out.println("student");
	}
	@Test(enabled=false)
	public void Teacher()
	{
		System.out.println("Teacher");
	}
	@Test(enabled=false)
	public void Class()
	{
		System.out.println("Class");
	}
	@BeforeSuite
	public void Fees()
	{
		System.out.println("Fees");
	}
	@Test(priority=1, groups="School")
	public void bulk()
	{
		System.out.println("Cashier");
	}
	@Test(priority=3, groups="School")
	public void books()
	{
		System.out.println("books");
	}
	@BeforeSuite
	public void Uniform()
	{
		System.out.println("Uniform");
	}

}
