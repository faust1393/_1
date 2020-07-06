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

        //driver.findElement(By.cssSelector("[href=\"http://cosplay-gp.com/auth/redirect/facebook\"]")).click();

        //1 акк

        driver.findElement(By.id("email")).sendKeys("slukin.faust@yandex.ru");  // логин
        //driver.findElement(By.id("pass")).sendKeys("Fhntv3141592688");    //пасс если через FB
        driver.findElement(By.id("password")).sendKeys("Fhntv314159"); //пасс если без FB
        driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div/div/div/div[2]/form/div[4]/div/button")).click();    // жмет кнопку войти

        try {
            //thread to sleep for the specified number of milliseconds
            Thread.sleep(3000);
        } catch ( java.lang.InterruptedException ie) {
            System.out.println(ie);
        }
        driver.get("http://cosplay-gp.com/ranking_res?bumon=1");

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[src=\"storage/profile_images/276/276.jpg?20200629160704\"]")));

        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/main/div/div[2]/div/ul/li[10]/div/div[3]/form/input[2]")));

        driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/ul/li[10]/div/div[3]/form/input[2]")).click();

        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/form/a")).click();

        try {
            //thread to sleep for the specified number of milliseconds
            Thread.sleep(3000);
        } catch ( java.lang.InterruptedException ie) {
            System.out.println(ie);
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[6]/a/button/font")).click();

        //2 акк

        driver.findElement(By.id("email")).sendKeys("slukin.faust1393@yandex.ru");  // логин
        //driver.findElement(By.id("pass")).sendKeys("Fhntv3141592688");    //пасс если через FB
        driver.findElement(By.id("password")).sendKeys("Fhntv314159"); //пасс если без FB
        driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div/div/div/div[2]/form/div[4]/div/button")).click();    // жмет кнопку войти

        try {
            //thread to sleep for the specified number of milliseconds
            Thread.sleep(3000);
        } catch ( java.lang.InterruptedException ie) {
            System.out.println(ie);
        }
        driver.get("http://cosplay-gp.com/ranking_res?bumon=1");

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[src=\"storage/profile_images/276/276.jpg?20200629160704\"]")));

        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/main/div/div[2]/div/ul/li[10]/div/div[3]/form/input[2]")));

        driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/ul/li[10]/div/div[3]/form/input[2]")).click();

        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

        driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/form/a")).click();

        try {
            //thread to sleep for the specified number of milliseconds
            Thread.sleep(3000);
        } catch ( java.lang.InterruptedException ie) {
            System.out.println(ie);
        }

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[6]/a/button/font")).click();
    }

}
