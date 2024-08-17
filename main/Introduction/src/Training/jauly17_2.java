package Training;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class jauly17_2 {

	static WebDriver driver;
	static String Browser="edge";

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		if (Browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		}else if (Browser.equalsIgnoreCase("Firefox")) {
			 driver = new FirefoxDriver();
		}else if (Browser.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
		}
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
//		File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//			org.openqa.selenium.io.FileHandler.copy(f,new File("C:\\Users\\KusumSingh\\eclipse-workspace\\Introduction\\target\\test.png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Shutterbug.shootPage(driver,Capture.FULL).withName("kks").save();
//		driver.close();
		
		//screen shot of an element- primeday logo
        //WebElement logo = driver.findElement(By.xpath("//*[@id=\"nav-logo\"]"));
//		WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
//		Shutterbug.shootElement(driver, logo).withName("Logo").save();
//		
		
//		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //open url
//	       driver.manage().window().maximize(); // maximize browser window
//	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	       driver.findElement(By.xpath("//input[@title='Sign in']")).click();
//	       Thread.sleep(3000);
//	       Alert alert =driver.switchTo().alert();
//	       System.out.println("text = "+alert);
//			SoftAssert st =new SoftAssert();
//
//	       st.assertEquals(alert.getText(), "Please enter a valid user name");
//	       //handle alert
//	       alert.accept();
//	       driver.findElement(By.id("login1")).sendKeys("tester");
//	
		
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).click();
	}

}
