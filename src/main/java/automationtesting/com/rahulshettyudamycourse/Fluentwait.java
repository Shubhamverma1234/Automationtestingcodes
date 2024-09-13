package automationtesting.com.rahulshettyudamycourse;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {
	
	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		d.findElement(By.cssSelector("div[id='start'] button")).click();
		Wait<WebDriver> wait=new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		WebElement woo = wait.until(new Function<WebDriver, WebElement>() {
		    public WebElement apply(WebDriver driver) {
		    	if(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()) {
		        return driver.findElement(By.cssSelector("div[id='finish'] h4"));
		    }
		    	else
		    	{
		    		return null;
		    	}
		    }
		});
		
		System.out.println(d.findElement(By.cssSelector("div[id='finish'] h4")).getText());
	}

}
