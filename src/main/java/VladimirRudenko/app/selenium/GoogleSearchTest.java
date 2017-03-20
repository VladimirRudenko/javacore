package VladimirRudenko.app.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by vladimir on 20.03.17.
 */
public class GoogleSearchTest {
    WebDriver driver;
    //Precondition
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.gecko.driver","/home/vladimir/javacore/src/test/resources/geckodriver");
        //
        driver = new FirefoxDriver();
        //
        driver.manage().window().maximize();

        //
        driver.get("https://www.google.com");
    }
    @Test
    public void searchTest(){
        WebElement searchField = driver.findElement(By.name("q"));

       // searchField.sendKeys(CharSequence: "Selenium");
    }

}
