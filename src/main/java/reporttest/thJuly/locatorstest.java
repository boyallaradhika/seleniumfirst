package reporttest.thJuly;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class locatorstest {
//@Test
	public  void locatorstest() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ipad");
		Thread.sleep(6000);
		 List<WebElement> Options = (driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction']")));
		 for(WebElement Option:Options) {
			 if(Option.getText().contains("ipad 10gen"))
			 {
				 Option.click();
				 break;
			 }
		 }
		/*Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		dropdown.selectByVisibleText("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Books"));*/
}
		
		//@Test
		public void samsung() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(6000);
			driver.manage().window().maximize();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung mobile");
			List<WebElement> PhoneNames=driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//div"));
		for(WebElement phonename:PhoneNames) {
			
			
		}
		}

				 

	
}

