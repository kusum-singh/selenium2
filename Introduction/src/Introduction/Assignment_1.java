package Introduction;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.*;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver dd = new ChromeDriver();
//		dd.get("https://rahulshettyacademy.com/AutomationPractice/");
//		dd.manage().window().maximize();
		
//		//first_question
//		dd.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
//		Assert.assertTrue(dd.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected()); //should give true
//		
//		
////		Assert.assertFalse(dd.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected()); //should give false
//		
//		//2nd_question
//		
//		System.out.println(dd.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		//Assignment 2
		
		dd.get("https://rahulshettyacademy.com/angularpractice/");
		dd.manage().window().maximize();
		dd.findElement(By.name("name")).sendKeys("Kusum Singh");
		dd.findElement(By.xpath("//input[@name='email']")).sendKeys("kusumsingh@gmail.com");
		dd.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("pass@123");
		dd.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		
		dd.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")).click();
		dd.findElement(By.xpath("//option[2]")).click();
		dd.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		dd.findElement(By.xpath("//input[@name='bday']")).sendKeys("18/08/2002");
		dd.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		String kks = dd.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
 		Assert.assertEquals(kks, "Success! The Form has been submitted successfully!.");
	}
	

}
