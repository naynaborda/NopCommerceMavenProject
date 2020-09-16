package com.DemoNopCommerce;

import org.openqa.selenium.By;

public class CheckoutAsGuestPage extends Utils {
    By _checkOutAsGuest = By.xpath("//input[@class='button-1 checkout-as-guest-button']");

    public void checkOutAsGuest() {
        //click on checkout as guest
        clickOnElement(_checkOutAsGuest);

    }
}
