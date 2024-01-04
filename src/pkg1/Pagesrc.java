package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrc {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("sayoojkrishnajr100@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("sayoojkv@2002");
		
		

	}

}
