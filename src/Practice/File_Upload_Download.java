package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");	
		//Here driver object is create to use chrome class 
		WebDriver driver = new ChromeDriver(); //launch the chrome/invoke the chrome browser
		driver.get("https://demoqa.com/upload-download");  //open the URL on chrome browser
		driver.manage().window().maximize();
			    
		
		
		//To  upload the file// Firstly save the upload button locator on web Element
		WebElement upload =driver.findElement(By.id("uploadFile"));
		
		//To Enter the file path onto the file section input field
		upload.sendKeys("C:\\Users\\chanchalp\\Desktop\\PNG1.jpg");
		
		
		//To Download the file on web application
		driver.findElement(By.linkText("Download")).click();
		
		
			

	}

}
