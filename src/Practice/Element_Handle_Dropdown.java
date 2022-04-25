package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Handle_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");	
		//Here driver object is create to use chrome class 
		WebDriver driver = new ChromeDriver(); //launch the chrome/invoke the chrome browser
		driver.get("https://demoqa.com/");  //open the URL on chrome browser
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		driver.findElement(By.xpath("//*[@id='item-0']/span")).click();
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Chanchal");
		driver.findElement(By.id("userEmail")).sendKeys("Chanchal@yopmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Chetu");
		driver.findElement(By.id("permanentAddress")).sendKeys("Chetu H");
		driver.findElement(By.id("submit")).click();
		
		}

	}
	


