package com.toolshop.base;

import com.toolshop.utils.BrowserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    private static final int TIMEOUT = 45;

    public void sendKeys(WebElement element, String value){
        waitForElementVisibility(element, Duration.ofSeconds(TIMEOUT));
        element.sendKeys(value);
    }

    public void clickElement(WebElement element){
        waitForElementVisibility(element, Duration.ofSeconds(TIMEOUT));
        waitForElementToBeClickable(element, Duration.ofSeconds(TIMEOUT));
        element.click();
    }

    public void clearElement(WebElement element){
        element.clear();
    }

    public void selectDropdown(WebElement element, String option){
        waitForElementVisibility(element, Duration.ofSeconds(TIMEOUT));
        Select select = new Select(element);
        select.selectByVisibleText(option);
    }

    public String getElementText(WebElement element){
        return element.getText();
    }

    public WebDriverWait explicitWait(WebElement element, Duration timeout){
        return new WebDriverWait(BrowserFactory.getInstance().getDriver(), timeout);
    }

    public void waitForElementToBeClickable(WebElement element, Duration timeout){
        explicitWait(element, timeout).until(ExpectedConditions.elementToBeClickable(element));

    }

    public void waitForElementVisibility(WebElement element, Duration timeout){
        explicitWait(element, timeout).until(ExpectedConditions.visibilityOf(element));
    }
}
