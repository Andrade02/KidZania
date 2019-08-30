package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class POMOperations {
    public static WebDriver driver =new ChromeDriver();
    //You can change the ambient of your test, by test, uat
    String url = "https://test.fourz.net/Account/Login";
    String username="Alberto.Andrade";
    String password="Andrade01";

    public void launchPage(){
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver.exe");
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void login(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"login-container\"]/div[2]/div[2]/form/button")).click();
    }

    public void establishmentSelection() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        waitTime();
        WebElement activity = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[7]/a"));
        JavascriptExecutor execute = (JavascriptExecutor) driver;
        execute.executeScript("arguments[0].click();", activity);
        waitTime();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        waitTime();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a")).click();
        waitTime();
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[2]/td[2]/div/div")).click();
        waitTime();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
    }

    public void waitTime() throws InterruptedException {
        Thread.sleep(2000);
    }
}
