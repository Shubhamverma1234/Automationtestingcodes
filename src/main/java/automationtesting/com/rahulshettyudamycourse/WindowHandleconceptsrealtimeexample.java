package automationtesting.com.rahulshettyudamycourse;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleconceptsrealtimeexample {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/loginpagePractise/");
		d.findElement(By.cssSelector(".blinkingText")).click();
	  Set<String> w = d.getWindowHandles();
	  Iterator<String> it = w.iterator();
	  String parentid=it.next();
	  String childid=it.next();
	  d.switchTo().window(childid);
	 System.out.println(d.findElement(By.cssSelector(".im-para.red")).getText());
	String emailid =d.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	  d.switchTo().window(parentid);
	d.findElement(By.cssSelector("#username")).sendKeys(emailid);
	}
}
