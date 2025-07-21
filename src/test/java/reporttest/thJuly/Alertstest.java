package reporttest.thJuly;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertstest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//accept
		WebElement alertBtn = driver.findElement(By.id("alertButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alertBtn);
		alertBtn.click();
		driver.switchTo().alert().accept();
		System.out.println("Immediate Alert accepted");
		//waithandling
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		//cancel alert
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("next");
		//prompt
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("Radhika");
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
	}

}
