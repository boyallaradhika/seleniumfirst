package reporttest.thJuly;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		Thread.sleep(6000);
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		//our code where delete, backsplace. clear functions will not work but the code is correct, we will  have to rely on Javascript executor
		//but why - these clear func and actions will work only when the content is in input field and text field.
		/*Clear content using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.innerHTML = '';");*/

        // Optional: Add new content
        //js.executeScript("document.body.innerHTML = '<p>Content cleared and replaced!</p>';");

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("tinymce"))).click().keyDown(Keys.CONTROL).sendKeys("").keyUp(Keys.CONTROL).
		sendKeys(Keys.DELETE).build().perform();
		
	
		
		

	}

}
