package json;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {

    public ArrayList<JsonPair> theJson;
    public JsonObject(JsonPair... jsonPairs) {
        this.theJson = new ArrayList<>();
        Collections.addAll(theJson, jsonPairs);
    }

    @Override
    public String toJson() {
        String fin = "";
        int counter = 0;
        for (JsonPair p : theJson) {
            if (counter > 0) fin += ",";
            fin += p.key + ":" + p.value.toJson();
            counter += 1;
        }
        return "{" + fin + "}";
    }

    public void add(JsonPair jsonPair) {
        theJson.add(jsonPair);
    }

    public Json find(String name) {
        // ToDo
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        return null;
    }
}
