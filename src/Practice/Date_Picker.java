package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_Picker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");	
		//Here driver object is create to use chrome class //invoke the browser///initialize Browser
				WebDriver driver = new ChromeDriver(); //launch the chrome/invoke the chrome browser
				driver.get("https://demoqa.com/");  //open the URL on chrome browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[4]/div/div[3]/h5")).click();
				driver.findElement(By.xpath("//span[contains(text(),'Date Picker')]")).click();
				driver.findElement(By.id("datePickerMonthYearInput")).click();
				// select date by using  drop down
				Select dropdown= new Select(driver.findElement(By.xpath("//*[@id='datePickerMonthYear']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
				dropdown.selectByIndex(6);
				driver.findElement(By.xpath("//*[text()='16']")).click();
				
				
				
				
	}

}
