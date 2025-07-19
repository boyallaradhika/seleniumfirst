package reporttest.thJuly;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chatgptsamsungmobile {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        // Search for Samsung mobile
        WebElement SearchBox = driver.findElement(By.id("twotabsearchtextbox"));
        SearchBox.sendKeys("samsung mobile");
        driver.findElement(By.id("nav-search-submit-button")).click();  // updated button locator

        Thread.sleep(5000); // Wait for results

        // Each product block
        List<WebElement> products = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));

        int count = 0;

        System.out.println("Product Name\t\t\tPrice");
        System.out.println("--------------------------------------------------");

        for (WebElement product : products) {
            if (count >= 5) break;

            try {
                String name = product.findElement(By.cssSelector("h2 a span")).getText();
                String price = product.findElement(By.cssSelector(".a-price-whole")).getText();

                if (!price.isEmpty()) {
                    System.out.println(name + "\t\t₹" + price);
                    count++;
                }

            } catch (Exception e) {
                // Skip products that don't have price/name
                continue;
            }
        }

        driver.quit();
    }
}
