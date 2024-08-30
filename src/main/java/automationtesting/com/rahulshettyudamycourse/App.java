package automationtesting.com.rahulshettyudamycourse;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
	public void start()
	{

    	System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/");
	     System.out.println(driver.getTitle());
	     System.out.println("hello");
//	     driver.close();
	     driver.quit();
	}
	@Test
	public void start2()
	{

    	System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/geckodriver.exe");
	     WebDriver driver = new FirefoxDriver();
	     driver.get("https://rahulshettyacademy.com/");
	     System.out.println(driver.getTitle());
	     System.out.println("hello");
//	     driver.close();
	     driver.quit();
	}
	@Test
	public void start3()
	{

    	System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/msedgedriver.exe");
	     WebDriver driver = new EdgeDriver();
	     driver.get("https://rahulshettyacademy.com/");
	     System.out.println(driver.getTitle());
	     System.out.println("hello");
//	     driver.close();
	     driver.quit();
	}
    public static void main( String[] args )
    {
    	
    }
}
