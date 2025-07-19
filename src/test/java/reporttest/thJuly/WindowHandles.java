package reporttest.thJuly;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//p[@style='text-align:center']/a")).click();
		Set<String> w=driver.getWindowHandles();
		Iterator<String> i=w.iterator();
		String parent=i.next();
		String child=i.next();
		//when we have hundreds of windows we can use loop and i.hasnext();
		driver.switchTo().window(child);
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		
		
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//p[@style='text-align:center']/a")).click();
		Set<String> w=driver.getWindowHandles();
		Iterator<String> i=w.iterator();
		while(i.hasNext()) {
		String parent=i.next();
		driver.switchTo().window(parent);
				
				System.out.println(driver.getCurrentUrl());
		}
		
		//when we have hundreds of windows we can use loop and i.hasnext();
		//driver.switchTo().window(child);
		Thread.sleep(1000);
		
		//System.out.println(driver.getTitle());*/
		


	}

}
