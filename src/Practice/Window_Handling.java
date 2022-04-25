package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

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
		
		//To open new window by clicking the button
		driver.findElement(By.id("windowButton")).click();
		
		Thread.sleep(1000);
		//Get handle of the windows
		String MainWindow=driver.getWindowHandle(); 
		Set<String> allWindow= driver.getWindowHandles();
		Iterator<String> iterator = allWindow.iterator();
			
		//Here we will check if child window has and will fetch the heading
     	while(iterator.hasNext())
		{
     		String childWindow=iterator.next();
     		if(!MainWindow.equalsIgnoreCase(childWindow))
     		{
     			driver.switchTo().window(childWindow);
     			WebElement text=driver.findElement(By.id("sampleHeading"));
     			System.out.println(text.getText());
     			driver.close();
     		}
     		
     		//Switch back to the main window is the parent window
     		driver.switchTo().window(MainWindow);
     		
		}
		
		
		
		
		
				
			
		



	}

}
