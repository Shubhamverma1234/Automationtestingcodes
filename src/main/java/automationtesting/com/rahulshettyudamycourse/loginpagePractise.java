package automationtesting.com.rahulshettyudamycourse;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpagePractise {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
//		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w =new WebDriverWait(d,Duration.ofSeconds(7000));
		d.get("https://rahulshettyacademy.com/loginpagePractise/");
		d.findElement(By.xpath("//input[@id='username']")).sendKeys("hello");
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("123456789");
		d.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
		d.findElement(By.cssSelector("#okayBtn")).click();
		d.findElement(By.xpath("//select[@data-style='btn-info']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@data-style='btn-info']")));
		System.out.println(d.findElement(By.xpath("//select[@data-style='btn-info']")));
		int i=1;
		while(i<=3)
		{
		d.findElement(By.id("(//select[@class='form-control'])[1] //option[@value='consult']")).click();	
		
		i++;
		}
	}

}
