package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class End_to_End_Repo {
	
	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pim_tab;
	
	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	private WebElement AS_dropdown;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout_btn;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employee_name;
	
	@FindBy(xpath = "//label[text()='Employee Id']/../following-sibling::div/input")
	private WebElement employee_id;
	
	public End_to_End_Repo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPim_tab()
	{
		return pim_tab;
	}
	public WebElement getAs_dropdown()
	{
		return AS_dropdown;
	}
	
	public WebElement getLogout_btn()
	{
		return logout_btn;
	}
    
	public WebElement getemployee_name()
	{
		return employee_name;
	}
	
	public WebElement getemployee_id()
	{
		return employee_id;
	}
}
