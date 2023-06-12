package com.krafttech.pages;

import com.krafttech.utilities.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage extends BasePage{
    public static int addedItemNumber;
    @FindBy(xpath = "//span[text()='Products']")
    public WebElement productsTitle;

    @FindBy(css = "select")
    public WebElement sortByDropDown;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement yourCartPageLink;



    public void sortItems(String orderType){
        Select select=new Select(sortByDropDown);
        select.selectByVisibleText(orderType);
        select.getFirstSelectedOption().click();
    }
    public void addItem(String itemName){
        Driver.get().findElement(By.xpath("//div[text()='"+itemName+"']/ancestor::div[@class='inventory_item_description']//button")).click();
        addedItemNumber++;
    }
    public void navigateToYourCart(){
        yourCartPageLink.click();
    }

}
