package testcases;
import methods.POMCashManagement;
import static methods.POMCashManagement.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CashManagement {
    POMCashManagement pom =new POMCashManagement();

    @Test (priority=0, enabled = false)
    public void ListOfTemplatesOfCashFloat() throws InterruptedException{
        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/a/img")).click();
        pom.waitTime();
        pom.takeScreenshot();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a")).click();
        pom.waitTime();
        pom.takeScreenshot();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/ul/li[2]/a")).click();
        pom.waitTime();
        pom.takeScreenshot();
        pom.cashManagementCloseSession();
    }

    @Test (priority=1)
    public void CreateTemplateForCashFloat() throws InterruptedException {
        //You must select High, Low or Regular info.
        String season_type_info="Low";
        //You must select Cash or KidZos.
        String type_of_float="Cash";

        pom.launchPage();
        pom.login();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/a/img")).click();
        pom.waitTime();
        pom.takeScreenshot();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a")).click();
        pom.waitTime();
        pom.takeScreenshot();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/ul/li[2]/a")).click();
        pom.waitTime();
        pom.takeScreenshot();
        driver.findElement(By.xpath("//*[@id=\"addFloatTemplateButton\"]")).click();
        pom.waitTime();
        pom.takeScreenshot();
        driver.findElement(By.xpath("//*[@id=\"Name\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"Name\"]")).sendKeys("TestAutomationTemplate");
        if(season_type_info == "High") {
            Select season_type = new Select(driver.findElement(By.xpath("//*[@id=\"SeasonTypeID\"]")));
            season_type.selectByVisibleText("Alto");
            if(type_of_float == "Cash"){
                driver.findElement(By.xpath("//*[@id=\"TemplateTab\"]/li[1]/a")).click();
            }else if(type_of_float == "KidZos"){
                driver.findElement(By.xpath("//*[@id=\"TemplateTab\"]/li[2]/a")).click();
            }
        }else if(season_type_info == "Low"){
            Select season_type = new Select(driver.findElement(By.xpath("//*[@id=\"SeasonTypeID\"]")));
            season_type.selectByVisibleText("Bajo");
        }else if(season_type_info == "Regular"){
            Select season_type = new Select(driver.findElement(By.xpath("//*[@id=\"SeasonTypeID\"]")));
            season_type.selectByVisibleText("Regular");
        }

    }
}
