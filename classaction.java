package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class classaction {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub)
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com/r.php/");
		
		WebElement Day=dr.findElement(By.xpath("//*[@id=\"day\"]"));
		Select sel=new Select(Day);
		sel.selectByVisibleText("10");
		Thread.sleep(1000);
		
		Select sel1=new Select(dr.findElement(By.xpath("//*[@id=\"month\"]")));
		sel1.selectByValue("6");
		Thread.sleep(1000);
		
		
		Select sel2=new Select(dr.findElement(By.xpath("//*[@id=\"year\"]")));
		sel2.selectByVisibleText("6000");
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		
		
		//Thread.sleep(3000);
	}

}
