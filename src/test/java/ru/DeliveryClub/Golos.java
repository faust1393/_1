package ru.DeliveryClub;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Golos extends WebDriverSetting {

    @Test
    public void Golosovanie () {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.manage().window().maximize();

        driver.get("http://cosplay-gp.com/ranking_res?bumon=1");

        driver.findElement(By.cssSelector("[href=\"http://cosplay-gp.com/login\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

        driver.findElement(By.cssSelector("[href=\"http://cosplay-gp.com/auth/redirect/facebook\"]")).click();

        driver.findElement(By.id("email")).sendKeys("faustsk@yandex.ru");  // логин
        driver.findElement(By.id("pass")).sendKeys("Fhntv3141592688");    //пасс
        driver.findElement(By.id("loginbutton")).click();    // жмет кнопку войти


        driver.get("http://cosplay-gp.com/ranking_res?bumon=1");

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[src=\"storage/profile_images/276/276.jpg?20200629160704\"]")));

        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/main/div/div[2]/div/ul/li[10]/div/div[3]/form/input[2]")));

       driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/ul/li[10]/div/div[3]/form/input[2]")).click();


        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

       driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/form/a")).click();
    }

}
