package reporttest.thJuly;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	int rows =driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
	int clmns = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td")).size();
	//System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[2]")).getText());
	 System.out.println("\n--- Table Data ---");
	for(int i=2;i<=rows;i++)
	{
		for(int j=1;j<=clmns;j++)
		{
			System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]")).getText()+ " | ");
			
		}
		System.out.println("   ");
	}
	

	}

	
}
