package automationtesting.com.rahulshettyudamycourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropdown {
	
	public static void main(String []args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://rahulshettyacademy.com/dropdownsPractise/");
	d.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(1000);
	System.out.println(d.findElement(By.id("divpaxinfo")).getText());
	int i=1;
	while(i<=5)
	{
	d.findElement(By.id("hrefIncAdt")).click();	
	
	i++;
	}
	System.out.println(d.findElement(By.id ("divpaxinfo")).getText());
	}

}
