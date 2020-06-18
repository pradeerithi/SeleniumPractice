package seleniumWaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaits {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\POMExample\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.phptravels.net/login");

		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("user@phptravels.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
		loginBtn.click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(Exception.class);

		//		WebElement profileUpdate = wait.until(new Function<WebDriver, WebElement>() {
		//
		//			public WebElement apply(WebDriver driver) {
		//
		//				return driver.findElement(By.xpath("//a[text()='My Profile']"));
		//			}
		//		});

		WebElement profileUpdate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='My Profile']")));	
		profileUpdate.click();

	}

}
