package automationtesting.com.rahulshettyudamycourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowforwardbackword {
	
	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().fullscreen();
		d.get("https://www.google.co.in/");
		d.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		d.navigate().back();
	}

}
