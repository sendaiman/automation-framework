package com.automationframework.testclasses;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by cstarrs on 8/11/2020.
 */
public class logintests {
    WebDriver driver;
    String baseURL;


    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        baseURL = "https://diabetes.diabetesjournals.org/";
        driver.get(baseURL);
    }//beforeclass


    @AfterClass
    public void teardown(){
        driver.quit();

    }

}
