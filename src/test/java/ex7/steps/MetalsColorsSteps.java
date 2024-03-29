package ex7.steps;

import ex7.entities.MetalsColors;
import static ex7.JdiSite.metalsColorsPage;
import static org.testng.Assert.assertTrue;

// TODO I deon't get it. What is the reason of this class ? Why don't you encapsulate this calls in PO ? : done
public class MetalsColorsSteps {
    public static void fillForm(MetalsColors MCdata){
        metalsColorsPage.fillForm(MCdata);
    }

    // TODO The certain sequence of log's rows doesn't matter in this case. :
    //  findLogLine function does not count line sequence, and it's just checks, if every of necessary lines are present
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
            assertTrue(metalsColorsPage.findLogLine("Elements: "+data.getElements().toString().
                    replace("[","").replace("]","")));
        }
        if(!data.getVegetables().isEmpty()){
            assertTrue(metalsColorsPage.findLogLine("Vegetables: "+data.getVegetables().toString().
                    replace("[","").replace("]","")));
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
