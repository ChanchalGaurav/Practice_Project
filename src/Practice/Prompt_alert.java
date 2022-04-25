package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_alert {

	public static void main(String[] args) {
		// TO handle Prompt alert
		System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");	

		//Here driver object is create to use chrome class 
		WebDriver driver = new ChromeDriver(); //launch the chrome/invoke the chrome browser
		driver.get("https://demoqa.com/");  //open the URL on chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Alerts')]")).click();
		driver.findElement(By.id("promtButton")).click();
		String promptText= driver.switchTo().alert().getText();
		System.out.println(promptText);
		driver.switchTo().alert().sendKeys("Chanchal");
		driver.switchTo().alert().accept();
	}

}
