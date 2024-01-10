package Business_logic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GENERIC.Base_class;
import GENERIC.getDataFromPropertyFile;
import Repository.End_to_End_Repo;

public class end_to_endScript extends Base_class {
	
	@Test
	public void login() throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		End_to_End_Repo ETE= new End_to_End_Repo(driver);
		Thread.sleep(2000);
		ETE.getPim_tab().click();
		Thread.sleep(2000);
		String employeename = getDataFromPropertyFile.getdata("employeename");
		String employeeid = getDataFromPropertyFile.getdata("employeeid");
		ETE.getemployee_name().sendKeys(employeename);
		Thread.sleep(2000);
		ETE.getemployee_id().sendKeys(employeeid);
	}

}
