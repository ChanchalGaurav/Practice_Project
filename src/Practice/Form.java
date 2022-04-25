package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		String date="August 2022";
		System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");	

		//Here driver object is create to use chrome class 
		WebDriver driver = new ChromeDriver(); //launch the chrome/invoke the chrome browser
		driver.get("https://demoqa.com/");  //open the URL on chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//To open the Form page
		driver.findElement(By.xpath(" //body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[2]")).click();
		
		//To open the practice Form
		driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]")).click();
		
		//To fill the details in "Student REgictration Form"
		
		driver.findElement(By.id("firstName")).sendKeys("Chanchal"); 
		driver.findElement(By.id("lastName")).sendKeys("Singh");
		driver.findElement(By.id("userEmail")).sendKeys("Chanchal@yopmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("563654653465");
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		//To select calendar date by change the month 
		Thread.sleep(2000);
		/*while (true)
		{
			String text=driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText(); 
			System.out.println(text);
			if(text.equals(date))
			{
				break;
				
			}
			else
			{
				driver.findElement(By.xpath("//button[contains(text(),'Next Month')]")).click();
			}
		}
		
		driver.findElement(By.xpath("//div[contains(text(),'17')]")).click();  */
		
		
		//to select calendar date by using dropdown
		Select dropdown=new Select(driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
	    dropdown.selectByIndex(9);
	    driver.findElement(By.xpath("//div[contains(text(),'17')]")).click();
		
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Sport')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Music')]")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\chanchalp\\Desktop\\Monday Dashboard.xlsx");  
		driver.findElement(By.id("currentAddress")).sendKeys("Chetu");
		driver.findElement(By.xpath("//div[contains(text(),'Select State')]")).click();
		Thread.sleep(500);
		
		//To scroll down on a web page in Selenium by defining the number of pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		
		driver.findElement(By.xpath("//div[contains(text(),'Uttar Pradesh')]")).click();
		driver.findElement(By.xpath(" //div[contains(text(),'Select City')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(text(),'Merrut')]")).click();
				
		
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		driver.findElement(By.id("closeLargeModal")).click();
		
		
		
	}

}
