package Introduction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autosuggest_dD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ja");
//		Thread.sleep(2000);
//		List<WebElement> lst = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
//		for (WebElement a : lst) {
//			if (a.getText().equalsIgnoreCase("japan")){
//				a.click();
//				break;
//			}
//		}
		//return false
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_chk_friendsandfamily']")).click();
		
		//return true
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id= 'ctl00_mainContent_chk_friendsandfamily']")).isSelected());

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
