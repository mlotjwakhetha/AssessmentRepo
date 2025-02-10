package com.toolshop.pages;

import com.toolshop.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriesPage extends TestBase {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(), 'Categories')]")
    private WebElement categoriesLink;

    @FindBy(xpath = "//a[contains(text(), 'Hand Tools')]")
    private WebElement handToolsDropdown;

    @FindBy(xpath = "//h5[contains(text(), ' Combination Pliers ')]")
    private WebElement combinationPliers;

    @FindBy(css = "#btn-add-to-cart")
    private WebElement addToCartButton;

    @FindBy(css = "a[href=\"/checkout\"]")
    private WebElement addToCartLink;

    public CategoriesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCategoriesLink(){
        clickElement(categoriesLink);
    }

    public void clickHandToolsDropdown(){
        clickElement(handToolsDropdown);
    }

    public void clickCombinationPliers(){
        clickElement(combinationPliers);
    }

    public void clickAddToCartButton(){
        clickElement(addToCartButton);
    }

    public void clickAddToCartLink(){
        clickElement(addToCartLink);
    }

    public void addItemToCart(){
        clickCategoriesLink();
        clickHandToolsDropdown();
        clickCombinationPliers();
        clickAddToCartButton();
        clickAddToCartLink();
    }

}
