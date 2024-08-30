package automationtesting.com.rahulshettyudamycourse;

import java.time.Duration;
import java.lang.Thread;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locatorinjava {
//	@Test
//	public void getData()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
//		WebDriver d=new ChromeDriver();
//		d.get("https://rahulshettyacademy.com/locatorspractice");
//	}
//	
	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://rahulshettyacademy.com/locatorspractice");
		d.findElement(By.id("inputUsername")).sendKeys("hello");
		d.findElement(By.name("inputPassword")).sendKeys("hello123");
		d.findElement(By.className("signInBtn")).click();
		System.out.println(d.findElement(By.cssSelector("p.error")).getText());
		
		d.findElement(By.linkText("Forgot your password?")).click();
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		d.findElement(By.xpath("//*[@id='container']/div[1]/form/input[1]")).sendKeys("hello");
		d.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("hello@gmail.com");
		d.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("123456789");
		
		
//		d.findElement(By.xpath("//*[@id=\\\"container\\\"]/div[1]/form/input[2]")).clear();
//		d.findElement(By.xpath("//*[@id=\\\"container\\\"]/div[1]/form/input[2]")).sendKeys("somethid@gmail.com");
		d.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		System.out.println(d.findElement(By.className("infoMsg")).getText());
		d.findElement(By.className("go-to-login-btn")).click();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        d.findElement(By.id("inputUsername")).sendKeys("rahul");
        d.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/input[2]")).sendKeys("rahulshettyacademy");
        d.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
     	
	
	}

}
