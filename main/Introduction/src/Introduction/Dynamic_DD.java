package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Dynamic_DD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//select[@id='id=\"ctl00_mainContent_ddl_originStation1\"']")).click();
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		
		driver.findElement(By.xpath("//a[@value='DED']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='AMD']")).click();

		
		//clicking todays date in calendar
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
		
		//round button clickable
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		//getting the attribute of return
//		driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style");
//		System.out.println(	driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
//		driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style");
//		System.out.println(	driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
		if (driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1")) {
			
			Assert.assertTrue(true);
			System.out.println("Enabled");
		}else {
			Assert.assertFalse(false);
			System.out.println("Disbaled");
		}
	}

}
