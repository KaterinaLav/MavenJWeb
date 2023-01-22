package org.example;

import com.sun.jna.StringArray;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://evrasia.spb.ru");


//тест 1. choosing a restaurant


        WebElement webElement1 = driver.findElement(By.xpath(".//*[@id=\"header\"]/div[1]/div/div[1]/a/span[1]"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath(".//*[@id=\"rest_popup\"]/div[2]/div/ul/li[2]/a"));
        webElement2.click();
        WebElement webElement3 = driver.findElement(By.xpath(".//*[@id=\"tab2\"]/ul/li[2]/a"));
        webElement3.click();
        WebElement webElement4 = driver.findElement(By.xpath(".//*[@id=\"tab2\"]/ul/div/section/a[2]"));
        webElement4.click();
        /*      Тест 2. ordering dishes */

        driver.navigate().to("https://evrasia.spb.ru");
        WebElement webElement5 = driver.findElement(By.xpath(".//*[@id=\"header\"]/div[2]/div/nav/a[1]"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.xpath("./html/body/section[3]/div/div[1]/a"));
        webElement6.click();
        WebElement webElement7 = driver.findElement(By.xpath("./html/body/section[3]/div/div[1]/div[5]/a"));
        webElement7.click();
        WebElement webElement8 = driver.findElement(By.xpath("./html/body/section[3]/div/div[2]/a[2]"));
        webElement8.click();
        WebElement webElement9 = driver.findElement(By.xpath("./html/body/section[3]/div/div[2]/a[2]"));
        webElement9.click();
  /*     Тест 3. removing a dish */
        driver.navigate().to("https://evrasia.spb.ru");
        WebElement webElement10 = driver.findElement(By.xpath(".//*[@id=\"header\"]/div[2]/div/div[2]/a[1]"));
        webElement10.click();
        WebElement webElement11 = driver.findElement(By.xpath("./html/body/section[1]/div/div/div[2]/div[1]/div/div[1]/div[2]/a[1]"));
        webElement11.click();
/* тест 4. ordering */
        driver.navigate().to("https://evrasia.spb.ru");
        WebElement webElement12 = driver.findElement(By.xpath(".//*[@id=\"header\"]/div[2]/div/div[2]/a[1]"));
        webElement12.click();
        WebElement webElement13 = driver.findElement(By.xpath("./html/body/section[1]/div/div/div[2]/div[1]/div/div[2]"));
        webElement13.click();
        WebElement webElement14 = driver.findElement(By.xpath("./html/body/section[1]/div/div/div[2]/div[1]/div/div[3]/div[2]/div/div[1]/div/div[1]/div"));
        webElement14.click();
        WebElement webElement15 = driver.findElement(By.xpath(".//*[@id=\"name\"]"));
        webElement15.sendKeys("Катя");
        WebElement webElement16 = driver.findElement(By.xpath(".//*[@id=\"email\"]"));
        webElement16.sendKeys("new@gmail.com");
        WebElement webElement17 = driver.findElement(By.xpath(".//*[@id=\"phone\"]"));
        webElement17.sendKeys("9111234567");
        WebElement webElement18 = driver.findElement(By.xpath(".//*[@id=\"orderForm\"]/div[4]/div[1]/label"));
        webElement18.click();
        WebElement webElement19 = driver.findElement(By.xpath(".//*[@id=\"confirm-btn\"]"));
        webElement19.click();
// как итог мы должны получить уведомление о необходимости выбрать акцию (иначе заказ реально оформится :) ) Для проверки введенных значений нажать кнопку "Закрыть"*/
        WebElement webElement20 = driver.findElement(By.xpath("./html/body/div[10]/div/button"));
        webElement20.click();

        driver.quit();
    }
}