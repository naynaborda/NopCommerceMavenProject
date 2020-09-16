package com.DemoNopCommerce;

import org.openqa.selenium.By;

public class CompareProductPage extends Utils {
    By _customTShirt = By.xpath("//a[contains(text(),'Custom T-Shirt')]");
    By _clearComparision = By.xpath("//a[@class='clear-list']");
    By _noProductForCompare = By.xpath("//div[@class='no-data']");
    By _oversizedWomenTShirt = By.linkText("Oversized Women T-Shirt");

    public String verifyCustomTShirt() {
        //asserting product name custom t-shirt
        return getText(_customTShirt);


    }

    public String verifyOverSizedWomenTShirt() {
        return getText(_oversizedWomenTShirt);
    }

    public void clearCompareList() {
        //clear compare list
        clickOnElement(_clearComparision);

    }

    public String noProductForComparision() {
        //asserting message you have no items to compare
        return getText(_noProductForCompare);
    }
}
