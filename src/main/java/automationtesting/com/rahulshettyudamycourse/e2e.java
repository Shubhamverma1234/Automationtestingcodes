package automationtesting.com.rahulshettyudamycourse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e2e {
	
	public static void main(String[]args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		d.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		d.findElement(By.xpath("//a[@value='IXM']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	
		
		d.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		d.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		d.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
		List<WebElement> options=d.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option:options) {
			
			if(option.getText().equalsIgnoreCase("indonesia")) {
				
				option.click();
			}
		}
		//Thread.sleep(2000);
		WebElement d1 =d.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
		Select dropdown = new Select(d1);
		dropdown.selectByIndex(3);
		
	}
	

}
