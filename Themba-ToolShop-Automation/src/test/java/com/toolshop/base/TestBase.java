package com.toolshop.base;

import com.toolshop.config.LoadProperties;
import com.toolshop.pages.CategoriesPage;
import com.toolshop.pages.CheckoutPage;
import com.toolshop.pages.LoginPage;
import com.toolshop.pages.RegisterPage;
import com.toolshop.utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class TestBase extends BasePage{

    protected RegisterPage registerPage;
    protected LoginPage loginPage;
    protected CategoriesPage categoriesPage;
    protected CheckoutPage checkoutPage;
    BrowserFactory browserFactory = BrowserFactory.getInstance();

    @BeforeClass
    public void setup(){
        // Init Browser
        WebDriver driver = browserFactory.getDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(LoadProperties.getProperty("TOOL_SHOP_URL"));

        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        categoriesPage = new CategoriesPage(driver);
        checkoutPage = new CheckoutPage(driver);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        browserFactory.quitDriver();
    }
}
