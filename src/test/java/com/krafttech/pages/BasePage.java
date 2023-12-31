package com.krafttech.pages;

import com.krafttech.utilities.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class  BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    public WebElement yourCartCounty;
    public String getPageTitle(String pageName){
       WebElement pageTitleElement= Driver.get().findElement(By.xpath("//span[text()='"+pageName+"']"));
       return pageTitleElement.getText();
    }
    public int getAddedItem(){
      String  addedItem=yourCartCounty.getText();
      return Integer.parseInt(addedItem);
    }
}
