package com.krafttech.steps_defs;

import com.krafttech.pages.CheckoutOverviewPage;
import io.cucumber.java.en.Then;

public class CheckoutOverview_StepDefs {
    CheckoutOverviewPage checkoutOverviewPage=new CheckoutOverviewPage();
    @Then("The user should be able to verify total price and number of items")
    public void the_user_should_be_able_to_verify_total_price_and_number_of_items() {
        checkoutOverviewPage.verifyNumberOfItems();

    }

}
