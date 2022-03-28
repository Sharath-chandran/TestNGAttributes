package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Attributes {

	@Test(priority = 0, enabled = true, groups = "TeamA")
	public void Method1() {
		System.out.println("Result Method 1");
	}

	@Test(priority = 0, invocationCount = 1, groups = "TeamB")
	public void Method2() {
		System.out.println("Result Method 2");
	}

	@Test(priority = 0, enabled = true, groups = "TeamA")
	public void Method3() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		System.out.println("Result Method 3");
	}

	@Test(enabled = true, groups = "TeamB")
	public void Method4() {
		System.out.println("Result Method 4");
	}

}
