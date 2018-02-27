package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://gurvinder//chromedriver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
//		driver.close();
		int size =driver.findElements(By.tagName("a")).size();
		System.out.println("total no of links " + size);
		WebElement footer =driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		System.out.println ("total no footer links "+footer.findElements(By.tagName("a")).size());
	}

}
