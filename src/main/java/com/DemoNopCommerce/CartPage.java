package com.DemoNopCommerce;

import org.openqa.selenium.By;

public class CartPage extends Utils {
    By _termAndCondition = By.id("termsofservice");
    By _checkOut = By.id("checkout");

    public void clickOnTermAndCondition() {
        //click on term and condition
        clickOnElement(_termAndCondition);

    }

    public void clickOnCheckOut() {
        //click on checkout
        clickOnElement(_checkOut);
    }
}
