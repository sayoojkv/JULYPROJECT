package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnggrouping {
	@BeforeTest
	public void setup()
	{
		System.out.println("browser open");
	}
	
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url details");
	}
	
	@Test(groups= {"smoke","sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups= {"smoke"})
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(groups= {"sanity"})
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(groups= {"smoke"})
	public void test4()
	{
		System.out.println("test4");
	}
	
	@AfterMethod
	public void aftrmthd()
	{
		System.out.println("aftrmthd");
	}
	
	@AfterTest
	public void browserclose()
	{
		System.out.println("browser close");
	}

}
