package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        2. Go to https://demo.applitools.com/
        driver.get("http://automationpractice.com/index.php");

//      max the window

        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement searchBox = driver.findElement(By.id("search_query_top"));
        searchBox.sendKeys("dress" + Keys.ENTER);

/// Select the first dress from the search results.
        driver.findElement(By.xpath("(//a[contains(.,'Printed Summer Dress')])[1]")).click();
       /* WebElement quantity =driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]"));
        quantity.clear();
        quantity.sendKeys("2");

        */

       // Thread.sleep(3000);
        //driver.findElement(By.xpath("(//a[contains(.,'Printed Dress')])[2]")).click();

        /* This is how we selected the first "Add to Cart" element on the page. */

        // (//input[contains(@value,'Add to Cart')])[1]

        Thread.sleep(3000);

        driver.findElement(By.name("Submit")).click();

        //summary_products_quantity
    //Print product count

        Thread.sleep(3000);
        //ajax_cart_product_txt
        //summary_products_quantity                    //*[@id="layer_cart"]/div[1]/div[2]/h2/span[1]
        WebElement count =driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/h2/span[2]"));

        System.out.println(count.getText());
    }
}
