package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

// Launch the chrome browser with site and login with user name and password (Test1,Test1)
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        2. Go to https://demo.applitools.com/
        driver.get("https://demo.applitools.com/");

//      max the window

        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("Test1" + Keys.ENTER);
        driver.findElement(By.id("password")).sendKeys("Test1"+ Keys.ENTER);
        driver.findElement(By.id("log-in")).click();

        //Print the total row of recent transitions

        List<WebElement> transitions = driver.findElements(By.xpath("//table/tbody/tr"));

        System.out.println("The number of total rows " + transitions.size());


        //Print the total hyperlink present on page
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));


        for (WebElement eachLink : listOfLinks) {
            String textOfEachLink = eachLink.getText();

            System.out.println(textOfEachLink);

        }

        System.out.println("The number of hyperlinks is " + listOfLinks.size());



    }
}