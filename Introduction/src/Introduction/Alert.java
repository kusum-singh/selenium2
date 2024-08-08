package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	
	
	 static void permissionPOPUP() {
		//to ignore any location acceptance pop-up
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--disable-notifications"); //spelling is imp to note
			WebDriver driver = new ChromeDriver(co);     // passing this as parameter in chrome drive is esstential
		driver.get("https://www.redbus.in/");
		
		
	}
	public static void InfoDirectToPOPUP() {
		WebDriver dWebDriver = new ChromeDriver();
//		dWebDriver.get("http://the-internet.herokuapp.com/basic_auth");
		//syntax = //https://user:password@URL
		dWebDriver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
	
	
	public  static void normalAlerts() {
		WebDriver dd = new ChromeDriver();
		dd.switchTo().alert().accept();   // to accept in popup
		dd.switchTo().alert().dismiss();   //to cancel in popup 
		
		
		org.openqa.selenium.Alert alertwindow = dd.switchTo().alert();
		alertwindow.sendKeys("welcome");
		
	}
	public static void main(String[] args) {
		Alert.InfoDirectToPOPUP();
	}

}
