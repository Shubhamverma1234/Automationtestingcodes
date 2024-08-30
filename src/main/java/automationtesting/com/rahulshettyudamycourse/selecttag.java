package automationtesting.com.rahulshettyudamycourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selecttag {

	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement d1 =d.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
		
		Select dropdown = new Select(d1);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}
}
