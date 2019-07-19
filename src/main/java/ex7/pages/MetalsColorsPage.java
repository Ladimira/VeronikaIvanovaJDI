package ex7.pages;

import com.epam.jdi.light.elements.composite.WebPage;

import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.ui.html.common.Label;
import ex7.forms.MetalsColorsForm;

import java.util.List;


@Url("/metals-colors.html")
@Title("Metal and Colors")
public class MetalsColorsPage extends WebPage {
    @FindBy(id = "form")
    public MetalsColorsForm metalsColorsForm;
    @FindBy(css = "info-panel-section li")
    public List<Label> logs;

    public boolean findLogLine(String query){
        for (Label line : logs){
            if(line.getText().contains(query)) {
                return true;
            }
        }
        return false;
    }

}
