package com.krafttech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutOverviewPage extends BasePage{
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public List<WebElement> listOfTotalItems;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    public WebElement totalPrice;

    public void verifyNumberOfItems(){
        int actualNumber=listOfTotalItems.size();
        int expectedNumber=ProductsPage.addedItemNumber;
        Assert.assertEquals(expectedNumber,actualNumber);
        System.out.println("totalPrice.getText() = " + totalPrice.getText().substring(13));
    }
    public void verifyTotalPrice(){
        System.out.println("totalPrice.getText() = " + totalPrice.getText().substring(13));
       String totalPriceText=totalPrice.getText().substring(13);
    }


}
