package com.krafttech.pages;

import com.krafttech.utilities.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class CheckoutYourInfoPage extends BasePage{
    @FindBy(css = "#first-name")
    public WebElement firstNameInputBox;
    public void fillForm(String firstName,String lastName,String zipCode){

        Actions actions=new Actions(Driver.get());
        actions.click(firstNameInputBox)
                .sendKeys(firstName+ Keys.TAB)
                .sendKeys(lastName+Keys.TAB)
                .sendKeys(zipCode).perform();

    }

}
