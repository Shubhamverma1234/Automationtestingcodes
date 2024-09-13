package automationtesting.com.rahulshettyudamycourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FramesTechniquesrealtimeexample {
	
	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/droppable/");
		d.switchTo().frame(d.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions a = new Actions(d);
		WebElement source= d.findElement(By.id("draggable"));
		WebElement target=d.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
	}

}
