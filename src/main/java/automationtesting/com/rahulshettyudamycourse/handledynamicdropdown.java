package automationtesting.com.rahulshettyudamycourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handledynamicdropdown {

	public static void main(String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise");
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		d.findElement(By.xpath("//a[@value='IXM']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	}
}
