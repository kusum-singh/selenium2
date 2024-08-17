package Introduction;

import java.time.Duration;

import javax.sound.midi.Soundbank;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String name = "Kusum";
//		dd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		dd.get("https://www.linkedin.com/login");
//		dd.findElement(By.id("username")).sendKeys("Kusuumsingh@gmail.com");
//		dd.findElement(By.name("session_password")).sendKeys("Kusum_1882");
//		dd.findElement(By.className("btn__primary--large")).click();
//		System.out.println(dd.findElement(By.cssSelector("div#error-for-password")).getText());
////		dd.findElement(By.className("btn__tertiary--medium")).click();
////		dd.findElement(By.cssSelector("input#username")).sendKeys("kusumsingh1882@gmail.com");
//		dd.findElement(By.linkText("Forgot password?")).click();
//		dd.findElement(By.linkText("Sign in")).click();
//		dd.findElement(By.xpath("//input[@name='session_key']")).sendKeys("kusumsingh1882@gmail.com");
////		dd.findElement(By.cssSelector("input#password")).sendKeys("Kusum_1882");
//		dd.findElement(By.xpath("//div/input")).sendKeys("Kusum_1882");
		
	
		
		//vedio codes
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys(name);

		driver.findElement(By.name("inputPassword")).sendKeys("hello123");

		driver.findElement(By.className("signInBtn")).click();

//		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		driver.findElement(By.linkText("Forgot your password?")).click();
		//can add sleep
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("singhkk_1@rknec.edu");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8308007322");
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
//		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		//can add sleep
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("submit")).click();
		
		//Locators_2
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    System.out.println(	driver.findElement(By.tagName("p")).getText());
	    String expected = driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(expected, "You are successfully logged in.");
		
		//ask Shivam
		
//		String headname = driver.findElement(By.cssSelector("div h2")).getText();
//		System.out.println(headname);
//		Assert.assertEquals(headname,"Hello"+name+",");
		
		driver.findElement(By.xpath("//*[text() ='Log Out']")).click();
		driver.close();
	}

}
