package com.krafttech.steps_defs;

import com.krafttech.pages.CheckoutYourInfoPage;
import io.cucumber.java.en.When;

public class CheckoutYourInfo_StepDefs {
    CheckoutYourInfoPage checkoutYourInfoPage=new CheckoutYourInfoPage();
    @When("The user should be able to fill the form with:{string} and {string} and {string}")
    public void the_user_should_be_able_to_fill_the_form_with_and_and(String firstname, String lastName, String zipCode) {
        checkoutYourInfoPage.fillForm(firstname,lastName,zipCode);
    }



}
