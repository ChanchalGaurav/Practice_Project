package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//System.setProperty("webdriver.chrome.driver", "C://Users//chanchalp//Desktop//Chanchal//Web Driver//chrome driver for chrome 97//chromedriver_win32 (2)//chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "C://Users//chanchalp//Desktop//Selenium Jar File//Firefox_Driver//geckodriver-v0.30.0-win64//geckodriver.exe");
	WebDriver driver=new FirefoxDriver();  //To launch the firefox
	driver.get("https://demo.guru99.com/V1/index.php");
	String Title=driver.getTitle();
	System.out.println("Title is:  " +Title);
	
	
	}
	
}
