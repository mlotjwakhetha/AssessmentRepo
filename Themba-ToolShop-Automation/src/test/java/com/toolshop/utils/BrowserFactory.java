package com.toolshop.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    private static final BrowserFactory instance = new BrowserFactory();

    private WebDriver driver = null;

    private BrowserFactory() {}

    public static BrowserFactory getInstance() {
        return instance;
    }

    public WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    private void setDriver(WebDriver newDriver) {
        if (driver == null) {
            driver = newDriver;
        }
    }

    public void createChromeInstance(){
        driver = new ChromeDriver();
    }

    public void quitDriver() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(2000);
            driver.quit();
            driver = null;
        }
    }
}
