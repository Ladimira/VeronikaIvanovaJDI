package ex7.forms;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.TextField;
import ex7.entities.User;

import java.lang.reflect.Field;

import static com.epam.jdi.tools.ReflectionUtils.isInterface;

public class LoginForm extends Form<User> {
    @FindBy(id = "name")
    TextField login;
    @FindBy(id = "password")
    TextField password;
    @FindBy(id = "login-button")
    Button submit;

    @Override
    public void fillAction(Field field, Object element, Object parent, String setValue) {

        if (isInterface(field, TextField.class))

            ((TextField) element).highlight();

        super.fillAction(field, element, parent, setValue);

    }
}
