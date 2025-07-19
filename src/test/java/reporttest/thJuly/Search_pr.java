package reporttest.thJuly;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class Search_pr {
 
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"))).build().perform();
		WebElement SearchBox=driver.findElement(By.id("twotabsearchtextbox"));
		SearchBox.sendKeys("samsung mobile");
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @value='Go']")).click();
		List<WebElement> products=driver.findElements(By.xpath("//div[@class='a-section']//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		int count = 0;
		
       for(WebElement e:products) {
    	   if(count>=5) {
   			break;
    	   }
   			count=count+1;
			System.out.println(e.findElement(By.tagName("h2")).getText().split("\\|")[0]+"        "+e.findElement(By.xpath("//span[@class='a-price-whole']")).getText());
		}
		
		}
	
	
	}
 