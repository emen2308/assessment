import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateaccountPage_panel
{

	public static void main (String[] args) throws InterruptedException
	{
		  System.setProperty("webdriver.gecko.driver","/Users/ebizu-user/Documents/Lib_data/Lib_data/gecko/geckodriver");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("http://automationpractice.com/index.php");
		  driver.findElement(By.className("login")).click();
		  driver.findElement(By.name("email_create")).sendKeys("hariini6@yopmail.com");
		  driver.findElement(By.name("SubmitCreate")).click(); 
		 Thread.sleep(5000);
		 driver.findElement(By.id("uniform-id_gender2")).click();
		 driver.findElement(By.id("customer_firstname")).sendKeys("haritiga");
		 driver.findElement(By.id("customer_lastname")).sendKeys("initiga");
		//driver.findElement(By.id("email")).sendKeys("syniseko@wow.com");
		 driver.findElement(By.id("passwd")).sendKeys("hariini1");
		 //get_date
		 driver.findElement(By.id("days")).click();
		 driver.findElement(By.xpath("//*[@id=\"days\"]/option[8]")).click();
		 //get_months
		 driver.findElement(By.id("months")).click();
		 driver.findElement(By.xpath("//*[@id=\"months\"]/option[7]")).click();
		 //get_years
		 driver.findElement(By.id("years")).click();
		 driver.findElement(By.xpath("//*[@id=\"years\"]/option[30]")).click();
		
		 //input your address 
		 driver.findElement(By.id("firstname")).sendKeys("eko");
		 driver.findElement(By.id("lastname")).sendKeys("adi prabowo");
		 
		 driver.findElement(By.id("company")).sendKeys("Jenius");
		 driver.findElement(By.id("address1")).sendKeys("cimahi jauh di mata");
		 
		 driver.findElement(By.id("address2")).sendKeys("bandung");
		 
		 driver.findElement(By.id("city")).sendKeys("Cimahi");
         //get state
		 ((JavascriptExecutor) driver).executeScript("window.scrollBy(10,500)");
		 Thread.sleep(5000);
		 driver.findElement(By.id("id_state")).click();
		 driver.findElement(By.xpath("//*[@id='id_state']/option['Indonesia']")).click();
		 
		
		 driver.findElement(By.id("postcode")).sendKeys("43723");
		 
		 driver.findElement(By.id("id_country")).click();
		 //driver.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]")).click();
		 
		 driver.findElement(By.id("other")).sendKeys("description test blabalabla");
		 driver.findElement(By.id("phone")).sendKeys("0892637263");
		 driver.findElement(By.id("phone_mobile")).sendKeys("089753277653273");
	
		 driver.findElement(By.id("alias")).sendKeys("bulabakbalba");
		 
		 driver.findElement(By.id("submitAccount")).click();
	}
}