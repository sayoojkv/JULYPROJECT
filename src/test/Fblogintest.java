package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbcreatepage;
import page.Fbloginpage;

public class Fblogintest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new  ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("ab@gmail.com","12bg");
		ob.login();
		//driver.navigate().back();
	    Fbcreatepage ob1=new Fbcreatepage(driver);
	}

}
