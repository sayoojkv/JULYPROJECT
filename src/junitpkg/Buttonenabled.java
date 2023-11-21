package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonenabled {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test1()
	{
		boolean a=driver.findElement(By.xpath("//*[@id=\"Register\"]")).isEnabled();
		
		if(a)
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("disabled");
		}
	}

}
