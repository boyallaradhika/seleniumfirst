package reporttest.thJuly;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

public class Actionstest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"))).build().perform();
		//action.moveToElement(driver.findElement(By.xpath("//a[@id='nav_prefetch_yourorders']"))).click().build().perform();
		WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(SearchBox).click().keyDown(Keys.SHIFT).sendKeys("samsung mobile").keyUp(Keys.SHIFT).build().perform();
		
	}

}
