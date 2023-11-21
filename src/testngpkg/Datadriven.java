package testngpkg;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	ChromeDriver driver;
	
	
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test() throws Exception
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\sayoo\\OneDrive\\Desktop\\Book1.xlsx");//file reading
		XSSFWorkbook wb=new XSSFWorkbook(ob);//xl workbook getting.from this we need to get sheet1
		XSSFSheet sh=wb.getSheet("sheet1");//sheet details
		int row=sh.getLastRowNum();//getting details for which the number of rows we edited
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password="+pswd);
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.name("pass")).sendKeys(pswd);
			driver.findElement(By.name("login")).click();//navigation commands are forward,refresh,driver.navigate.back,to
			
		}
		
		
		
		
	}

}
