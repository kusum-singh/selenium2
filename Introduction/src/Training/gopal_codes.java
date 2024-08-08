package Training;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class gopal_codes {

	
		WebDriver driver;
	    String  Browser="firefox";
	   @Test
	   public void testCase1() throws Throwable {
	       SoftAssert st=new SoftAssert();
	       if(Browser.equalsIgnoreCase("Chrome"))
	                 driver=new ChromeDriver(); //openBrowser
	       else if(Browser.equalsIgnoreCase("firefox"))
	                driver=new FirefoxDriver();
	       else if(Browser.equalsIgnoreCase("edge"))
	              driver=new EdgeDriver();
	       driver.get("https://jqueryui.com/"); //open url
	       driver.manage().window().maximize(); // maximize browser window
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       //click on selectable
	       driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[4]/a")).click();
	       //switch driver reference to frame
	       driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	       //WebDriver ChangeToFrame = driver.switchTo().frame(0);------>using numbers
	     //squential frames
//	       driver.switchTo().frame(0);
//	       driver.findElement(By.xpath("")).sendKeys("t1");
//	       driver.switchTo().defaultContent();
//	       driver.switchTo().frame(1);
//	       driver.findElement(By.xpath("")).sendKeys("t2");
//	       driver.switchTo().defaultContent();
//	       driver.switchTo().frame(2);
	//
	       //nested frame
	       //driver.switchTo().parentFrame();
	       driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).click();
	       //reset to default driver
	       driver.switchTo().defaultContent();
	       //droppable
	       driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
	   
	}
}
