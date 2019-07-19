package ex7.forms;

import com.epam.jdi.light.elements.complex.Droplist;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.complex.Checklist;
import com.epam.jdi.light.ui.html.complex.RadioButtons;
import ex7.entities.MetalsColors;

public class MetalsColorsForm extends Form<MetalsColors> {
    @FindBy(id = "odds-selector")
    public RadioButtons radioOdd;
    @FindBy(id = "even-selector")
    public RadioButtons radioEven;
    @FindBy(id = "elements-checklist")
    public Checklist elements;
    @JDropdown(
            root = "#colors",
            expand = "button",
            value = "li",
            list = "ul"
    )
    public Droplist colors;
    @JDropdown(
            root = "#vegetables",
            expand = "button",
            value = "li",
            list = "ul")
    public Droplist vegetables;
    @JDropdown(
            root = "#metals",
            expand = "button",
            value = "li",
            list = "ul")
    public Droplist metals;
    @FindBy (id = "submit-button")
    public Button submit;

    public void fill(MetalsColors dataSet){
        radioOdd.select(dataSet.getRadioOdd());
        radioEven.select(dataSet.getRadioEven());
        for(String elem : dataSet.getElements()){
            elements.select(elem);
        }
        for(String veg:dataSet.getVegetables()){
            vegetables.select(veg);
        }
        metals.select(dataSet.getMetal());
        colors.select(dataSet.getColor());
    }

    public void submit(){
        submit.click();
    }
}
