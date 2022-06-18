package testUI;

import org.junit.jupiter.api.Test;
import tests.LoginTest;

public class UITest {

    public LoginTest loginTest = new LoginTest();

    @Test
    void start() {
        loginTest.loginFormTest();
    }

}
