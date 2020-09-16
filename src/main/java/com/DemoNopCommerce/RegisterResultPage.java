package com.DemoNopCommerce;

import org.openqa.selenium.By;

public class RegisterResultPage extends Utils {
    By _registrationConfirmationMessage = By.className("result");
    By _logout = By.className("ico-logout");

    public String registrationConfirmationMessageText() {
        //verify message for successful registration
        return getText(_registrationConfirmationMessage);
    }

    public void logOut() {
        //click on logout
        clickOnElement(_logout);
    }

}
