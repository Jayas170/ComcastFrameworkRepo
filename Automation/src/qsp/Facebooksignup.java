package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooksignup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//upcasting
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.get("https://www.vtiger.com/");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Resources")).click();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
