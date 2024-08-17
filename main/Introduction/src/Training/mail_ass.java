package Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class mail_ass {
	

	static WebDriver driver;
	static String Browser = "chrome";
	
	@Test
	public static void Login() {
		if (Browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		}else if (Browser.equalsIgnoreCase("Firefox")) {
			 driver = new FirefoxDriver();
		}else if (Browser.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
		}
	
	driver.get(" http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Shutterbug.shootPage(driver,Capture.VERTICAL_SCROLL).withName("Step_1").save();
	driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
	Shutterbug.shootPage(driver,Capture.FULL).withName("Step_2").save();
	driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("shreyasbuddhu@gmail.com");
	driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("pass123$");
	Shutterbug.shootPage(driver,Capture.FULL_SCROLL).withName("Step_3").save();
	driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
	Shutterbug.shootPage(driver,Capture.HORIZONTAL_SCROLL).withName("Step_4").save();
	driver.findElement(By.xpath("//a[@class=\"ico-logout\"]")).click();
	Shutterbug.shootPage(driver,Capture.VIEWPORT).withName("Step_5").save();
	
	driver.close();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mail_ass.Login();
	}

}
