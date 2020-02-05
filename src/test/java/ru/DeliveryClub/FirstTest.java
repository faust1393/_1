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

            driver.findElement(By.id("index_email")).sendKeys("faust1393@mail.ru");  // логин
            driver.findElement(By.id("index_pass")).sendKeys("Fhntv3141592688");    //пасс
            driver.findElement(By.id("index_login_button")).click();    // жмет кнопку войти

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("l_aud")));  //ожидает загрузки кнопки видео

            driver.findElement(By.xpath("//*[@id=\"l_vid\"]")).click(); // ищет по xpath, жмет Видео

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("video_block_header")));

            driver.findElement(By.xpath("//*[@id=\"l_pr\"]")).click();  //ищет по xpath, жмет Моя страница

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("page_info_wrap")));

            driver.findElement(By.xpath("//*[@id=\"l_nwsf\"]")).click();     // новости

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wrap1")));

            driver.findElement(By.xpath("//*[@id=\"l_msg\"]")).click();    //сообщения

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("im_dialogs_search")));

            driver.findElement(By.xpath("//*[@id=\"l_aud\"]")).click();   //музыка

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_input")));

            driver.findElement(By.xpath("//*[@id=\"l_ap\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("apps_after")));
    }
}
