package reporttest.thJuly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
	int rows =driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
	int clmns = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td")).size();
	System.out.println("\n--- Table Data ---");
	for(int i=2;i<=rows;i++)
	{
		for(int j=1;j<=clmns;j += 3)
		{
			System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText()+ " | ");
			
	}
		System.out.println("   ");
}
	}
}

