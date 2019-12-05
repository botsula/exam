package json;

import java.util.ArrayList;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {

    public ArrayList sJson;
    public JsonObject(JsonPair... jsonPairs) {
    }

    @Override
    public String toJson() {
        return sJson.toString();
    }

    public void addAll(JsonPair... jsonPairs){
        for (JsonPair pair: jsonPairs) {
            add(pair);
        }
    }

    public void add(JsonPair jsonPair){
        sJson.add(jsonPair);
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
