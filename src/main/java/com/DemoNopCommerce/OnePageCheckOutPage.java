package com.DemoNopCommerce;

import org.openqa.selenium.By;

public class OnePageCheckOutPage extends Utils {
    By _firstName = By.id("BillingNewAddress_FirstName");
    By _lastName = By.id("BillingNewAddress_LastName");
    By _email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By _country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By _city = By.id("BillingNewAddress_City");
    By _address = By.id("BillingNewAddress_Address1");
    By _postCode = By.id("BillingNewAddress_ZipPostalCode");
    By _phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By _continueBilling = By.xpath("//div[@id='billing-buttons-container']//input[@class='button-1 new-address-next-step-button']");
    By _continueShipping = By.cssSelector("div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page div.page-body.checkout-data ol.opc li.tab-section.allow.active:nth-child(3) div.step.a-item form:nth-child(1) div.buttons:nth-child(2) > input.button-1.shipping-method-next-step-button");
    By _creditCard = By.xpath("//input[@id='paymentmethod_1']");
    By _continueOpcPaymentMethod = By.xpath("//input[@class='button-1 payment-method-next-step-button']");
    By _selectCreditCard = By.id("CreditCardType");
    By _cardHolderName = By.id("CardholderName");
    By _cardNumber = By.id("CardNumber");
    By _selectExpireMonth = By.id("ExpireMonth");
    By _selectExpireYear = By.id("ExpireYear");
    By _cardCode = By.id("CardCode");
    By _continueOpcPaymentInfo = By.xpath("//input[@class='button-1 payment-info-next-step-button']");
    By _confirmOrder = By.cssSelector("div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page div.page-body.checkout-data ol.opc li.tab-section.allow.active:nth-child(6) div.step.a-item div.buttons:nth-child(2) > input.button-1.confirm-order-next-step-button");


    public void fillingPersonalDetailsForCheckOut() {
        //Enter FirstName
        typeText(_firstName, "Raj");
        //Enter LastName
        typeText(_lastName, "Kapoor");
        //Enter Email
        typeText(_email, "rajkapoor@test.com");
        //Select Country
        selectValueFromDropDown(_country, "United Kingdom");
        //Enter CityName
        typeText(_city, "London");
        //Enter AddressLine 1
        typeText(_address, "606 ShivNagar");
        //Enter PostCode
        typeText(_postCode, "fg5 9lo");
        //Enter PhoneNumber
        typeText(_phoneNumber, "08965434875");
        //Click on Continue from Billing page
        clickOnElement(_continueBilling);
        //Click on Continue From Shipping page
        clickOnElement(_continueShipping);
        //Click on CreditCard
        clickOnElement(_creditCard);
        //Click on Continue From Opc-Payment-Method Page
        clickOnElement(_continueOpcPaymentMethod);
        //Add Card Details
        //Select Credit Card Type
        selectValueFromDropDown(_selectCreditCard, "Master card");
        //Enter CardHolder Name
        typeText(_cardHolderName, "Mr Raj");
        //Enter Card Number
        typeText(_cardNumber, "378282246310005");
        //Select Expire Month
        selectValueFromDropDown(_selectExpireMonth, "02");
        //Select Expire Year
        selectValueFromDropDown(_selectExpireYear, "2021");
        //Enter Card Code
        typeText(_cardCode, "324");
        //Click on Continue From Opc-Payment_Info Page
        clickOnElement(_continueOpcPaymentInfo);
        //Click on Confirm Order From Opc-Confirm_Order Page
        clickOnElement(_confirmOrder);


    }

}
