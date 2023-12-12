package generic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	@Test
	public void basic_script() throws SQLException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root", "Root");
		Statement state = connect.createStatement();
		ResultSet output = state.executeQuery("select * from heros");
		output.next();
		String first_name = output.getString("name");
		String Pass_word = output.getString("movie");
		driver.findElement(By.id("email")).sendKeys(first_name);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(Pass_word);
		Thread.sleep(10000);
		driver.quit();
	}
	

}
