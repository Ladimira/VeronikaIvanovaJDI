package ex8;

import base.TestInit;
import ex7.entities.MetalsColors;
import org.testng.annotations.Test;
import static ex7.JdiSite.mainPage;
import static ex7.JdiSite.metalsColorsPage;
import static ex7.steps.LoginSteps.shouldBeLoggedIn;
import static ex7.steps.MetalsColorsSteps.checkLogs;
import static ex7.steps.MetalsColorsSteps.fillForm;

public class MetalsColorsTestWithJsonData extends TestInit {
    @Test(dataProvider = "getDataSetFromJson", dataProviderClass = JdiDataProvider.class)

    public void JdiSiteTestWithDataProvider(MetalsColors dataset) {
        shouldBeLoggedIn();
        mainPage.mainMenu.select(properties.getProperty("metalscolorsmenu"));
        metalsColorsPage.shouldBeOpened();
        fillForm(dataset);
        checkLogs(dataset);
    }
}
