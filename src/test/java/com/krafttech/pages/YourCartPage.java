package com.krafttech.pages;

import com.krafttech.utilities.utilities.BrowserUtils;
import com.krafttech.utilities.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YourCartPage extends BasePage{
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public List<WebElement> addedItemsName;

    public List<String> getYourItemsNames(){
        List<String> actualList=BrowserUtils.getElementsText(addedItemsName);
        return actualList;
    }
    public void navigateToPage(String buttonName){
        Driver.get().findElement(By.xpath("//*[@id='"+buttonName+"']")) .click();
    }
}
