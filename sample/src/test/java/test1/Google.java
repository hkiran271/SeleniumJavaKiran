package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Google {
@Test	
public void flipkart() throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kiran\\eclipse-workspace\\sample\\drivers\\Gecko driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	 driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822158294!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=EAIaIQobChMIsKT8htH6hAMVrgl7Bx1r2Qz_EAAYASAAEgJd2fD_BwE");
     Thread.sleep(5000);
}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("HI");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kiran\\eclipse-workspace\\sample\\drivers\\Gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Kiran/eclipse-workspace/sample/drivers/chrome driver/chromedriver.exe");
		Google flip= new Google();
		flip.flipkart();
		//WebDriver driver = new ChromeDriver();
	    
	     //driver.close();
	    // WebElement search = driver.findElement(By.name("q"));
	     //search.sendKeys("watch");
	    // WebElement grocery = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]"));
	   // grocery.click();
	     //driver.findElement(By.id("input")).sendKeys("flipkart");
	String  title = driver.getTitle();
	System.out.println(title);
	  //  org.testng.Assert.assertEquals(title, "");
	    

	}

}
