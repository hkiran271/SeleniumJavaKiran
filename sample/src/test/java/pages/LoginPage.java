package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By txt_search_field = By.name("q");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
}

	public void enterData(String Data)
	{
		driver.findElement(txt_search_field).sendKeys(Data);
	}

}
