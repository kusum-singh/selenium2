package Training;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Introduc {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "\\Users\\KusumSingh\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.youtube.com");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl() );
		 System.out.println(driver.getPageSource());
		 driver.close();
	}
}
