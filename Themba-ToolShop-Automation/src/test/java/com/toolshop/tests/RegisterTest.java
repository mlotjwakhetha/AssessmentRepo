package com.toolshop.tests;

import com.toolshop.base.TestBase;
import com.toolshop.config.LoadProperties;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    @Test
    public void testRegisterUser(){

        registerPage.navigateToRegistration();
        registerPage.registerUser(
                "Themba",
                "Masemula",
                "1995/01/25", // bug on year, it accepts more than 4 digits
                "4398 Ave, Rosebank",
                "2190",
                "Johannesburg",
                "Gauteng",
                "South Africa",
                "0768857496",
                LoadProperties.getProperty("EMAIL"),
                LoadProperties.getProperty("PASSWORD")
        );

    }
}
