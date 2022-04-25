package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");	
		WebDriver driver = new ChromeDriver(); //launch the chrome/invoke the chrome browser
		driver.get("https://demoqa.com/droppable");  //open the URL on chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//find the Drag me element
		WebElement source_ele=driver.findElement(By.id("draggable"));
		WebElement target_ele=driver.findElement(By.xpath(" //div[@id='simpleDropContainer']//div[@id='droppable']"));
		
		//Using Action class to handle the Drag and drop element
		Actions act=new Actions(driver);
		act.dragAndDrop(source_ele, target_ele).build().perform();

		
		
	}

}
