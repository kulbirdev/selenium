package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://gurvinder//chromedriver//chromedriver.exe");
	
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("this is my facebook");;
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("hello");
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}

}