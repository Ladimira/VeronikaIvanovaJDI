package ex7;

import base.TestInit;
import org.testng.annotations.Test;
import static ex7.JdiSite.mainPage;
import static ex7.steps.LoginSteps.shouldBeLoggedIn;
import static ex7.steps.MetalsColorsSteps.checkLogs;
import static ex7.steps.MetalsColorsSteps.fillForm;
import static ex7.Defaults.defaultMCData;

public class MetalsColorsTest extends TestInit {

    @Test
    // TODO This test failed.
    public void testMetalsColors() {
        shouldBeLoggedIn();
        // TODO What is the reason of property here ? :
        //  till we need only one main menu item. there is no need to create whole enum, as I think
        mainPage.mainMenu.select(properties.getProperty("metalscolorsmenu"));
        // TODO This method should be parametrised. : done
        fillForm(defaultMCData);
        checkLogs(defaultMCData);
    }
}
