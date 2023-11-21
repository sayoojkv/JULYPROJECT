package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Assertion { //hard assertion
	
	ChromeDriver driver;
	
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		String exp="facebook";
		String actualtitle=driver.getTitle();
		if(exp.equals(actualtitle))//soft assertion
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		//Assert.assertEquals(actualtitle,exp);//hard assertion......donot execute after this if it fails it stops....if it correct it shows pass else in result of running class in failure trace its reason will be specified.
		System.out.println("hai");
		
	}


}
