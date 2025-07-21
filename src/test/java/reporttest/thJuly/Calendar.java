package reporttest.thJuly;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String xpathNext ="//a[@data-handler='next']";
		String xathDate="//td[@data-handler='selectDay']/a";
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("datepicker")).click();
		
		
		for(int i=0;i<=10;i++) {
			WebElement Months=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			if(Months.getText().equalsIgnoreCase("December")) {
				break;
			}
			else {
				driver.findElement(By.xpath(xpathNext)).click();
			
			}
		}
		List<WebElement> date=driver.findElements(By.xpath(xathDate));
		for(WebElement d:date) {
			if(d.getText().contains("25"))
					{
				d.click();
				break;
			}
		}
		
		

	}

}
