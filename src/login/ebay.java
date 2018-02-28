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
		WebElement col =driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul\r\n" + ""));
		System.out.println("total no of links in column " +col.findElements(By.tagName("a")).size());
		for(int i=0;i<col.findElements(By.tagName("a")).size();i++) {
			System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				col.findElements(By.tagName("a")).get(i).click();
			}
		}
		
	}
}
	


