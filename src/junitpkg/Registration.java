package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	
	
	@Test
	public void register()
	{
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sayooj");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("olivo");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sayoojkv@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	}
	

}
