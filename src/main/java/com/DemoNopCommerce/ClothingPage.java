package com.DemoNopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class ClothingPage extends Utils {
    By _sortBy = By.id("products-orderby");
    By _display = By.id("products-pagesize");
    By _list = By.linkText("List");
    By _addCustomTiShirt = By.xpath("//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[2]");
    By _addSecondTiShirt = By.xpath("//div[@class='product-list']//div[3]//div[1]//div[2]//div[3]//div[2]//input[2]");
    By _productComparisonLink = By.linkText("product comparison");


    public void sortByLowToHighPrice() {
        //sort by low to high price
        selectValueFromDropDown(_sortBy, "Price: Low to High");
    }

    public void displayBy3Number() {
        //display 3 per page
        selectValueFromDropDown(_display, "3");

    }

    public void clickOnList() {
        //click on list
        clickOnElement(_list);

    }

    public void firstScreenShot() {
        //take a screenshot of clothing page
        captureScreenshots("Clothing Page");
    }

    public void addCustomTiShirtToComparison() {
        //add Custom T-Shirt to compare list
        clickOnElement(_addCustomTiShirt);

    }

    public void addOverSizedWomenTShirtToComparison() {
        //add Oversized Women T-S hirt to compare list
        clickOnElement(_addSecondTiShirt);

    }

    public void secondScreenshot() {
        //take again screenshot with green line on top with message"The product has been added to your product comparison
        captureScreenshots("Product Comparison");


    }

    public void productComparisionFromGreenLink() {
        //click on product comparision from green line link
        clickOnElement(_productComparisonLink);

    }

    public void sortByHighToLowPrice() {
        //click on sort by high to low price
        selectValueFromDropDown(_sortBy, "Price: High to Low");
    }

    public void displayBy9Number() {
        //display 9 per page
        selectValueFromDropDown(_display, "9");
    }

}
