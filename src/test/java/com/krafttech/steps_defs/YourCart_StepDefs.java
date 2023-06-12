package com.krafttech.steps_defs;

import com.krafttech.pages.YourCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class YourCart_StepDefs {
    YourCartPage yourCartPage=new YourCartPage();
    @Then("The user should see the added items on cart page")
    public void the_user_should_see_the_added_items_on_cart_page(List<String> addedItems) {
        List<String> actuallist=yourCartPage.getYourItemsNames();
        List<String> expectedList=addedItems;

        Assert.assertEquals(expectedList,actuallist);

    }

    @When("The user navigate to page related button;{string}")
    public void theUserNavigateToPageRelatedButton(String buttonName) {
        yourCartPage.navigateToPage(buttonName);
    }
}
