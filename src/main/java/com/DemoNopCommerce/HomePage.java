package com.DemoNopCommerce;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    By _registerButton = By.className("ico-register");
    By _loginButton = By.className("ico-login");
    By _apparelButton = By.linkText("Apparel");
    By _bookButton = By.linkText("Books");
    By _giftCardButton = By.linkText("Gift Cards");

    public void clickOnRegisterBtn() {
        clickOnElement(_registerButton);
    }

    public void clickOnLoginBtn() {
        //click on login
        clickOnElement(_loginButton);

    }

    public void clickOnApparel() {
        //click on Apparel
        clickOnElement(_apparelButton);

    }

    public void clickonBook() {
        //click on book
        clickOnElement(_bookButton);
    }

    public void clickOnGiftCard() {
        //click on gift card button
        clickOnElement(_giftCardButton);
    }

}
