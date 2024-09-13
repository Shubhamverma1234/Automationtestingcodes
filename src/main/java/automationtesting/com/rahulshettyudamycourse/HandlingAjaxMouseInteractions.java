package automationtesting.com.rahulshettyudamycourse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAjaxMouseInteractions {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://ultimateqa.com/automation");
		Actions a =new Actions(d);
		WebElement m =d.findElement(By.id("menu-item-218225"));
				a.moveToElement(d.findElement(By.id("menu-item-218225"))).build().perform();
		d.findElement(By.cssSelector("button[class='et_pb_menu__icon et_pb_menu__search-button']")).click();
		
		a.moveToElement(d.findElement(By.cssSelector("input[placeholder='Search …']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick();
		a.moveToElement(m).build().perform();
		a.moveToElement(m).contextClick().build().perform();
	}

}
