package ex7.forms;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.TextField;
import ex7.entities.User;

public class LoginForm extends Form<User> {
    @FindBy(id = "name")
    TextField login;
    @FindBy(id = "password")
    TextField password;
    @FindBy(id = "login-button")
    Button submit;

    // TODO Oh my, take a look on class work. Entity-driving-testing and so on. : done
    // TODO Pay attention on code convention and empty lines! : done

}
