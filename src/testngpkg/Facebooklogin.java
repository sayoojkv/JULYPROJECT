package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooklogin {
	ChromeDriver driver;
	
	
	
	@BeforeTest
	public void setup()
	{

		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	//@BeforeMethod
	//public void urlloading()
	//{
		//use when multiple test comes otherwise do it in beforetest
	//}
	@Parameters({"email","password"})
	@Test
	public void signup(String email,String password)
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}

}
