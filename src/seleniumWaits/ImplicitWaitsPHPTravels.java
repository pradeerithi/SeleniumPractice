package seleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitsPHPTravels {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\POMExample\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		driver.get("https://www.phptravels.net/login");

		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("user@phptravels.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
		loginBtn.click();

		WebElement myProfileBtn = driver.findElement(By.xpath("//a[text()='My Profile']"));
		myProfileBtn.click();

//		WebElement city = driver.findElement(By.name("city"));
//		city.sendKeys("Kings Landing");
//
//		WebElement phone = driver.findElement(By.name("phone"));
//		phone.clear();
//		phone.sendKeys("8754677450");
//
//		WebElement submitBtn = driver.findElement(By.className("btn btn-block updateprofile btn-primary"));
//		submitBtn.click();
		
		driver.quit();
		

	}

}
