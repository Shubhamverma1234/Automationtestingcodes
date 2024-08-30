package automationtesting.com.rahulshettyudamycourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class Locatorinjava2 {
	
	public static void main(String []args) throws InterruptedException {
		String name = "rahul";
	System.setProperty("webdriver.geckodriver.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
	WebDriver d=new FirefoxDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String password=getPassword(d);
	d.get("https://rahulshettyacademy.com/locatorspractice");
	
	d.findElement(By.id("inputUsername")).sendKeys(name);
	d.findElement(By.name("inputPassword")).sendKeys(password);
	d.findElement(By.className("signInBtn")).click();
	Thread.sleep(1000);
	System.out.println(d.findElement(By.tagName("p")).getText());
	Assert.assertEquals(d.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
//	Assert.assertEquals(d.findElements(By.cssSelector("div[class='login-container'] h2")).,"Hello "+name+",");
//    WebElement greetingElement = ;
    Assert.assertEquals(d.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
    d.findElement(By.xpath("//button[text()='Log Out']")).click();
    d.close();
   
	}
	
	
	public static String getPassword(WebDriver d) throws InterruptedException
	{
		d.get("https://rahulshettyacademy.com/locatorspractice");
		d.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		d.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		
	   String passwordtext= d.findElement(By.className("infoMsg")).getText();
	   String [] passwordarray= passwordtext.split("'");
	   String password= passwordarray[1].split("'")[0];
	    return password;
	}
}
