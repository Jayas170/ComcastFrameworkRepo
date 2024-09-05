package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//upcasting
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Pari");
		driver.findElement(By.name("lastname")).sendKeys("Kumari");
		Thread.sleep(5000);
		driver.close();
		
	}

}
