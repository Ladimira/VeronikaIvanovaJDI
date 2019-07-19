package ex7.steps;

import ex7.JdiSite;
import io.qameta.allure.Step;

import static ex7.Defaults.defaultUser;
import static ex7.JdiSite.mainPage;

public class LoginSteps {
    @Step
    public static void shouldBeLoggedIn() {
        if (mainPage.username.isHidden()) {
            JdiSite.mainPage.login(defaultUser);
            JdiSite.mainPage.checkLoggedIn(defaultUser);
        }
    }
}
