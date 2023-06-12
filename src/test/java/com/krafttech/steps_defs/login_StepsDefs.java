package com.krafttech.steps_defs;

import com.krafttech.pages.LoginPage;
import com.krafttech.utilities.utilities.ConfigurationReader;
import com.krafttech.utilities.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_StepsDefs {
    LoginPage loginPage=new LoginPage();
    @Given("The user on the login page")
    public void the_user_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("The user type in valid credentials:{string} and {string}")
    public void the_user_type_in_valid_credentials_and(String userName, String password) {
        loginPage.loginMtd(userName,password);

    }



}
