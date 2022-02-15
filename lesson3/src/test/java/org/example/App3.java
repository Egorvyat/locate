package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class App3 {

    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized"); //открытиие полноэкранного режима
        options.addArguments("--incognito"); //открытиие в режиме инкогнито
        options.addArguments("disable-popup-blocking"); //блокировка всплывающих окон

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // неявное ожидание
        driver.get("https://www.drive2.ru/");

        WebElement webElement=driver.findElement(By.xpath("//a[@href='/promo/']"));

        webElement.click();

        driver.findElement(By.xpath("//a[@href='#head']")).click();


        driver.quit();
    }
}
