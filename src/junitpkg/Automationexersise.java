package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationexersise {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.name("name")).sendKeys("sayu");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sayu@gmail.com");
		driver.findElement(By.xpath("//button")).click();
	}

}
