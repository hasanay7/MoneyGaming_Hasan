package com.moneygaming.tests;

import com.moneygaming.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    //we made our driver object global variable
    WebDriver driver;
    @BeforeMethod
    public void setUp(){

        WebDriver driver = WebDriverFactory.getDriver("opera");
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");

        //https://motley-walkover-208.notion.site/UI-Test-Automation-EU6_Week3_and_4_Notes-bf73b735a68d43c69e6db8f461bc38fb

    }


    @Test
    public void test() throws InterruptedException {

        WebElement nameBox = driver.findElement(By.cssSelector("#forename"));
        nameBox.sendKeys("Mike");
        WebElement surnameBox = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surnameBox.sendKeys("Smith");
        Thread.sleep(2000);


    }
    @AfterMethod
    public void tearDown(){

        driver.close();

    }

}
