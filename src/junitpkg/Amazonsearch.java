package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonsearch {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
	}
	
	@Test
	public void search()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("perfumes",Keys.ENTER);
	}

}
