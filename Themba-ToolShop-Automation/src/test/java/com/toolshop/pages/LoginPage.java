package com.toolshop.pages;

import com.toolshop.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    WebDriver driver;

    @FindBy(css = "#email")
    private WebElement emailTextbox;

    @FindBy(css = "#password")
    private WebElement passwordTextbox;

    @FindBy(css = "input[type=\"submit\"]")
    private WebElement loginButton;

    @FindBy(css = "div[data-test='login-error']")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillUsername(String email){
        sendKeys(emailTextbox, email);
    }

    public void fillPassword(String  password){
        sendKeys(passwordTextbox, password);
    }

    public void clickSigInButton(){
        clickElement(loginButton);
    }

    public void isErrorMessageVisible(){
        if(errorMessage.isDisplayed()){
            String elementText = getElementText(errorMessage);
            throw new RuntimeException("Login Failed with error message " + "'" + elementText + "'");
        } else {
            System.out.println("Login is successful");
        }
    }

    public void signIn(String email, String  password){
        fillUsername(email);
        fillPassword(password);
        clickSigInButton();
    }
}
