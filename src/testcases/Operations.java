package testcases;

import methods.POMOperations;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static methods.POMOperations.driver;

public class Operations {
    POMOperations pom =new POMOperations();

    @Test (enabled = false)
    public void DisplayTheConfiguredActivitiesOfAEstablishment() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[2]/td[2]/div/div")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        pom.waitTime();
        pom.waitTime();
    }

    @Test (priority = 1, enabled = false)
    public void RegisterTheAccessOfAVisitorToAnActivityPayment() throws InterruptedException {
        String bracelet="NNN7";
        //You can select Efectivo or Tarjeta.
        String type_of_payment="Efectivo";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[2]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        if(type_of_payment == "Efectivo"){
            driver.findElement(By.xpath("//*[@id=\"btcash\"]")).click();
        }else if(type_of_payment == "Tarjeta"){
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]/option[2]")).click();
            driver.findElement(By.xpath("//*[@id=\"btcard\"]")).click();
            if(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed()){
                driver.findElement(By.xpath("/html/body/div[10]/div/div[10]/button[1]")).click();
            }
        }
    }

    @Test (priority = 2, enabled = false)
    public void RegisterTheAccessOfAVisitorToAnActivitySalary() throws InterruptedException {
        String bracelet="NNN7";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[1]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        pom.waitTime();
    }

    @Test (priority = 3, enabled = false)
    public void RegisterTheAccessOfAVisitorToAnActivityWithAnInvalidBracelet() throws InterruptedException {
        String bracelet="BETO123";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[1]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        pom.waitTime();
        if(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed()){
            driver.findElement(By.xpath("/html/body/div[9]/div/div[10]/button[1]")).click();
        }else{
            System.out.println("El brazalete, si existe!");
        }
    }

    @Test(priority = 4, enabled = false)
    public void RegisterTheAccessOfAVisitorToAnActivityWithABraceletWithInvalidDurationTime(){

    }

    @Test(priority = 5, enabled = false)
    public void RegisterTheAccessOfAVisitorToAnActivityWithABraceletThatHasReachedTheLimitOfTaxes() throws InterruptedException {
        String bracelet="CAMP1";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        pom.waitTime();
        WebElement activity = driver.findElement(By.xpath("//*[@id=\"menu\"]/li[7]/a"));
        JavascriptExecutor execute = (JavascriptExecutor) driver;
        execute.executeScript("arguments[0].click();", activity);
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[1]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        pom.waitTime();
      }

    @Test(priority = 6, enabled = false)
    public void RegisterTheAccessOfALoyaltyProgramMemberToAnActivityPayment() throws InterruptedException {
        String bracelet="DEMO13082019N2F1";
        //You can select Efectivo or Tarjeta.
        String type_of_payment="Efectivo";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[2]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        if(type_of_payment == "Efectivo"){
            driver.findElement(By.xpath("//*[@id=\"btcash\"]")).click();
        }else if(type_of_payment == "Tarjeta"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]/option[2]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcard\"]")).click();
            if(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed()){
                driver.findElement(By.xpath("/html/body/div[10]/div/div[10]/button[1]")).click();
            }
        }
    }

    @Test(priority = 7, enabled = false)
    public void RegisterTheAccessOfALoyaltyProgramMemberToAnActivitySalary() throws InterruptedException {
        String bracelet="DEMO13082019N2F1";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[1]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        pom.waitTime();
    }

    @Test(priority = 8, enabled = false)
    public void DisplayThatTheVisitorIsACelebrantDuringTheActivityRegistrationPayment(){

    }

    @Test(priority = 9, enabled = false)
    public void RegisterTheAccessOfALoyaltyProgramMemberCelebrantToAnActivitySalary(){

    }

    @Test(priority = 10, enabled = false)
    public void DisplayRegisteredMessagesDuringActivityRegistration() throws InterruptedException {
        String bracelet="NNN7";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[2]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        pom.waitTime();
    }

    @Test(priority = 11, enabled = false)
    public void StartAnActivityCycle() throws InterruptedException {
        String bracelet="NNN7";
        String bracelet2="21";
        String type_of_payment="Efectivo";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[2]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        pom.waitTime();
        if(type_of_payment == "Efectivo"){
            driver.findElement(By.xpath("//*[@id=\"btcash\"]")).click();
        }else if(type_of_payment == "Tarjeta"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]/option[2]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcard\"]")).click();
            if(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed()){
                driver.findElement(By.xpath("/html/body/div[10]/div/div[10]/button[1]")).click();
            }
        }
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet2, Keys.ENTER);
        pom.waitTime();
        if(type_of_payment == "Efectivo"){
            driver.findElement(By.xpath("//*[@id=\"btcash\"]")).click();
        }else if(type_of_payment == "Tarjeta"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]/option[2]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcard\"]")).click();
            if(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed()){
                driver.findElement(By.xpath("/html/body/div[10]/div/div[10]/button[1]")).click();
            }
        }
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"tb00000000-0000-0000-0000-000000000000\"]/thead/tr/th[5]/button")).click();
    }

    @Test(priority = 12, enabled = false)
    public void EndAnActivityCycle() throws InterruptedException {
        String bracelet="NNN7";
        String bracelet2="21";
        String type_of_payment="Efectivo";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[2]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        pom.waitTime();
        if(type_of_payment == "Efectivo"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcash\"]")).click();
            pom.waitTime();
        }else if(type_of_payment == "Tarjeta"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]/option[2]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcard\"]")).click();
            if(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed()){
                driver.findElement(By.xpath("/html/body/div[10]/div/div[10]/button[1]")).click();
            }
        }
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet2, Keys.ENTER);
        pom.waitTime();
        if(type_of_payment == "Efectivo"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcash\"]")).click();
            pom.waitTime();
        }else if(type_of_payment == "Tarjeta"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]/option[2]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcard\"]")).click();
            if(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed()){
                driver.findElement(By.xpath("/html/body/div[10]/div/div[10]/button[1]")).click();
            }
        }
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"tb00000000-0000-0000-0000-000000000000\"]/thead/tr/th[5]/button")).click();
        pom.waitTime();
        pom.waitTime();
        pom.waitTime();
        driver.findElement(By.cssSelector("button.actEnd.btn.btn-save")).click();
        pom.waitTime();
    }

    @Test(priority = 13, enabled = false)
    public void Timer() throws InterruptedException {
        String bracelet="NNN7";
        String bracelet2="21";
        String type_of_payment="Efectivo";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[2]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        pom.waitTime();
        if(type_of_payment == "Efectivo"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcash\"]")).click();
            pom.waitTime();
        }else if(type_of_payment == "Tarjeta"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]/option[2]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcard\"]")).click();
            if(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed()){
                driver.findElement(By.xpath("/html/body/div[10]/div/div[10]/button[1]")).click();
            }
        }
        driver.findElement(By.xpath("//*[@id=\"tb00000000-0000-0000-0000-000000000000\"]/thead/tr/th[5]/button")).click();
        pom.waitTime();
        pom.waitTime();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[1]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[2]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet2, Keys.ENTER);
        pom.waitTime();
        if(type_of_payment == "Efectivo"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcash\"]")).click();
            pom.waitTime();
        }else if(type_of_payment == "Tarjeta"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]/option[2]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcard\"]")).click();
            if(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed()){
                driver.findElement(By.xpath("/html/body/div[10]/div/div[10]/button[1]")).click();
            }
        }
    }

    @Test(priority = 14, enabled = false)
    public void ExitTheRegisteredVisitorsInAnActivityCycle() throws InterruptedException {
        String bracelet="NNN7";
        String type_of_payment="Efectivo";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[2]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        pom.waitTime();
        if(type_of_payment == "Efectivo"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcash\"]")).click();
            pom.waitTime();
        }else if(type_of_payment == "Tarjeta"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]/option[2]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcard\"]")).click();
            if(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed()){
                driver.findElement(By.xpath("/html/body/div[10]/div/div[10]/button[1]")).click();
            }
        }
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"tb00000000-0000-0000-0000-000000000000\"]/thead/tr/th[5]/button")).click();
        pom.waitTime();
        pom.waitTime();
        pom.waitTime();
        driver.findElement(By.cssSelector("button.actExt.btn.btn-cancel")).click();
        pom.waitTime();
    }

    @Test(priority = 15, enabled = false)
    public void ExitAllTheRegisteredVisitorsFromAnActivity() throws InterruptedException {
        String bracelet="NNN7";
        String bracelet2="21";
        String type_of_payment="Efectivo";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[2]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        pom.waitTime();
        if(type_of_payment == "Efectivo"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcash\"]")).click();
            pom.waitTime();
        }else if(type_of_payment == "Tarjeta"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]/option[2]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcard\"]")).click();
            if(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed()){
                driver.findElement(By.xpath("/html/body/div[10]/div/div[10]/button[1]")).click();
            }
        }
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet2, Keys.ENTER);
        pom.waitTime();
        if(type_of_payment == "Efectivo"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcash\"]")).click();
            pom.waitTime();
        }else if(type_of_payment == "Tarjeta"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]/option[2]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcard\"]")).click();
            if(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed()){
                driver.findElement(By.xpath("/html/body/div[10]/div/div[10]/button[1]")).click();
            }
        }
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"tb00000000-0000-0000-0000-000000000000\"]/thead/tr/th[5]/button")).click();
        pom.waitTime();
        pom.waitTime();
        pom.waitTime();
        driver.findElement(By.cssSelector("button#btExitAll.btn.btn-cancel")).click();
        pom.waitTime();
    }

    @Test(priority = 16, enabled = false)
    public void DeleteARegisteredVisitorFromAnActivity() throws InterruptedException {
        String bracelet="NNN7";
        String type_of_payment="Efectivo";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[2]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        pom.waitTime();
        if(type_of_payment == "Efectivo"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcash\"]")).click();
            pom.waitTime();
        }else if(type_of_payment == "Tarjeta"){
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"selectCard\"]/option[2]")).click();
            pom.waitTime();
            driver.findElement(By.xpath("//*[@id=\"btcard\"]")).click();
            if(driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).isDisplayed()){
                driver.findElement(By.xpath("/html/body/div[10]/div/div[10]/button[1]")).click();
            }
        }
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"tb00000000-0000-0000-0000-000000000000\"]/thead/tr/th[5]/button")).click();
        pom.waitTime();
        pom.waitTime();
        pom.waitTime();
        driver.findElement(By.cssSelector("a.visExt.btn.btn-delete")).click();
        pom.waitTime();
    }

    @Test(priority = 17, enabled = false)
    public void DisplayTheCurrentVisitorsInTheActivityAndAvailableSpacesForTheNextCycle() throws InterruptedException {
        StartAnActivityCycle();
    }

    @Test(priority = 18, enabled = false)
    public void Reg() throws InterruptedException {
        String bracelet="383744364231304543383645";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a/img")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"principal-container\"]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"menusecondary\"]/li[1]/a/span[2]")).click();
        //You can select the Establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"tableestablishs\"]/tbody/tr[3]/td[2]/div/div/div/span[3]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//*[@id=\"btnsave\"]"));
        js.executeScript("arguments[0].scrollIntoView()", save);
        driver.findElement(By.xpath("//*[@id=\"btnsave\"]")).click();
        //You can select any activity of the establishment only change the Xpath bellow.
        driver.findElement(By.xpath("//*[@id=\"pnactivities\"]/div[2]/div/span")).click();
        pom.waitTime();
        driver.findElement(By.xpath("//*[@id=\"txbracelet\"]")).sendKeys(bracelet, Keys.ENTER);
        pom.waitTime();
        pom.waitTime();
        driver.findElement(By.cssSelector("button#closeModalRegistry.close")).click();
    }
}