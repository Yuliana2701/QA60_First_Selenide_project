package com.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.sconto.utils.PropertiesLoader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class LoginPage {
    public static final String validEmail = PropertiesLoader.loadProperty("valid.email");
    public static final String validPassword = PropertiesLoader.loadProperty("valid.password");
    public static final String invalidPassword = PropertiesLoader.loadProperty("invalid.password");
    public static final String userName = PropertiesLoader.loadProperty("user.name");
    public static final String errorMessage = PropertiesLoader.loadProperty("error.message");

    @FindBy(css = ".existingAccount__headline")
    WebElement liginTitle;
    public SelenideElement verifyLoginTitle() {
        return $(liginTitle).shouldHave(text("Anmelden"));
    }
    @FindBy(id = "loginEmail")
    WebElement emailField;
    @FindBy(id = "loginPassword")
    WebElement passwordField;
    public LoginPage enterData() {
        $(emailField).val(validEmail);
        $(passwordField).val(validPassword);
        return Selenide.page(this);
    }
    @FindBy(id = "login-submit")
    WebElement anmeldenButton;
    public HomePage clickOnAnmeldenButton() {
        $(anmeldenButton).click();
        return Selenide.page(HomePage.class);
    }
    @FindBy(css = ".titleHeadline")
    WebElement userNameTitle;
    public SelenideElement verifyName() {

        return $(userNameTitle).shouldHave(text(userName));
    }
    @FindBy(id = "loginEmail")
    WebElement emailValid;
    @FindBy(id = "loginPassword")
    WebElement passwordWrong;
    public LoginPage enterWrongData() {
        $(emailValid).val(validEmail);
        $(passwordWrong).val(invalidPassword);
        return Selenide.page(this);
    }
@FindBy(id = "loginEmail-error")
WebElement loginEmailError;
    public SelenideElement errorTextMessage() {
        return $(loginEmailError).shouldHave(text(errorMessage));
    }
}
