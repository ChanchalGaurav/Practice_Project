package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabWindow_Handle {
	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");	

		//Here driver object is create to use chrome class 
		WebDriver driver = new ChromeDriver(); //launch the chrome/invoke the chrome browser
		driver.get("https://demoqa.com/");  //open the URL on chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]")).click();

		//to click on New Window button
		driver.findElement(By.id("tabButton")).click();
		
		//To handle the Child Window
	
		String MainWindow=driver.getWindowHandle();
		Set<String> allWindow= driver.getWindowHandles();
		Iterator<String> iterator= allWindow.iterator();
		
		//to make loop for handle the child Window
		
		while(iterator.hasNext())
		{
				String childWindow=iterator.next();	
				if(!MainWindow.equalsIgnoreCase(childWindow))
				{
					driver.switchTo().window(childWindow);
					WebElement text1=driver.findElement(By.id("sampleHeading"));
					System.out.println(text1.getText());
				driver.close();
				}
		driver.close();
		}
		
		
	}
}
