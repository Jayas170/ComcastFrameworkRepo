package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("Iphone");
		Thread.sleep(5000);
		
		driver.close();
		
	}


}
