package Practice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");	

		//Here driver object is create to use chrome class 
		WebDriver driver = new ChromeDriver(); //launch the chrome/invoke the chrome browser
		driver.get("https://demoqa.com/");  //open the URL on chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		driver.findElement(By.xpath("//*[@id='item-4']")).click();
		
		//To double click on button/element.
		Actions act= new Actions(driver);
		WebElement ele= driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(ele).build().perform();
		
		//To Right click on button/element
		
		WebElement el= driver.findElement(By.id("rightClickBtn"));
		act.moveToElement(el).contextClick().build().perform();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Single click on button/element
		driver.findElement(By.xpath("//*[text()='Click Me']")).click();
		
		
		
		
		
		
		
		

	}

}
