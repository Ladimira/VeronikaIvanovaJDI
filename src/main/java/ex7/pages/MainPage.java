package ex7.pages;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.composite.WebPage;

import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.Label;
import com.epam.jdi.light.ui.html.complex.Menu;
import ex7.entities.User;
import ex7.forms.LoginForm;
import org.hamcrest.Matchers;


@Url("/index.html")
@Title("Home Page")
public class MainPage extends WebPage {
    @UI(".m-l8 li")
    public Menu mainMenu;
    @FindBy(css = "a[href=\"#\"]")
    public Button dropdownLoginForm;
    @FindBy(id = "login-form")
    public LoginForm loginForm;
    @FindBy(id="user-name")
    public Label username;

    public void login(User user){
        dropdownLoginForm.click();
        loginForm.fill(user);
        loginForm.submit();
    }

    public void checkLoggedIn(User user){
        username.shouldBe().text(Matchers.equalTo(user.getName()));
    }

}
