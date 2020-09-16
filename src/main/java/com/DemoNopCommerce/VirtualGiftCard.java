package com.DemoNopCommerce;

import org.openqa.selenium.By;

public class VirtualGiftCard extends Utils {
    static String email = "test" + timeStamp() + "@test.com";
    static String name = "Ram";
    By _recipientName = By.id("giftcard_43_RecipientName");
    By _recipientEMail = By.id("giftcard_43_RecipientEmail");
    By _emailFriend = By.xpath("//input[@value='Email a friend']");


    public void fillingAllPersonalDetails() {
        //Enter Recipient's Name
        typeText(_recipientName, "Sonal");
        //Enter Recipient's Email
        typeText(_recipientEMail, "sonal@test.com");
        //Click on Email a friend
        clickOnElement(_emailFriend);


    }
}
