package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_Handling_nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");	
		//Here driver object is create to use chrome class //invoke the browser///initialize Browser
				WebDriver driver = new ChromeDriver(); //launch the chrome/invoke the chrome browser
				driver.get("https://demoqa.com/");  //open the URL on chrome browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]")).click();
				driver.findElement(By.xpath("//span[contains(text(),'Nested Frames')]")).click();
				
			driver.switchTo().frame("frame1");	
			WebElement parentiFrame=driver.findElement(By.tagName("body"));
			String parent=parentiFrame.getText();
			System.out.println(parent);
			
			driver.switchTo().frame(0);
			 WebElement frame1Element= driver.findElement(By.tagName("body"));
			 String childFrame=frame1Element.getText();
		        
		        //Try to Print the text present inside parent frame
		        System.out.println("Frame1 is :"+childFrame);
	}

}
