package pages;

import com.codeborne.selenide.SelenideElement;
import common.Project;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    @Step("Opening the page")
    public LoginPage openLoginPage() {
        open(Project.config.baseUrl() + "login");
        return this;
    }

    @Step("Checking the open page contain the 'Login' field")
    public LoginPage checkLoginField() {
        System.out.println("Checking the open page contain the 'Login' field");
        $("#username").shouldBe(visible);
        return this;
    }

    @Step("Fill in the 'Login' field")
    public LoginPage setLoginValue() {
        SelenideElement login = $("#username");
        login.setValue("tomsmith");
        return this;
    }

    @Step("The open page contain the 'Password' field")
    public LoginPage checkPasswordField() {
        $("#password").shouldBe(visible);
        return this;
    }

    @Step("Fill in the 'Password' field")
    public LoginPage setPasswordValue() {
        SelenideElement password = $("#password");
        password.setValue("SuperSecretPassword!");
        return this;
    }

    @Step("The open page contain the 'Login' button")
    public LoginPage checkLoginButton() {
        $x("//*[@id=\"login\"]/button").shouldBe(visible);
        return this;
    }

    @Step("Press the 'Login' button")
    public LoginPage clickLoginButton() {
        $x("//*[@id=\"login\"]/button").click();
        return this;
    }
}
