package com.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginPageSteps {
    HomePage home;
    LoginPage login;

    @And("user enters valid data")
    public void enter_valid_data(){
        login= Selenide.page(LoginPage.class);
        login.enterData();

    }
    @And("user clicks on Anmelden button")
    public void click_on_Anmelden_button(){
        login.clickOnAnmeldenButton();

    }
    @And("user clicks on User icon")
    public void click_on_status_icon(){
        home = Selenide.page(HomePage.class);
        home.clickOnStatusLogin();
    }
    @Then("user verifies his name")
    public void verify_his_name(){
        login.verifyName();
    }
}
