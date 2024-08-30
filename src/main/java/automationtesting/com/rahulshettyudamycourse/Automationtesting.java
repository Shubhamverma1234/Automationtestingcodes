package automationtesting.com.rahulshettyudamycourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationtesting {
	public static void main (String []args) {
		
	
	System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://rahulshettyacademy.com/AutomationPractice/");
	System.out.println(d.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	System.out.println(d.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]/parent::div/button[3]")).getText());
	}
}
