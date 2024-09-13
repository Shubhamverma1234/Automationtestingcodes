package automationtesting.com.rahulshettyudamycourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class HandlingCalendarUIintravel {

	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		d.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		d.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		System.out.println(d.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(d.findElement(By.id("Div1")).getAttribute("style"));
		d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if((d.findElement(By.id("Div1")).getAttribute("style").contains("0.5")))
		{
			System.out.println("its enabled");
			
			Assert.assertTrue(true);
		}

		else {
			System.out.println("not enabled");
			Assert.assertTrue(false);
			
		}
		
	}
}
