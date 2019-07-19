package ex7.pages;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.composite.WebPage;

import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.complex.Menu;
import ex7.entities.User;
import ex7.forms.LoginForm;


@Url("/index.html")
@Title("Home Page")
public class MainPage extends WebPage {
    @FindBy(className = "uui-navigation nav navbar-nav m-l8")
    public Menu mainMenu;
    @FindBy(css = "a[href=\"#\"]")
    public Button dropdownLoginForm;
    @FindBy(id = "login-form")
    public LoginForm loginForm;

    public void login(User user){
        dropdownLoginForm.click();
        loginForm.fill(user);
    }

}
