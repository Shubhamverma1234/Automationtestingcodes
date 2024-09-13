package automationtesting.com.rahulshettyudamycourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5FramesAssignment {
	
	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/");
		d.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		d.switchTo().frame("frame-top");
		d.switchTo().frame("frame-middle");
		System.out.println(d.findElement(By.cssSelector("#content")).getText());
		
	}

}
