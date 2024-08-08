package Training;

import java.time.Duration;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Amazon {

	static WebDriver driver;
	static String Browser="chrome";
	@Test
	public void test() {
	
		// TODO Auto-generated method stub
		
		if (Browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		}else if (Browser.equalsIgnoreCase("Firefox")) {
			 driver = new FirefoxDriver();
		}else if (Browser.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
		}
		
//		driver.get("https://www.amazon.com/");
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")).click();
//        //click on TodaysDeal
//         driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
//      
//       //click on seemore
//         driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/button/a")).click();
//                                                    
//         //select Movie and Tv radio button
//         driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/div/span[19]/div/label/i")).click();
//         //Thread.sleep(3000);
//         //click on first item
//         driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div[1]/div/div/div[1]/div/a/div[1]/div/div")).click();
//         
//         //click on radio button
//         driver.findElement(By.xpath("//*[@id=\"newAccordionRow_1\"]/div/div[1]/i")).click();
//         //add to carr
//         driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
//         //verify msg
//         
//         driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1")).getText();
//		System.out.println("Actual Text :- " + driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1")).getText());
//		SoftAssert st=new SoftAssert();
//		st.assertEquals(driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1")).getText(), "Added to Cart");
////		driver.close();
//		st.assertAll();
		
		
		
		//TESTCASE -2
//		driver.get("https://www.amazon.com/");
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")).click();
//        //click on TodaysDeal
//         driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
//      
//       //click on seemore
//         driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/button/a")).click();
//                                                    
//         //select BOOK
//         driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/div/span[8]/div/label/i")).click();
//         //Thread.sleep(3000);
//         //click on first item
//         driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[28]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/p[1]/span[1]/span[1]/span[2]")).click();
//         
//         //click on radio button
//         driver.findElement(By.xpath("//*[@id=\"newAccordionRow_1\"]/div/div[1]/i")).click();
//         //add to carr
//         driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
//         //verify msg
//         driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1")).getText();
//		System.out.println("Actual Text :- " + driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1")).getText());
//		SoftAssert st=new SoftAssert();
//		st.assertEquals(driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1")).getText(), "Added to Cart");
//		driver.close();
//		st.assertAll();
		

		//TESTCASE -3
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")).click();
        //click on TodaysDeal
         driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
      
       //click on seemore
         driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/button/a")).click();
                                                    
         //select MUSICAL INSTRUMENTS
         driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/div/span[20]/div/label/i")).click();
         //Thread.sleep(3000);
         //click on first item
         driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div[1]/div/div/div[1]/div/a/p/span/span/span[2]")).click();
         
         //click on radio button
         driver.findElement(By.xpath("//*[@id=\"newAccordionRow_1\"]/div/div[1]/i")).click();
         //add to carr
         driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
         //verify msg
         driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1")).getText();
		System.out.println("Actual Text :- " + driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1")).getText());
		SoftAssert st =new SoftAssert();
		st.assertEquals(driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/h1")).getText(), "Added to Cart");
		driver.close();
		st.assertAll();
	}
	

}
