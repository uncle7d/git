package Rocking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic_Script {
	@Test
	public void launch_app() throws InterruptedException
	{
	   WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("email")).sendKeys("hii");
	    driver.findElement(By.id("pass")).sendKeys("guruji");
	    Thread.sleep(2000);
	    driver.findElement(By.name("login")).click();
	    driver.quit();
	}

}
