package com.DemoNopCommerce;

import org.openqa.selenium.By;

public class Fahrenheit451BookPage extends Utils {
    By _changeQuantity = By.xpath("//input[@id='product_enteredQuantity_37']");
    By _addBookInWishList = By.id("add-to-wishlist-button-37");
    By _verifyWishList = By.className("content");
    By _addBookInToCart = By.id("add-to-cart-button-37");
    By _goToCartFromGreenMessage = By.xpath("//a[contains(text(),'shopping cart')]");


    public void changeQuantity() {
        //clear the Quantity
        clearField(_changeQuantity);
        //enter the quantity 4
        typeText(_changeQuantity, "4");
    }

    public void addProductInWishList() {
        //add the book in wishlist
        clickOnElement(_addBookInWishList);

    }

    public String verifyBookAddedToWishlist() {
        return getText(_verifyWishList);
    }

    public void addProductInToCart() {
        //add product in to cart
        clickOnElement(_addBookInToCart);

    }

    public void clickOnCartTopGreenMessage() {
        //go to cart from top green message
        clickOnElement(_goToCartFromGreenMessage);

    }
}

