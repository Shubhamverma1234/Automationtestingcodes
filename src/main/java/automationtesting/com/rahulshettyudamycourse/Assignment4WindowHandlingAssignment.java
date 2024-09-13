package automationtesting.com.rahulshettyudamycourse;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4WindowHandlingAssignment {
	
	public static void main(String []args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/");
		d.findElement(By.cssSelector("a[href='/windows']")).click();
		d.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
		Set<String> a= d.getWindowHandles();
		Iterator<String> w = a.iterator();
	String Parent =	w.next();
	String child=w.next();
	d.switchTo().window(child);
	System.out.println(d.findElement(By.cssSelector("div[class='example'] h3")).getText());
	d.switchTo().window(Parent);
	System.out.println(d.findElement(By.cssSelector("div[class='example'] h3")).getText());
	
		
		
		
	}

}
