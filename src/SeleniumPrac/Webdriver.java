package SeleniumPrac;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Webdriver {

    public static void main(String[] args) {

        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","C://Users//emdad//Downloads//Selenium_Folder//geckodriver-v0.21.0-win64/geckodriver.exe");
        driver = new FirefoxDriver();
        //driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String baseURL = "http://www.youtube.com";


        driver.get(baseURL);

         driver.findElement(By.name("search_query")).sendKeys("No Limit",Keys.ENTER);




}

    }
