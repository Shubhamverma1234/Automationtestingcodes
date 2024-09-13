package automationtesting.com.rahulshettyudamycourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlealertbox {

	public static void main(String[] args) {
		String text = "Rahul";
		System.setProperty("webdriver.chrome.driver",
				"C:/AutomationTesting/rahulshettyudamycourse/src/main/java/drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.id("name")).sendKeys(text);
		d.findElement(By.id("alertbtn")).click();
		System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().accept();
		d.findElement(By.id("confirmbtn")).click();
		System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().dismiss();

	}

}
