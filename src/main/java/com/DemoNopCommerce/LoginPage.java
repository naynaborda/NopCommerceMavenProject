package com.DemoNopCommerce;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    By _email = By.id("Email");
    By _password = By.id("Password");
    By _logInButton = By.xpath("//input[@class='button-1 login-button']");

    public void fillingLogInDetails() {
        //type registered email
        typeText(_email, RegistrationPage.email);
        //type password
        typeText(_password, "sitaram");
        //click on login button
        clickOnElement(_logInButton);

    }
}
