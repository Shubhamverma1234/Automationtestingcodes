package automationtesting.com.rahulshettyudamycourse;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class ischeckboxcheckedcheck {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
	   System.out.println(d.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	   Assert.assertFalse(d.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		d.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		d.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		System.out.println(d.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println(d.findElements(By.cssSelector("input[type='checkbox']")).size());
		assertEquals(d.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
	}

}
