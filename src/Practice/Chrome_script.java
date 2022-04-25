package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_script {

	public static void main(String[] args) {
		
		//setProperty is a method, from where describe the browser name and path where its driver exe file is store.
		System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");	
		//Here driver object is create to use chrome class 
		WebDriver driver = new ChromeDriver(); //launch the chrome/invoke the chrome browser
		driver.get("https://www.google.com/");  //open the URL on chrome browser
		String Title=driver.getTitle();         //Get title
		System.out.println("Title is:  " +Title);
		
		//Here Title is actual v/s expecting(google) result
		if (Title.equals("Google"))
		{
		System.out.println("Correct Title");	
		}
		else
		{
			System.out.println("Incorrect Title");
		}
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		}
			
	}


