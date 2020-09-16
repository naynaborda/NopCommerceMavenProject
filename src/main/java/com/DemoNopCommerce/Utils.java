package com.DemoNopCommerce;

import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {

    //Reusable method for to click on web element.
    public static void clickOnElement(By by) {
        driver.findElement(by).click();

    }

    //Reusable method for clear field
    public static void clearField(By by) {
        driver.findElement(by).clear();
    }

    //Reusable method for send keys
    public static void typeText(By by, String textValue) {
        driver.findElement(by).sendKeys(textValue);
    }

    //Reusable method for get text
    public static String getText(By by) {
        return driver.findElement(by).getText();
    }

    //Reusable method for ScreenShot
    public static void captureScreenshots(String fileName) {

        try {
            //TakeScreenshot is interface that's why we can not create a object
            //take a screenshot and store it as a file format
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            //copy the screenshot to desired location using copyFile method
            FileUtils.copyFile(source, new File("src\\test\\resources\\screenshots" + fileName + ".jpg"));

            System.out.println("Screenshot taken");

        } catch (Exception e) {
            System.out.println("Exception while taking screenshot" + e.getMessage());

        }


    }


    //Reusable method for DateStamp
    public static String timeStamp() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        //get current date time with Date()
        Date date = new Date();
        // Now format the date
        return dateFormat.format(date);

    }

    //Reusable method for Select
    public static void selectValueFromDropDown(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);


    }


}









