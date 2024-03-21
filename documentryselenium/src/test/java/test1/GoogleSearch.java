package test1;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class GoogleSearch {
	
WebDriver driver = null;
@Given("Browser is open")
public void browser_is_open() throws InterruptedException {
    System.out.println("browser is open");
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kiran\\eclipse-workspace\\sample\\drivers\\Gecko driver\\geckodriver.exe");
	driver = new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@And("user is on search page")
public void user_is_on_search_page() {
    System.out.println("user is on search screen");
    driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822158294!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=EAIaIQobChMIsKT8htH6hAMVrgl7Bx1r2Qz_EAAYASAAEgJd2fD_BwE");
    
}

@When("user enter data")
public void user_enter_data() {
    System.out.println("user entered data");
    LoginPage login = new LoginPage(driver);
    login.enterData("Watch");
    
   // WebElement search = driver.findElement(By.name("q"));
   // search.sendKeys("watch");
}

@And("hits enter")
public void hits_enter() {
    System.out.println("user hits enter");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
}

@Then("user navigates")
public void user_navigates() {
    System.out.println("results");
}

}
