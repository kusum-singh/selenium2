package Introduction;

import java.time.Duration;
import java.util.Iterator;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class locator_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
//		driver.navigate().to("https://www.google.com");
//		driver.navigate().back();
		WebElement staticDD = driver.findElement(By.xpath("//select[@id ='ctl00_mainContent_DropDownListCurrency']"));
//above line is for finding a particular element from the webpage and WebElement is already made class in selenium for it
		Select dropdown = new Select(staticDD);   
// above object is created with Select class what go for UI feature of dropdown and it take webelement in it as parameter
		
//		dropdown.selectByIndex(2);  //it should show INR
//		System.out.println(dropdown.getFirstSelectedOption().getText()); // should print USD cause first statement in my code shows USD
//		dropdown.selectByVisibleText("INR");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).getText());
		Thread.sleep(1000);
		for (int i = 1; i < 5; i++) {  //for 5 passengers
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		}
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).getText());
	}

}
