package ex7.steps;

import ex7.entities.MetalsColors;

import static ex7.Defaults.defaultMCData;
import static ex7.JdiSite.metalsColorsPage;
import static org.testng.Assert.assertTrue;

// TODO I deon't get it. What is the reason of this class ? Why don't you encapsulate this calls in PO ?
public class MetalsColorsSteps {
    public static void fillForm(){
        metalsColorsPage.metalsColorsForm.fill(defaultMCData);
        metalsColorsPage.metalsColorsForm.submit();
    }

    // TODO The certain sequence of log's rows doesn't matter in this case.
    // It will be easier to compare just two List<strings>
    // First list you can generate from MetalsAndColors instance
    // Second list can be generated from Log ui-element
    public static void checkLogs(MetalsColors data){
        if(!data.getRadioEven().isEmpty()){
            int sum = Integer.parseInt(data.getRadioEven())+Integer.parseInt(data.getRadioOdd());
            assertTrue(metalsColorsPage.findLogLine("Summary: "+sum));
        }
        else{
            assertTrue(metalsColorsPage.findLogLine("Summary: 3"));
        }
        if(!data.getElements().isEmpty()){
            assertTrue(metalsColorsPage.findLogLine("Elements: "+data.getElements().toString()));
        }
        if(!data.getVegetables().isEmpty()){
            assertTrue(metalsColorsPage.findLogLine("Vegetables: "+data.getVegetables().toString()));
        }
        else{
            assertTrue(metalsColorsPage.findLogLine("Vegetables: Vegetables"));
        }
        if(!data.getColor().isEmpty()){
            assertTrue(metalsColorsPage.findLogLine("Color: "+data.getColor()));
        }
        else{
            assertTrue(metalsColorsPage.findLogLine("Color: Colors"));
        }
        if(!data.getMetal().isEmpty()){
            assertTrue(metalsColorsPage.findLogLine("Metal: "+data.getMetal()));
        }
        else{
            assertTrue(metalsColorsPage.findLogLine("Metal: Metals"));
        }
    }
}
