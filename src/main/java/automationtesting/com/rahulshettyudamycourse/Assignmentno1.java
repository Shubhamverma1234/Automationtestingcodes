package automationtesting.com.rahulshettyudamycourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentno1 {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/angularpractice/");
		d.findElement(By.name("name")).sendKeys("hello");
		d.findElement(By.name("email")).sendKeys("hello@gmail.com");
		d.findElement(By.id("exampleInputPassword1")).sendKeys("123456789");
		d.findElement(By.id("exampleCheck1")).click();
	
		d.findElement(By.xpath("//*[@id=\"exampleFormControlSelect1\"]/option[2]")).click();
		d.findElement(By.id("inlineRadio1")).click();
		
		d.findElement(By.xpath("(//input[@value='Submit'])[1]")).click();
		
	}

}
