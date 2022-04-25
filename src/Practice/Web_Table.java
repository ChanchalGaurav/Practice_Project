package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch the chrome/invoke the chrome browser
		driver.get("https://demoqa.com/");  //open the URL on chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		driver.findElement(By.xpath("//*[@id='item-3']/span")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys("Chanchal");
		driver.findElement(By.id("lastName")).sendKeys("Singh");
		driver.findElement(By.id("userEmail")).sendKeys("Singh@yopmail.com");
		driver.findElement(By.id("age")).sendKeys("27");
		driver.findElement(By.id("salary")).sendKeys("20000");
		driver.findElement(By.id("department")).sendKeys("IT");
		driver.findElement(By.id("submit")).click();
		
		//To edit the form
		driver.findElement(By.id("edit-record-4")).click();
		driver.findElement(By.id("department")).clear();
		driver.findElement(By.id("department")).sendKeys("Software Engineer");
		driver.findElement(By.id("submit")).click();
		
		//To delete the form
		driver.findElement(By.id("delete-record-4")).click();

	}
}
