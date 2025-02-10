package com.toolshop.tests;

import com.toolshop.base.TestBase;
import com.toolshop.config.LoadProperties;
import org.testng.annotations.Test;

public class BuyItemTest extends TestBase {

    @Test
    public void testBuyItem() throws InterruptedException {
        registerPage.clickOnNavigateToSignIn();
        loginPage.signIn(LoadProperties.getProperty("EMAIL"), LoadProperties.getProperty("PASSWORD"));
        Thread.sleep(3000);
        categoriesPage.clickCategoriesLink();
        categoriesPage.clickHandToolsDropdown();
        categoriesPage.clickCombinationPliers();
        categoriesPage.clickAddToCartButton();
        categoriesPage.clickAddToCartLink();

        checkoutPage.clickProceedToCheckoutButtons();

        checkoutPage.selectPaymentMethod("Cash on Delivery");
        checkoutPage.clickConfirmButton();
        checkoutPage.isPaymentSuccessMessageVisible();
    }

}
