package com.toolshop.pages;

import com.toolshop.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends TestBase {

    WebDriver driver;

    @FindBy(css = "[data-test='proceed-1']")
    private WebElement firstProceedToCheckoutButton;

    @FindBy(css = "[data-test='proceed-2']")
    private WebElement secondProceedToCheckoutButton;

    @FindBy(css = "[data-test='proceed-3']")
    private WebElement thirdProceedToCheckoutButton;

    @FindBy(css = "#payment-method")
    private WebElement paymentMethodDropdown;

    @FindBy(css = "[data-test='finish']")
    private WebElement confirmButton;

    @FindBy(xpath = "//div[contains(text(), 'Payment was successful')]")
    private WebElement paymentSuccessMessage;


    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFirstProceedToCheckOut(){
        clickElement(firstProceedToCheckoutButton);
    }

    public void clickSecondProceedToCheckOut(){
        clickElement(secondProceedToCheckoutButton);
    }

    public void clickThirdProceedToCheckOut(){
        clickElement(thirdProceedToCheckoutButton);
    }

    public void clickProceedToCheckoutButtons() throws InterruptedException {
        clickFirstProceedToCheckOut();
        clickSecondProceedToCheckOut();
        clickThirdProceedToCheckOut();
    }

    public void selectPaymentMethod(String paymentMethod){
        selectDropdown(paymentMethodDropdown, paymentMethod);
    }

    public void clickConfirmButton(){
        clickElement(confirmButton);
    }

    public void isPaymentSuccessMessageVisible(){
        if (paymentSuccessMessage.isDisplayed()){
            System.out.println("Payment was successful");
        }
    }
}
