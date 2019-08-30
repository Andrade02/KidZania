package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

    public void waitTime() throws InterruptedException {
        Thread.sleep(2000);
    }
}
