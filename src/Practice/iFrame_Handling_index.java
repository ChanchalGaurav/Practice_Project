package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_Handling_index {

	public static void main(String[] args)throws InterruptedException  {
		//To handle the iFrame by index
		
		System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");	

		//Here driver object is create to use chrome class //invoke the browser///initialize Browser
		WebDriver driver = new ChromeDriver(); //launch the chrome/invoke the chrome browser
		driver.get("https://demoqa.com/");  //open the URL on chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Frames')]")).click();
		Thread.sleep(1000);
		//To switch/move first iFrame by using id of the frame
		driver.switchTo().frame("frame1");
		
		//To identify the heading in WebElement
		WebElement iframeWeb=driver.findElement(By.id("sampleHeading"));
		
		//To finding the text of the heading
		String iframeText=iframeWeb.getText();
		System.out.println(iframeText);
		driver.close();
		
		
	}

}
