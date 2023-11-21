package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
		ChromeDriver driver;
		
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("file:///C:/Users/sayoo/OneDrive/Desktop/sayooj.html");
		}
		
		@Test
		
		public void fill()
		{
			driver.findElement(By.xpath("//input[@type='button']")).click();
			Alert a=driver.switchTo().alert();
			String alerttext=a.getText();
			System.out.println(alerttext);
			a.accept();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sayooj");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kv");
			
			//driver.findElement(By.xpath("//input[@value='submit']")).click();
		}
		

	}


