package automationtesting.com.rahulshettyudamycourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newseleniumwebdriver {

	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://capgemini.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/1979294#overview");
		
		
	}
}
