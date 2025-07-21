package reporttest.thJuly;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitstest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));*/
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ipad");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='left-pane-results-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction']")));
		 List<WebElement> Options = (driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction']")));
		 for(WebElement Option:Options) {
			 if(Option.getText().contains("ipad 10gen"))
			 {
				 Option.click();
				 break;
			 }
		 }
		
		
	}

}
