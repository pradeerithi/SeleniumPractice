package seleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaitEg {

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

		WebDriverWait wait = new WebDriverWait(driver, 20);
		 
		WebElement myProfileBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='My Profile']")));
		myProfileBtn.click();
	}

}
