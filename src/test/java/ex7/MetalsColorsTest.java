package ex7;

import base.TestInit;
import ex7.entities.User;
import org.testng.annotations.Test;

import static ex7.JdiSite.mainPage;

public class MetalsColorsTest extends TestInit {


    @Test
    public void testMetalsColors() {
        mainPage.login(new User(properties.getProperty("login"), properties.getProperty("password")));

    }
}
