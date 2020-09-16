package com.DemoNopCommerce;

import org.openqa.selenium.By;

public class BooksPage extends Utils {
    By _fahrenheit451 = By.linkText("Fahrenheit 451 by Ray Bradbury");

    public void clickOnFahrenheit451() {
        //click on Fahrenheit 451 by ray Bradbury
        clickOnElement(_fahrenheit451);

    }
}
