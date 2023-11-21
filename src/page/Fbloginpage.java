package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
	
	
	//@FindBy(id="email")//pagefactory...........
	//WebElement fbemail;
	
	//@FindBy(id="pass")
	//WebElement fbpass;
	
	//@FindBy(name="login")
	//WebElement logibutton
	
	
	
	
	By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	
	public Fbloginpage(WebDriver driver)///constructors...same as class name and no return type
	{
		this.driver=driver;
		//PageFactory.initElements(driver,this);
	}
	
	public void setvalues(String email,String password)
	{
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).sendKeys(password);
		//fbemail.sendkeys(email);
		//fbpass.sendkeys(password);
		
	}
	
	public void login()
	{
		driver.findElement(fblogin).click();
		//loginbutton.click();
	}

}
