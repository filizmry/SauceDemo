package com.krafttech.steps_defs;

import com.krafttech.pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Products_StepsDefs {
    ProductsPage productsPage=new ProductsPage();
    @Then("The user should be able to see page title:{string}")
    public void the_user_should_be_able_to_see_page_title(String pageName) {
        String actualPageTitle=productsPage.getPageTitle(pageName);
        String expectedPageTitle=pageName;
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
    }
    @When("The user should be able sort items order type:{string}")
    public void the_user_should_be_able_sort_items_order_type(String orderType) {
        productsPage.sortItems(orderType);

    }
    @When("The user should be able to add items to cart with item names:{string}")
    public void the_user_should_be_able_to_add_items_to_cart_with_item_names(String itemName) {
     productsPage.addItem(itemName);

    }
    @Then("The number on the bascet icon should the added item number")
    public void the_number_on_the_bascet_icon_should_the_added_item_number() {
        Assert.assertEquals(ProductsPage.addedItemNumber,productsPage.getAddedItem());
    }
    @When("The user navigate to your cart page")
    public void the_user_navigate_to_your_cart_page() {
      productsPage.navigateToYourCart();
    }





}
