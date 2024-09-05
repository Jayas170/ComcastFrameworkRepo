package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//p[.='Hi Jasmanita']"));
	Actions a=new Actions(driver);
	a.moveToElement(element).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[.='My Profile']")).click();
	}

}
