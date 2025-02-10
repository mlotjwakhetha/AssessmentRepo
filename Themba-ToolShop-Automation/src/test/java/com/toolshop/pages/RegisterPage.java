package com.toolshop.pages;

import com.toolshop.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends TestBase {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(), 'Sign in')]\n")
    private WebElement navigateToSigInLink;

    @FindBy(xpath = "//a[contains(text(), 'Register your account')]")
    private WebElement registerAccountLink;

    @FindBy(css = "#first_name")
    private WebElement firstNameTextbox;

    @FindBy(css = "#last_name")
    private WebElement lastNameTextbox;

    @FindBy(css = "#dob")
    private WebElement dobTextbox;

    @FindBy(css = "#address")
    private WebElement addressTextbox;

    @FindBy(css = "#postcode")
    private WebElement postCodeTextBox;

    @FindBy(css = "#city")
    private WebElement cityTextBox;

    @FindBy(css = "#state")
    private WebElement stateTextbox;

    @FindBy(css = "#country")
    private WebElement countryDropdown;

    @FindBy(css = "#phone")
    private WebElement phoneTextbox;

    @FindBy(css = "#email")
    private WebElement emailTextBox;

    @FindBy(css = "#password")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//button[contains(text(), 'Register')]")
    private WebElement registerButton;

    @FindBy(css = "div[data-test='register-error']")
    private WebElement errorMessage;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnNavigateToSignIn() {
        clickElement(navigateToSigInLink);
    }

    public void clickOnRegisterAccount() {
        clickElement(registerAccountLink);
    }

    public void navigateToRegistration(){
        clickOnNavigateToSignIn();
        clickOnRegisterAccount();
    }

    public void fillFirstName(String firstName) {
        sendKeys(firstNameTextbox, firstName);
    }

    public void fillLastName(String lastName) {
        sendKeys(lastNameTextbox, lastName);
    }

    public void fillDob(String dob) {
        sendKeys(dobTextbox, dob);
    }

    public void fillAddress(String address) {
        sendKeys(addressTextbox, address);
    }

    public void fillPostCode(String postCode) {
        sendKeys(postCodeTextBox, postCode);
    }

    public void fillCity(String city) {
        sendKeys(cityTextBox, city);
    }

    public void fillState(String  state) {
        sendKeys(stateTextbox, state);
    }

    public void selectCountryDropdown(String country) {
        selectDropdown(countryDropdown, country);
    }

    public void fillPhone(String phone) {
        sendKeys(phoneTextbox, phone);
    }

    public void fillEmail(String email) {
        sendKeys(emailTextBox, email);
    }

    public void fillPassword(String password) {
        sendKeys(passwordTextBox, password);
    }

    public void clickOnRegisterButton() {
            clickElement(registerButton);
    }

    public void isErrorMessageDisplayed(){
        if(errorMessage.isDisplayed()){
            String elementText = getElementText(errorMessage);
            throw new RuntimeException("Registration Failed with error message " + "'" + elementText + "'");
        }
    }

    public void registerUser(
            String firstName,
            String lastName,
            String  dob,
            String address,
            String postCode,
            String  city,
            String  state,
            String country,
            String phone,
            String email,
            String password

    ){
        fillFirstName(firstName);
        fillLastName(lastName);
        fillDob(dob);
        fillAddress(address);
        fillPostCode(postCode);
        fillCity(city);
        fillState(state);
        selectCountryDropdown(country);
        fillPhone(phone);
        fillEmail(email);
        fillPassword(password);
        clickOnRegisterButton();
        isErrorMessageDisplayed();
    }
}
