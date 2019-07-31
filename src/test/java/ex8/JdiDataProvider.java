package ex8;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import ex7.entities.MetalsColors;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Map;

public class JdiDataProvider {
    private static final String PATH_TO_JSON = "src/test/resources/ex8DataSet.json";
    @DataProvider
    public Object[][] getDataSetFromJson() throws FileNotFoundException {
        JsonElement jsonElement = new JsonParser().parse(new FileReader(PATH_TO_JSON));
        Type jsonType = new TypeToken<Map<String, MetalsColors>>() {
        }.getType();
        Map<String, MetalsColors> dataSetFromJson = new Gson().fromJson(jsonElement, jsonType);
        Object[][] jsonDataSet = new Object[dataSetFromJson.size()][1];
        int i = 0;
        for (String key : dataSetFromJson.keySet()) {
            jsonDataSet[i][0] = dataSetFromJson.get(key);
            i++;
        }
        return jsonDataSet;
    }
}
