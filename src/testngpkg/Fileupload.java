package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	
ChromeDriver driver;
	
	
	
	@BeforeTest
	public void setup()
	{

		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	
	@Test
	public void upload()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\sayoo\\OneDrive\\Pictures\\Screenshot 2023-09-07 083455.png");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		WebElement txt=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		String s=txt.getText();
		if(s.equalsIgnoreCase("submitfile"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
	}

}
