package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class App1 {

    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized"); //открытиие полноэкранного режима
        options.addArguments("--incognito"); //открытиие в режиме инкогнито
        options.addArguments("disable-popup-blocking"); //блокировка всплывающих окон

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // неявное ожидание
        driver.get("https://www.drive2.ru/");

        WebElement webElement=driver.findElement(By.xpath(".//a[@href='/experience/audi/']"));

        webElement.click();

        driver.findElement(By.xpath("//span[@class='u-nobr']")).click();

        driver.findElement(By.xpath("//a[@href='https://auto.drom.ru/audi/']")).click();




        driver.quit();
    }
}


