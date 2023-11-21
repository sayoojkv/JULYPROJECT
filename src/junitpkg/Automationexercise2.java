package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationexercise2 {
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
			driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")).click();
			driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a")).click();
			driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
			driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"));
			driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("sayooj");
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sayoojkrishnajr100@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"button-review\"]")).click();
			
			
		}
		
		
		
		
			


}
