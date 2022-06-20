package tests;

import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{
    public LoginPage loginPage = new LoginPage();

    @Test
    public LoginTest loginFormTest(){
        loginPage
                .openLoginPage()
                .checkLoginField()
                .checkPasswordField()
                .checkLoginButton()
                .setLoginValue()
                .setPasswordValue()
                .clickLoginButton();
        return this;
    }
}
