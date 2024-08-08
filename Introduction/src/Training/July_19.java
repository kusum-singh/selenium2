package Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class July_19 {
	static WebDriver driver;
	static String Browser = "chrome";

	@Test
	public static void browser() {
		
		if (Browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		}else if (Browser.equalsIgnoreCase("Firefox")) {
			 driver = new FirefoxDriver();
		}else if (Browser.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
		}

		SoftAssert st = new SoftAssert();
//		driver.get("http://alchemy.hguy.co/crm");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
////		driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("admin");
////		driver.findElement(By.xpath("//*[@id=\"username_password\"]")).sendKeys("pa$$w0rd");
////		driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
//		
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.get(driver.getCurrentUrl());  // 2nd method to refresh the page
//		
//		
//		//deleted or manage cookies
//		driver.manage().deleteAllCookies();
//		
//		//to get tooltip msg
//		String tooltip=driver.findElement(By.xpath("//a[@title='SuiteCRM']")).getAttribute("title");
//		st.assertEquals(tooltip, "SuiteCRM");
//		System.out.println(tooltip);
//		driver.quit();
//		st.assertAll();
		
		
		//selectpbject
		driver.get("https://www.timesjobs.com/candidate/register.html?pageFlow=TJ_HOME"); //open url
	       driver.manage().window().maximize(); // maximize browser window
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       //select an item in the select box
	       WebElement cur = driver.findElement(By.id("curLocation"));
	       Select s =new Select(cur);
	       //s.selectByIndex(3);
	       //s.selectByValue("198500");
	       s.selectByVisibleText("Delhi");
	       //driver.findElement(By.id("curLocation")).sendKeys("Chennai");
	       
	       
	       //
	       driver.get("https://www.opencart.com/");
	       driver.findElement(By.xpath("//div[@id=\"navbar-collapse-header\"]/ul/li[4]")).click();
	       

}
	
	public static void main(String[] args) {
		July_19.browser();
	}
}
