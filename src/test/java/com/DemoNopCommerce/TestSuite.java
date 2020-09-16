package com.DemoNopCommerce;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    ApparelPage apparelPage = new ApparelPage();
    ClothingPage clothingPage = new ClothingPage();
    CompareProductPage compareProductPage = new CompareProductPage();
    BooksPage booksPage = new BooksPage();
    Fahrenheit451BookPage fahrenheit451BookPage = new Fahrenheit451BookPage();
    CartPage cartPage = new CartPage();
    CheckoutAsGuestPage checkoutAsGuestPage = new CheckoutAsGuestPage();
    OnePageCheckOutPage onePageCheckOutPage = new OnePageCheckOutPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();
    VirtualGiftCard virtualGiftCard = new VirtualGiftCard();


    @Test
    //Program5
    public void verifyRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterBtn();
        //filling Registration details
        registrationPage.fillTheRegistrationForm();
        //verify message for successful registration
        String expectedResult = "Your registration completed";
        String actualResult = registerResultPage.registrationConfirmationMessageText();
        Assert.assertEquals("User is unable to register", expectedResult, actualResult);
        //click on logout
        registerResultPage.logOut();
        //click on login
        homePage.clickOnLoginBtn();
        //filling login details
        loginPage.fillingLogInDetails();


    }

    //Program1
    @Test
    public void clothingShoppingWithScreenShot() {
        //click on Apparel
        homePage.clickOnApparel();
        //click on Clothing
        apparelPage.clickOnClothing();
        //click on sort by low to high price
        clothingPage.sortByLowToHighPrice();
        //display 3 per page
        clothingPage.displayBy3Number();
        //click on list(view)
        clothingPage.clickOnList();
        //take a screenshot of clothing page
        clothingPage.firstScreenShot();
        //add to comparision custom t-shirt
        clothingPage.addCustomTiShirtToComparison();
        //add  to comparision oversized women t-shirt
        clothingPage.addOverSizedWomenTShirtToComparison();
        //take again screenshot with green line on top with message"The product has been added to your product comparison
        clothingPage.secondScreenshot();
        //click on product comparision from green line link
        clothingPage.productComparisionFromGreenLink();
        //asserting product name custom t-shirt
        String expectedName = "Custom T-Shirt";
        String actualName = compareProductPage.verifyCustomTShirt();
        Assert.assertEquals("Custom T-Shirt is not there", expectedName, actualName);
        //clear compare list
        compareProductPage.clearCompareList();
        //asserting message you have no items to compare
        String expectedText = "You have no items to compare.";
        String actualText = compareProductPage.noProductForComparision();
        Assert.assertEquals("Item is still in compare List", expectedText, actualText);


    }

    //program2
    @Test
    public void clothingShoppingWithoutScreenShot() {
        //click on Apparel
        homePage.clickOnApparel();
        //click on Clothing
        apparelPage.clickOnClothing();
        //click on sort by high to low price
        clothingPage.sortByHighToLowPrice();
        //display 9 per page
        clothingPage.displayBy9Number();
        //click on list(view)
        clothingPage.clickOnList();
        //add to comparision custom t-shirt
        clothingPage.addCustomTiShirtToComparison();
        //add  to comparision oversized women t-shirt
        clothingPage.addOverSizedWomenTShirtToComparison();
        //click on product comparision from green line link
        clothingPage.productComparisionFromGreenLink();
        //asserting product name oversized women t-shirt
        String expectedTShirtName = "Oversized Women T-Shirt";
        String actualTShirtName = compareProductPage.verifyOverSizedWomenTShirt();
        Assert.assertEquals("Oversized women t-shirt is not there", expectedTShirtName, actualTShirtName);
        //clear compare list
        compareProductPage.clearCompareList();
        //asserting message you have no items to compare
        String expectedText = "You have no items to compare.";
        String actualText = compareProductPage.noProductForComparision();
        Assert.assertEquals("Item is still in compare List", expectedText, actualText);


    }

    //Program6
    @Test
    public void buyingBook() {
        //click on book
        homePage.clickonBook();
        //click on Fahrenheit 451 by ray Bradbury
        booksPage.clickOnFahrenheit451();
        //change quantity of the product 4
        fahrenheit451BookPage.changeQuantity();
        //add the book in wishlist
        fahrenheit451BookPage.addProductInWishList();
        //verify "The book has been added to you wishlist
        String expectedMessage = "The product has been added to your wishlist";
        String actualMessage = fahrenheit451BookPage.verifyBookAddedToWishlist();
        Assert.assertEquals("Book is not in wish list", expectedMessage, actualMessage);
        //add product in to cart
        fahrenheit451BookPage.addProductInToCart();
        //go to cart from top green message
        fahrenheit451BookPage.clickOnCartTopGreenMessage();
        //click on term and condition
        cartPage.clickOnTermAndCondition();
        //click on checkout
        cartPage.clickOnCheckOut();
        //click on checkout as guest
        checkoutAsGuestPage.checkOutAsGuest();
        //filling Personal details for checkout
        onePageCheckOutPage.fillingPersonalDetailsForCheckOut();
        //Asserting Confirmation message
        String expectedText = "Your order has been successfully processed!";
        String actualText = checkOutPage.verifyOrderConfirmationText();
        Assert.assertEquals("User is unable to  processed order", expectedText, actualText);


    }

    //Program 7
    @Test
    public void addingVirtualGiftCard() {
        //click on register button
        homePage.clickOnRegisterBtn();
        //filling Registration details
        registrationPage.fillTheRegistrationForm();
        //click on logout
        registerResultPage.logOut();
        //click on login
        homePage.clickOnLoginBtn();
        //filling login details
        loginPage.fillingLogInDetails();
        //Click on GiftCard
        homePage.clickOnGiftCard();
        //adding a virtual gift card in the cart
        giftCardsPage.addingVirtualGiftCardInCart();
        //filling all the personal details for gift card
        virtualGiftCard.fillingAllPersonalDetails();


    }
}
