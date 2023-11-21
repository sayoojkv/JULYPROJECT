
package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
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
	
	@Test(priority=2,enabled=false)
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority=1)
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(priority=3,dependsOnMethods= {"test2"})
	public void test3()
	{
		System.out.println("test3");
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
