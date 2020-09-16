package com.DemoNopCommerce;

import org.openqa.selenium.By;

public class GiftCardsPage extends Utils {
    By _virtualGiftCard = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]");

    public void addingVirtualGiftCardInCart() {
        //click on Virtual gift card
        clickOnElement(_virtualGiftCard);

    }
}
