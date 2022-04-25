package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Properties {
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
			
		System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");	
		Thread.sleep(1000);
		//Here driver object is create to use chrome class 
		WebDriver driver = new ChromeDriver(); //launch the chrome/invoke the chrome browser
		driver.get("https://demoqa.com/dynamic-properties");  //open the URL on chrome browser
		driver.manage().window().maximize();
		driver.findElement(By.id("enableAfter")).click();
		driver.findElement(By.id("colorChange")).click();
		//If its not working then put implict wait here
				driver.findElement(By.id("visibleAfter")).click();	
		
		 
	}
}
