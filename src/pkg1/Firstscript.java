package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		//chromedriver for chrome
		//firefoxdriver for firefox
		//edgedriver for edge
		//get method- to launch application
		//get title - to get title of an application
		//getpagesource - to get source code of an application
		ChromeDriver driver=new ChromeDriver();//to launch chrome browser
		driver.get("https://google.com");//to launch application
        String actualtitle=driver.getTitle();
        String exp="google";
        
        if(actualtitle.equalsIgnoreCase(exp))
        {
        	System.out.println("pass");
        }
        else
        {
        	System.out.println("fail");
        }
	}
	
	}


