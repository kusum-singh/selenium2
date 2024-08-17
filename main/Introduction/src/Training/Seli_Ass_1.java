package Training;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.Soundbank;
import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.ls.LSOutput;

public class Seli_Ass_1 {

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
	
	driver.get("http://alchemy.hguy.co/crm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@id=\"username_password\"]")).sendKeys("pa$$w0rd");
	driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
	
	}
	
	@Test
	public void first() {
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "SuiteCRM");
	}
	@Test
	public static void Second() {
		//2nd
		Seli_Ass_1.Login();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/a")).click();
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
	

	@Test
	public static void Third() {
		
		//3rd
//		System.out.println(driver.findElement(By.xpath("//a[@id=\'admin_options\']")).getText());
	}
	
	
	//4th
	@Test
	public static void Forth() {
		driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"username_password\"]")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();
		
		SoftAssert st = new SoftAssert();
		String text = driver.findElement(By.xpath("//*[@id='xstab0']")).getText();
		st.assertEquals(text, "SUITECRM DASHBOARD");
		st.assertAll();
		driver.close();
		
		
	}

		@Test
		public static void Fifth() {
			WebElement col= driver.findElement(By.xpath("//*[@id=\"toolbar\"]"));
			String colour = col.getCssValue("color");
			System.out.println("the color of the menu bar is :-" + colour);
		}

	
	@Test
	public static void Sicth() {
		Seli_Ass_1.Login();
	System.out.println(driver.findElement(By.xpath("//*[@id=\"grouptab_3\"]")).isEnabled());
	Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"grouptab_3\"]")).isEnabled());
	
	}
	
	@Test
	public static void seventh(){
		Seli_Ass_1.Login();
		driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"moduleTab_9_Leads\"]")).click();
		driver.findElement(By.xpath("(//span[@class='suitepicon suitepicon-action-info'])[1]")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='phone']")).getText());
//		driver.close();
	}
	
	@Test
	public static void eight() {
		Seli_Ass_1.Login();
		driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]")).click();
		driver.findElement(By.xpath("(//a[@id='moduleTab_9_Accounts'])[1]")).click();
		List<WebElement> list =driver.findElements(By.xpath("//tr[@class='oddListRowS1']//td[3]"));
		for (int i = 0; i < list.size(); i+=2) {
			System.out.println(list.get(i).getText());
		}
	}
	
	@Test
	public static void ninth() {
		Seli_Ass_1.Login();
		driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]")).click();
		driver.findElement(By.xpath("(//a[@id='moduleTab_9_Leads'])[1]")).click();
		List<WebElement> list1= driver.findElements(By.xpath("//tbody//tr//td[@field='name']"));
		List<WebElement> list2 = driver.findElements(By.xpath("//tbody//tr//td[@field='assigned_user_name']"));
		
		for (int i = 0; i < 10; i++) {
			System.out.println("NAME : -" + list1.get(i).getText());
			System.out.println("User name:- " + list2.get(i).getText());
		}
		
		for (int j = 0; j < 10; j++) {
			System.out.println("User name:- " + list2.get(j).getText());
		}
	}
	
	
	@Test
	public static void tenth() {
		Seli_Ass_1.Login();
		List<WebElement> llkElements= driver.findElements(By.xpath("//td[@class='dashlet-title']"));
		System.out.println("Total number of dash :- " + llkElements.size());
		for (int i = 0; i < llkElements.size(); i++) {
			System.out.println(i+1+" "+llkElements.get(i).getText());
		}
		driver.close();
	}
	
	
	@Test
	public static void twelve() {
		Seli_Ass_1.Login();
		driver.findElement(By.xpath("//a[@id='grouptab_3']")).click();
		driver.findElement(By.xpath("//a[@id=\"moduleTab_9_Meetings\"]")).click();
		driver.findElement(By.xpath("(//div[@class=\"actionmenulink\"])[1]")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("kks");
		driver.findElement(By.xpath("//input[@id='date_start_date']")).sendKeys("18/08/2024");
		driver.findElement(By.xpath("//select[@id='date_start_hours']")).click();
		driver.findElement(By.xpath("(//option[@value='01'])[1]")).click();
		driver.findElement(By.xpath("//select[@id='date_start_minutes']")).click();
		driver.findElement(By.xpath("(//option[@value='30'])[1]")).click();
		driver.findElement(By.xpath("//span[@class='suitepicon suitepicon-module-calendar']")).click();  //clicks on calendar
		driver.findElement(By.xpath("(//a[@class='calnavright'])[1]")).click();  //gives august
//		driver.findElement(By.xpath("//td[@id='date_end_trigger_div_t_cell21']")).click();  //gives date
		driver.findElement(By.xpath("(//a[@class='selector'])[18]")).click();
		driver.findElement(By.xpath("//input[@id='invitees_search']")).click();  //click on search
		driver.findElement(By.xpath("//input[@id='invitees_add_2']")).click();
		driver.findElement(By.xpath("//input[@id='invitees_add_6']")).click();
		driver.findElement(By.xpath("//input[@id='invitees_add_10']")).click();
		driver.findElement(By.xpath("(//input[@id='SAVE_HEADER'])[2]")).click();  //saved 
		driver.findElement(By.xpath("(//div[@class='actionmenulink'])[2]")).click();
		SoftAssert st = new SoftAssert();
		List<WebElement> l1= driver.findElements(By.xpath("//td[@class=' inlineEdit'][@type='name']"));
		for(WebElement i : l1) {
			if (i.getText().equalsIgnoreCase("vinay")) {
				st.assertTrue(true);
				System.out.println("true");
				break;
			}
		}
		driver.close();
		st.assertAll();
	}
	
	@Test
	public static void forteen() {
		Seli_Ass_1.Login();
		driver.findElement(By.xpath("//*[@id=\"grouptab_0\"]")).click();
		driver.findElement(By.xpath("(//a[@id='moduleTab_9_Opportunities'])[1]")).click();
		driver.findElement(By.xpath("(//a[@class='glyphicon glyphicon-filter parent-dropdown-handler'])[1]")).click();
		driver.findElement(By.xpath("//li[@class='searchTabHandler advanced active']")).click();
		driver.findElement(By.xpath("//select[@id='amount_advanced_range_choice']")).click();
		driver.findElement(By.xpath("//option[@label='Greater Than']")).click();
		driver.findElement(By.xpath("//option[@label=\"Proposal/Price Quote\"]")).click();
		driver.findElement(By.xpath("//option[@label=\"Employee\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"sort_order_desc_radio\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"search_form_submit_advanced\"]")).click();
		System.out.println(driver.findElement(By.xpath("//td[@field=\"account_name\"]")).getText());
		driver.findElement(By.xpath("(//a[@class='glyphicon glyphicon-filter parent-dropdown-handler'])[1]")).click();
		driver.findElement(By.xpath("//input[@id=\"search_form_clear_advanced\"]")).click();
		driver.close();
	}
	
	
	public static void main(String[] args) {
		Seli_Ass_1.forteen();
	}
}
