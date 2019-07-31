package ex7.forms;

import com.epam.jdi.light.elements.complex.Droplist;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.objects.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.complex.Checklist;
import com.epam.jdi.light.ui.html.complex.RadioButtons;
import ex7.entities.MetalsColors;

public class MetalsColorsForm extends Form<MetalsColors> {
    @FindBy(className = "radio")
    public RadioButtons radios;

    @FindBy(id = "elements-checklist")
    public Checklist elements;

    @JDropdown(root = "#colors", value = ".filter-option", list = "li", expand = ".caret")
    public Droplist colors;

    @JDropdown(root = "#salad-dropdown", value = ".dropdown-toggle", list = "li", expand = ".caret")
    public Droplist vegetables;

    @JDropdown(root = "#metals", value = "input", list = "li", expand = ".caret")
    public Droplist metals;

    @Css("#submit-button")
    public Button submit;

    public void fill(MetalsColors dataSet){
        radios.select(dataSet.getRadioOdd());
        radios.select(dataSet.getRadioEven());
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
