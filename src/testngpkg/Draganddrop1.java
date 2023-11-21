package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop1 {
ChromeDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		WebElement src1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dest1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement src2=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement dest2=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src1, dest1);
		act.dragAndDrop(src2, dest2);
		act.perform();
	}
	

}
