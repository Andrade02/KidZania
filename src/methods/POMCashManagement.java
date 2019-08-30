package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class POMCashManagement {
    public static WebDriver driver =new ChromeDriver();
    //Global Variables
    String url = "https://test.fourz.net/Account/Login";
    int ss=0;

    public void launchPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver.exe");
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("The page is completely open!");
    }

    public void login() throws InterruptedException {
        waitTime();
        takeScreenshot();
        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("Alberto.Andrade");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Andrade01");
        waitTime();
        takeScreenshot();
        driver.findElement(By.xpath("//*[@id=\"login-container\"]/div[2]/div[2]/form/button")).click();
        waitTime();
    }

    public void cashManagementCloseSession() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[9]/a")).click();
        waitTime();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[9]/ul/li[1]/a")).click();
        waitTime();
    }

    public void takeScreenshot(){
        try{
            Robot robot = new Robot();
            String format = "jpg";
            String desktopPath = "C:\\Users\\aasl\\Desktop\\Screenshots";
            File directory =new File(desktopPath);
            directory.mkdir();
            String fileName = desktopPath + "\\" + "Captura " + ss + "." + format;
            ss++;
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, format, new File(fileName));

            System.out.println("A full screenshot has saved!");
        }catch(Exception e){
        }
    }

    public void waitTime() throws InterruptedException {
        Thread.sleep(1000);
    }
}
