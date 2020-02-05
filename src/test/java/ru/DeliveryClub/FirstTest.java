package ru.DeliveryClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest extends WebDriverSetting {

    @Test
    public void firstTest() {

        driver.get("https://vk.com");

        //String title = driver.getTitle();

       // WebElement header = driver.findElement(By.id("side_bar_inner"));
       // header.findElement(By.cssSelector("[href="/audios22194618"]")).click();

      //  WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.id("index_email")).sendKeys("faust1393@mail.ru");
        driver.findElement(By.id("index_pass")).sendKeys("Fhntv3141592688");
        driver.findElement(By.id("index_login_button")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("l_aud")));

        driver.findElement(By.xpath("//*[@id=\"l_vid\"]")).click();



    }
}
